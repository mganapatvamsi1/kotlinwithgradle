package com.testing.dev.manig.classes

class DirectoryExplorer(val user: String) {

   inner class testingAccessiblity() {
        fun check() {
            if (!user.equals("rajAryan")) {

            }
        }
    }

    class PermissionCheck() {
        fun validatePermission() {

        }
    }

    fun listFolder(folder: String, user: String) {
        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission()
    }

}

fun main() {
    val directoryExplorer = DirectoryExplorer("maniG")

    val permissionCheck = DirectoryExplorer.PermissionCheck()
    val testingAccessiblity = DirectoryExplorer("malhotra").testingAccessiblity()


}

/* Inner classes are like instances to classes in kotlin. */