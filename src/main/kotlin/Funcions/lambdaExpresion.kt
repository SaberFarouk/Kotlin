package org.example.Funcions

fun main() {

    val numbers = listOf(1,2,3,4,5)
    val oddNumbers = numbers.filter { it %2 != 0 }
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Numbers= $numbers"  )
    space()
    println("Odd Numbers = $oddNumbers")
    space()
    println("Even Numbers = $evenNumbers")
}
fun space (){ println("***********")}