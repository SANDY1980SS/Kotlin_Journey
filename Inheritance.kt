fun main(){
    val algebra = Algebra()
    print("Enter num1: ")
    val num1 = readln().toInt()
    print("Enter num2: ")
    val num2 = readln().toInt()
    println(algebra.name1)
    println(algebra.name2)
    println(algebra.method1())
    println(algebra.method2(num1,num2))
}
open class Mathematics{
    var name1 : String = "I am Maths baby"
    fun method1(){
        println("I am very difficult")
    }
}
class Algebra : Mathematics(){
    var name2 : String = "I am Algebra"
    fun method2(x:Int,y:Int):Int{
        return x+y
    }
}