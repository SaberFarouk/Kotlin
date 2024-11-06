package org.example

fun main(){
    /*print("Enter Any Number: ")
    var num = readln().toInt()
    if (num >= 0){
        print("The number is positive")
    } else print("The number is negative")*/
//Example 2
    var semester =2
    print("Enter score: ")
    val score= readln().toInt()

    if (score > 100 || score < 0) {
        println("Score is invalid")
       }
    if (score >=60) {
        println("Pass")

        val grade:String
        if (score >= 90) grade = "A+"
         else if (score >= 85) grade = "A"
         else if (score >= 70) grade ="B"
         else   grade = "C"

        println("Grade: $grade")
        semester++
        println("Your semester = $semester")
    } else println ("Failed")





}


