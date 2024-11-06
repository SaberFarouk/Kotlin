package org.example.Exception

import java.io.IOException

// two types for exception 1-checked exception  appear in compile time
// 2-unchecked exception appear in run time
fun main() {
    /*try{
        val result = riskOperation()
    }catch (e: Exception){
        println("An error occurred $e.message")

    }*/

    try {
        val data = fetchDataFromServer()
    } catch (e:IOException){
        println("An error Occurred ${ e.message}")
    } finally {
        closeConnction()

    }        // finally بتنفذ سواء حصل Exception or not
}

fun riskOperation(){
    println("Risk operation")
    throw Exception("An error occurred")
}

fun closeConnction(){
    println("Close connection")
}

fun fetchDataFromServer():String{
    throw IOException("Sever Unreachable")
    return "Server Response"

}