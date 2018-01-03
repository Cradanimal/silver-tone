import java.io.InputStream
import java.io.File

var lim = "4"
var str = "1 2 4 5"
fun main(args: Array<String>) {
    val inputStream: InputStream = File("src/scratch").inputStream()

    val inputString = inputStream.bufferedReader().use { it.readText() }
    val arr = inputString.split(" ")
    val arr2 = mutableListOf<Any>(arr.joinToString(" "))
    val arr3 = arr2.reversed()
    print(arr3)
}


//for hackerRank
//import java.io.*
//import java.util.*
//
//fun main(args: Array<String>) {
//    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
//    var a = readLine()
//    val b : String? = readLine()?.reversed()
//    print(b)
//}