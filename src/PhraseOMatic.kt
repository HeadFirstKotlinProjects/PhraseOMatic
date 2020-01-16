import kotlin.random.Random

fun main(){
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted", "caboquinho")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size

    val rand1 = Random.nextInt(0,4)
    val rand2 = Random.nextInt(0,4)
    val rand3 = Random.nextInt(0,4)

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"

    println(rand1)
    println(rand2)
    println(rand3)
    println(phrase)
}