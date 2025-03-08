// public
// private
// protected
// internal

// A class can still be private and there is no need to match the name of the class and the file

fun main(args: Array<String>) {

    var helloWorld = HelloWorld("Umair Khan");

    println(helloWorld.firstName)



}

// Here the constructor keeps adding the fields and parameters to the constructors
// As a result we save ourselves of writing boiler plate code
class HelloWorld (var firstName: String){


}