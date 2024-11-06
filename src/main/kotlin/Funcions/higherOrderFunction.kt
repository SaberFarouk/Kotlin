package org.example.Funcions

fun main(){

//val result = applyOperation(5,6,{num1, num2 -> num1+num2})
//    println(result)

    //Example with out Higher Order Function
val numbers = listOf(1,2,3,4,5)
val doubled = mutableListOf<Int>()
for (n in numbers){
    if(n%2 ==0)
        doubled.add(n*2)

    }
 println(doubled)

// The same example with Higher Order Function
    val doubleNumbers = numbers.filter { it % 2 == 0 }.map  { it*2 }
    println(doubleNumbers)

}

fun applyOperation (x:Int, y:Int, operation:(Int,Int)->Int):Int{

    return operation(x,y)
}