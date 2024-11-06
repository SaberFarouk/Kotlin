package org.example

fun main(){
//var count = 5
//    do {
//        println("Count = $count")
//        count++
//    }while(count<5)

    val secretNumber =(1..10).random()
    var count = 1
    var guess:Int
    println(secretNumber)
    println("Enter Number")
     guess = readln().toInt()

    do{
        if (count>1) println("try again")
        println("Guess a number")
        guess = readln().toInt()
        count++


    }while(count <=3 && guess!=secretNumber)

    if (guess==secretNumber) println("Winner")
    else println("Fail")
}
