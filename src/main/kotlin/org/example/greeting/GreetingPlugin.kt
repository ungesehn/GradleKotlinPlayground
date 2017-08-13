package org.example.greeting

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin : Plugin<Project> {

    override fun apply(project: Project) {

//        val greetingExtension = project.extensions.create("greeting", GreetingExtension::class.java)
//        greetingExtension.name = "Hans"

        project.tasks.create("hello", Greeting::class.java, { task ->
            task.message = "Hello"
            task.recipient = "World"
        })

    }


}