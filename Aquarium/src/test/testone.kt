package test

import java.sql.DriverManager.println

class testone {

    fun main(){
        var thread=Thread {
            println("${Thread.currentThread()} has run")
        }
        thread.start()
    }
}