import java.math.BigDecimal


fun main(args: Array<String>) {


    var i = 15;

    when(i) {

        10 -> println("I is very small")
        12 -> println("I is a bit more")
        14, 15 -> println("I is a median value")
        20 -> println("I is maximum!")



    }

    var someValue : Any =  "This is it"

    // Here we can check if the string for the typ
    when(someValue) {

        is String -> println("some value is stirng")
        is BigDecimal -> println("some value is big decimal")
        is Float -> println("this is float")


    }

}