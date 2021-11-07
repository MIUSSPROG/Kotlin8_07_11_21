import java.lang.Exception

fun checkAge(age: Int): Int{
    if(age < 1 || age > 110) throw  Exception("Invalid value $age. Age must be greater than 0 and less than 110")
    println("Age $age is valid")
    return age
}

fun test(a: Int, b: Int) : Any {
    return try {
        a/b
        //println("The Result is: "+ a / b)
    }
    catch(e:Exception){
        println(e)
        "Divide by zero not allowed"
    }
}


class Person(val name: String?)

fun Int.square() : Int{
    return this*this
}

fun String.wordCount(c: Char) : Int{
    var count = 0
    for(n in this){
        if(n == c) count++
    }
    return count
}

fun main() {
//    try {
////        val x: Int = 0
////        val z: Int = 0 / x
////        println("z = $z")
//        val nums = arrayOf(1, 2, 3, 4)
//        println(nums[6])
//    }
//    catch (ex: ArrayIndexOutOfBoundsException){
//        println(ex)
//    }
//    catch (ex: ArithmeticException){
//        println(ex)
//    }
//    catch (e: Exception){
//        println(e)
//        for (line in e.stackTrace){
//            println("at $line")
//        }
//    }
    //____________________-
//    try {
//        val checkedAge1 = checkAge(5)
//        val checkedAge2 = checkAge(-115)
//    } catch (e: Exception) {
//        println(e.message)
//    }
//    val checkedAge1 = try {
//        checkAge(5)
//    } catch (e: Exception) { null }
//    val checkedAge2 = try {
//        checkAge(-125)
//    } catch (e: Exception) { null }
//    println(checkedAge1)    // 5
//    println(checkedAge2)

//    var result1 = test(10, 2) //execute try block
//    println(result1)
//    var result = test(10, 0)   // execute catch block
//    println(result)

//    try {
//        val a: Int = 10
//        val b: Int = 0
//        println("Division of $a and $b results in: ${a/b}")
//    }
//    finally {
//        println("Finally block is always executed.")
//    }

//    val n: Int? =  null
//    println(n)
//    var age: Int? = null
//    var name: String? = null
//    name = "Ivan"
//    println("$name $age")

//    var bob = Person("Bob")
//    var tom: Person? = bob
//    var message: String? = null
//    val hello: String = message ?: "default"
//    println(hello)

//    var message : String? = null
//    val length: Int? = message?.length
//    println(length)

//    val message : String?  = "Hello"
//    val length: Int = message?.length ?: 0

//    var tom: Person? = Person(null)
//    val tomName: String? = tom?.name?.uppercase()
//    println(tomName)

//    try {
//        val name : String?  = null
//        val id: String = name!!
//        println(id)
//    } catch (e: Exception) { println(e)}

//    println(4.square() + 2.square())
//    println("hello world".wordCount('o'))
}