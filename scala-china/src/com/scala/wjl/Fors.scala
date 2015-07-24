package com.scala.wjl

/**
 * @author John
 */
object Fors {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 2; j <- 1 to 2)
      print((100*i + j) + " ")
    println
    //在spark中非常常见
    for(i <- 1 to 2; j <- 1 to 2 if i != j)
      print((100 * i + j) + " ")
    println
    def addA(x : Int) = x + 100
    //无名函数
    val add = (x : Int) => x + 100
    println(addA(2))
    println(add(2))
    def combine(content : String, left: String = "[", right: String = "]") = left + content + right
    println(combine("I Love Spark"))
    def connected(args: Int*) = {
      var result = 0
      for(arg <- args) result += arg
      result
    }
    println(connected(1,2,3,4,5))
  }
}