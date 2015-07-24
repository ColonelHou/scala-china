package com.scala.one

/**
 * @author John
 */
object ZX {
 
  
  
  /**
   * 和List不同的Tuples可以包含不同类型的数据，
   */
  def main(args: Array[String]) : Unit = {
    val pair = (99, "John", "tom", "lucy")
    println(pair._1)
    println(pair._2)
    println(pair._3)
    println(pair._4)
    
  }
}