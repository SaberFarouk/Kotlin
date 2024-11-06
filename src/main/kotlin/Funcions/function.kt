package org.example.Funcions

fun main(){
   /* print3()
    println("//////////////////////")
    print3()*/
/*println("Enter your name: ")
val name = readln().toString()
    println("Enter your age: ")
    val age = readln()?.toString()
    emp(name,age.toString() )*/

  // println("${multi(3,5,10)}")
    /*val res= sum(5,7)
    println(res)*/
val num1=5;
val num2=6;
    println("by = ${by(num1,num2)}")

}

fun print3(){
    println("Hello World")
    println("Hello World")
    println("Hello World")
}

fun emp(name:String,age:String):Unit{
    println("Name: $name Age is $age")
}

fun sum(num1:Int,num2:Int):Int{

    return num1+num2
}

fun cricle(radius:Double):Double{
    val pi=3.14
    return 2*pi*radius*radius
}

fun multi (num1:Int,num2:Int,num3:Int):Int{
    val res = sum(num1,num2)
    return sum(num1,num2) *num3
}

fun by (num1:Int, num2:Int):Int = num1*num2



