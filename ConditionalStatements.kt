import java.util.Scanner
fun main() {
//    val a = 16
//    val b = 8
//    if(a>b)
//    {
//        print("$a is greater then $b")
//    }
    val reader = Scanner(System.`in`)
    print("Enter your marks: ")
    val b = reader.nextInt()
    if (b > 90) {
        println("First Division")
    } else if (b >= 75 && b <= 90) {
        println("Second Division")
    } else if (b >= 33 && b < 75) {
        println("Third Division")
    } else {
        println("Fail")
    }

}