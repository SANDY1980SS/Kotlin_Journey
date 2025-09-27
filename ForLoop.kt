import java.util.Scanner;
fun main() {
    val sc = Scanner(System.`in`)
    for (i in 1..5) // output 1,2,3,4,5
    {
        println(i)
    }

    println("<----------------------------------->")
    for (i in 1..5 step 2) //output 1,3,5
    {
        println(i)
    }
    println("<----------------------------------->")

    for (i in 1 until 6) //output 1,2,3,4,5
    {
        println(i)
    }
    println("<----------------------------------->")
    for (i in 5 downTo 1) //output 5,4,3,2,1
    {
        println(i)
    }
    print("Enter number: ")
    val num = sc.nextInt()
    for (i in 1..10)
    {
        println("$num * $i = ${num*i}")
    }
}