package org.example.greeting

import org.gradle.api.Action
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class Greeting : DefaultTask() {

    var message: String? = null
    var recipient: String? = null

//    var ext: GreetingExtension = GreetingExtension("")

    @TaskAction
    fun sayGreeting() {
        print("Hello! $message, $recipient")
//        print("Hello ${ext.name}! $message, $recipient")
    }

//    fun greeting(action:Action<in GreetingExtension>){
//        action.execute(ext)
//    }
}