package org.example.Funcions
//Default vs Named Arguments

fun main(){
greet("Saber" )

    creatProduct("New Shoes", price = 150.5)

}

fun creatProduct(name : String,price :Double,discount:Double=0.0,category:Int=1)  {
    println("Product names $name,price= $price,discount= $discount,category = $category")
}

