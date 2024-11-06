package org.example.Funcions
// inline function تستخدم لتحسين اداء عند عمل call function
// وتستخدم في function الصغيرة
fun main(){

    greet("Saber")

    val list = listOf(1,2,3,4,5)
    processNumbers(list,{println(it)})
}

inline fun greet(name:String){
    println("Hello $name")
}

inline fun processNumbers(numbers:List<Int>, action:(Int)->Unit){
    for (number in numbers){
        action(number)
    }

}
