package org.example.greeting

import org.gradle.api.NamedDomainObjectFactory
import org.gradle.internal.reflect.Instantiator

class NameFactory(val instantiator: Instantiator) : NamedDomainObjectFactory<Name> {

    override fun create(name: String?): Name {
        return instantiator.newInstance(Name::class.java, name)
    }


}