fun main()
{
    val obj = Employee()
    println("Employee name is ${obj.name}")
    println("Employee age is ${obj.ageOfEmployee()}")
    println("Employee phone number is ${obj.phone_no}")
    println("Employee's company name is ${obj.company}")
    obj.work()

    val obj1 = Boss()
    println(obj1.boss_name)
    obj1.instruction()

}
class Employee()
{
    var name: String = "Shadab"
    var age: Int = 20
    var phone_no: Long = 9597305538
    var company: String = "Google"

    fun work(){
        println("Work in Afternoon")
    }
    fun ageOfEmployee():Int{
        return age
    }
}
class Boss{
    val boss_name:String = "Aman"

    fun instruction()
    {
        println("Do your job")
    }
}