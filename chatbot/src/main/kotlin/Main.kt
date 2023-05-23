package bot

import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")
    print(">")
    val name = scanner.nextLine()

    println("What a great name you have, " + name + "!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    // reading all remainders
    print(">")
    val remainder3 = readln().toInt()
    print(">")
    val remainder5 = readln().toInt()
    print(">")
    val remainder7 = readln().toInt()

    var age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
    println("Now I will prove to you that I can count to any number you want.")
    print(">")
    val n = readln().toInt()
    for(i in 0..n){
        println("$i!")
    }
  //  println("Completed, have a nice day!")
    test()
}
fun test() {
    println("Let's test your programming knowledge.")
    // write your code here
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")
    while (true){
    val a = readln().toInt()
    when (a) {
        1 -> {
            println("Please, try again.")
            continue
        }

        2 -> {
            end()
            break
        }

        3 -> {
            println("Please, try again.")
            continue
        }

        4 -> {
            println("Please, try again.")
            continue
        }

             }
         }
     }


fun end() {
    println("Congratulations, have a nice day!") // Do not change this text

}