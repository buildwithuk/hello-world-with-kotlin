

fun main(args: Array<String>) {


    println("This is stepped range")
    // Define the range
    var intRange = 1..10

    // To add the step use the below
    for (i in intRange.step(5)) {
        println(i)
    }
    println("Stepped range ends here")

    print("Below is the reversed range")
    // Now to reverse the range
    for(i in intRange.reversed()) {
        println(i)
    }
    println("Reversed range ends here")

    println("Below is unusually high range")
    for (i in intRange step 10) {
        println(1)
    }
    println("Unusually high range ends here")

    println("Below is the down to range")

    for (i in  10 downTo 1 step 5) {
        println(i)

    }

    var string = "Hello world"

    println("Below is how to iterate over string")
    for(i in 0..string.length -1) {
        println(string[i])
    }

    println("Iteration over string ends here")
    println("Down to range ends here")


    // Iterating over the strings
    var stringsArray = arrayOf("one", "two", "three", "four", "five")

    println(stringsArray.javaClass)
    for(i in stringsArray.indices) {


        println("Index ${i} for the strings: ${stringsArray[i]}")


    }

    println("Iteration over the array ends here")

    println("Another way of iteration over the arrays is as belows")

    stringsArray.forEach { println(it) }
    stringsArray.forEachIndexed { index, value -> println("Item is ${index} at the index ${value}") }

    var characterRange = 'A'..'Z'

    var stringRange = "ABC".."XYZ"


    var intRangeWithStep = 1..5
    intRangeWithStep.step(5)


    var intBackendRange = 5.downTo(1)

    println(intRangeWithStep)


    println(stringRange)


    println(intRange)

}