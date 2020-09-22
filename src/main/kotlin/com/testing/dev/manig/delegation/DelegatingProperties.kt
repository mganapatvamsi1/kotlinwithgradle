package com.testing.dev.manig.delegation

import kotlin.reflect.KProperty

class DelegatingProperties {
    var someProperty: String by ExternalFunctionality()
}

class ExternalFunctionality {
    var backupField = "normalDefault"
    operator fun getValue(delegatingProperties: DelegatingProperties, property: KProperty<*>): String {
        println(
            "getValue called with params: \n" +
                    "delegatingProperties: $delegatingProperties\n" +
                    "property: ${property.name}"
        )

        return backupField
    }

    operator fun setValue(delegatingProperties: DelegatingProperties, property: KProperty<*>, strValue: String) {
        backupField = strValue
    }
}

fun main() {
    val delegatingProperties = DelegatingProperties()
    println(delegatingProperties.someProperty)
    delegatingProperties.someProperty = "new sample test data"
    println(delegatingProperties.someProperty)

}
