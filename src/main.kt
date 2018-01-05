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



object Solution {

    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val array = IntArray(scan.nextInt())
        for (i in array.indices) {
            array[i] = scan.nextInt()
        }
        scan.close()

        for (i in array.size - 1 downTo -1 + 1) {
            print(array[i].toString() + " ")
        }
    }
}