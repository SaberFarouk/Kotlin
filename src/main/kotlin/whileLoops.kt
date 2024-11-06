package org.example

fun main(){
    /*var count=1
    while (count <5){
        println(count)
        count++
    }*/

   val sercretNumber =(1..10).random() //
    println("Enter Number")
    println(sercretNumber)
    var guess = readln().toInt()
    if(sercretNumber==guess) println("Good")
    while(sercretNumber!=guess){
        println("Try Again")
        guess = readln().toInt()
        if(sercretNumber==guess) println("Good")

    }


}