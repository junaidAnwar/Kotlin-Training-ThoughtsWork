import java.io.FileReader
import java.util.*

fun main(args: Array<String>) {
    val wordcount = HashMap<String, Int>()
    val filePath = "G:\\Code\\Kotlin\\kotlin-training-scratchpad\\src\\main\\resources\\word-count.txt"
    FileReader(filePath)
            .forEachLine { line ->
                line.split(" ")
                        .forEach {
                            w -> wordcount.put(w, wordcount.getOrDefault(w, 0)+1)
                        }
            }
    println(wordcount)

}