import java.util.Scanner
fun main()
{
//    val sc = Scanner(System.`in`)
//    print("Enter num1: ")
//    val a = sc.nextInt()
//    print("Enter num2: ")
//    val b = sc.nextInt()
//    val ans = sum(a,b) //function for addition of two number
//    println("The sum of $a and $b is $ans")
//    print(addition(a)) //default parameter function
    var m = 10
    var n = 20
    val ans = ::sum
    println(sum(m,n))
}
//fun sum(x:Int,y:Int):Int{
//    return x+y
//}
//fun addition(x:Int,y:Int=5):Int{
//    return x+y
//}
fun sum(x:Int,y:Int):Int{
    return x+y
}