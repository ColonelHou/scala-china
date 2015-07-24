package com.scala.wjl

/**
 * @author John
 */
object Zip {
  def main(args: Array[String]) {
    val symbol = Array("[", "-", "]")
    val counts = Array(2, 4, 3)
    val thr = Array(3, 3, 3)
    //Array(([,2), (-,4), (],3))
    val pairs = symbol.zip(counts)
    val pairss = pairs.zip(thr)
    for((x, y) <- pairss)
      print(x + " ========> " + y + "\t")
    for((x, y) <- pairs)
      //[[----]]]
      Console.print(x * y)
      //Console.println(x +" - " + y)
  }
}