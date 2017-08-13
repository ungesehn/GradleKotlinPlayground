package org.example.greeting

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.internal.reflect.Instantiator
import org.gradle.invocation.DefaultGradle

class GreetingPlugin : Plugin<Project> {

    override fun apply(project: Project) {

        val instantiator = (project.gradle as DefaultGradle).services.get(Instantiator::class.java)
        val container = project.container(Name::class.java, NameFactory(instantiator))

        project.extensions.create("someNames", NameExtension::class.java, container)

        project.afterEvaluate {
            project.tasks.create("name", NameTask::class.java, { task ->
                val nameExtension = project.extensions.getByType(NameExtension::class.java)
                val firstUser = nameExtension.names?.filterNotNull()!!.first()
                task.firstName = firstUser.firstName
                task.lastName = firstUser.lastName
                task.gender =firstUser.gender
            })
        }
    }

}