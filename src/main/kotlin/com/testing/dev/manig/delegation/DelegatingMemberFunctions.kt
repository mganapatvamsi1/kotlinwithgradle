package com.testing.dev.manig.delegation

import com.testing.dev.manig.classes.Customer1

interface Repository {
    fun getById(id: Int): Customer1
    fun getAll(): List<Customer1>
}

interface Logger {
    fun logAll()
}

// 'by' means delegate the functionality of Repository to the instance being passed in.
class Controller(repository: Repository, logger: Logger): Repository by repository, Logger by logger {

    fun index(): String {
        getAll()
        getById(0)
        logAll()

        return ""
    }

}