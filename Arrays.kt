fun main()
{
    val arr1 = arrayOf(10,20,30,40,50)
    print(arr1.joinToString())

    println()
    val arr2 = arrayOf(1,52,9,12,65)
    for(i in arr2){
        println(i)
    }
    var arr3 = arrayOf("Physics","Chemistry","Maths","Biology")
    for (j in arr3)
    {
        println(j)
    }

    arr3.set(3,"Java") //updating the values in Array
    arr3.set(1,"Kotlin")

    println("Element at index 3 in arr3 is ${arr3[3]}") //access the single element
    println("Element at index 1 in arr3 is ${arr3.get(1)}") //access the single element
}