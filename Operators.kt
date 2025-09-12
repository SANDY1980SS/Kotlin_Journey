fun main()
{
    var a  = 15
    val b  = 5
    println("The sum of $a and $b = ${a+b}")
    println("The subtrction of $a and $b = ${a-b}")
    println("The multiplication of $a and $b = ${a*b}")
    println("The devision of $a and $b = ${a/b}")
    println("The modulus of $a and $b = ${a%b}")

    a += 10
    println(a)

    val i = 40
    val j = 41
    if(i>j) //Relational Operator can give the answer in true or false
    {
        println("Number $i is greater then $j")
    }
    else{
        print("Number $j is greater then $i")
    }
}