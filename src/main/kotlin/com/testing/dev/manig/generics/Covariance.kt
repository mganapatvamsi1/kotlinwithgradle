package com.testing.dev.manig.generics

import com.testing.dev.manig.classes.Customer1

open class Person

class Employee: Person()

fun operate(person: List<Person>) {

}

interface ReadOnlyRepo<out T> {
    fun getId(id: Int): T
    fun getAll(): List<T>
}

interface ReadWrite<in T> {
    fun save(obj: T)
    fun saveAll(list: List<T>)
}

fun main() {

    operate(listOf<Employee>())
    operate(listOf<Person>())

    val readOnly = ReadOnlyRepoImpl<Customer1>()

}