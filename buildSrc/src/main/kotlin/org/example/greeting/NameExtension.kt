package org.example.greeting

import groovy.lang.Closure
import org.gradle.api.NamedDomainObjectContainer

open class NameExtension {

    var name: String = "default name"

    constructor(name: String) {
        this.name = name
    }

    constructor(names: NamedDomainObjectContainer<Name>) {
        this.names = names
    }

    var names: NamedDomainObjectContainer<Name>? = null

    fun names(closure: Closure<Any>) {
        names?.configure(closure)
    }

}