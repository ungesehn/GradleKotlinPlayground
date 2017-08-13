package org.example.greeting

open class Name(var name: String) {

    var firstName: String = ""
    var lastName: String = ""

    var gender : Gender = Gender.UNKNOWN

}

enum class Gender {
    MALE, FEMALE, UNKNOWN
}
