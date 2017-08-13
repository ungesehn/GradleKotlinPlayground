package org.example.greeting

import org.gradle.api.Action
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class Greeting : DefaultTask() {

    var message: String? = null
    var recipient: String? = null
    var ext: CustomName = CustomName("")

    @TaskAction
    fun sayGreeting() {
        print("Hello ${ext.customName}, $recipient.")
    }

    fun user(action: Action<in CustomName>) {
        action.execute(ext)
    }
}