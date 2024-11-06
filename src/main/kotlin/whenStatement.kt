package org.example

fun main(){
    print("Enter month number: ")
    val monthNo:Int = readln().toInt()
    /*when (monthNo) {
        1->println("January")
        2->println("February")
        3->println("March")
        4->println("April")
        5->println("May")
        6->println("June")
        7->println("July")
        8->println("August")
        9->println("September")
        10->println("October")
        11->println("November")
        12->println("December")
        else-> println("Invalid Input")
    }*/
    //
    when (monthNo) {
        1->{
            println("January")
            println("First month")
        }
        2->{
            println("February")
            println("Last month")
        }
        3->{
            println("March")
            println("Third month")
        }
        4->{
            println("April")
            println("Fourth month")
        }
        5->println("May")
        6->println("June")
        7->println("July")
        8->println("August")
        9->println("September")
        10->println("October")
        11->println("November")
        12->{
            println("December")
            println("Last Month")
        }
        else-> {
            println("Invalid Input")
            println("Try again")
        }
    }

    when(monthNo){
        12,1,2->println("Winter")
        3,4,5->println("Spring")
        6,7,8->println("Summer")
        9,10,11-> println("Fall")
    }

    val season = when(monthNo){
        12,1,2->("Winter")
        3,4,5->("Spring")
        6,7,8->("Summer")
        9,10,11-> ("Fall")
        else-> "Invalid"
    }
    println("Season is $season")
}