package com.testing.dev.manig.generics

import com.testing.dev.manig.classes.Customer1
import java.io.Serializable

open class Entity(val id: Int)

// in kotlin this "T" could be anything including null i.e., (Any?)
// "Any" means non-nullable object of any type
class Repository<T: Entity> {
    fun save(entity: T) {
        if (entity.id != 0) {
            //.. ...
            println("id = ${entity.id}")
        }
    }
}

fun <T: Serializable> streamObject(obj: T) {

}

fun main() {
    val repo = Repository<CustomerEntity>()

}

class CustomerEntity(id: Int) : Entity(id) {

}
