package org.example.greeting

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class NameTask : DefaultTask() {

    var firstName = ""
    var lastName = ""
    var gender = Gender.UNKNOWN

    @TaskAction
    fun sayGreeting() {
        print("Hello $firstName $lastName ($gender)")
    }

}