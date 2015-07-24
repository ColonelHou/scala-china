package com.scala.express

/**
 * @author John
 */
object Some {
  
  
  def main(args: Array[String]): Unit = {
    //println("HelloWoHrld".distinct)
    println(a0(max(3, 4)))
    println(b0(max(3, 4)))
  }
  
  def max(a: Int, b: Int): Int = {
    if( a > b) return a else return b
  }
  
  // 下面的例子中，max会在t0中求值，而不是求值后把结果作为参数传进去，
  // 也就是延迟求值，即call-by-name
  def a0(v: => Int): Int = {
    return v * 3
  }
  
  // 下面的例子中，max会求值后再传给t0，即call-by-value
  def b0(v: Int) : Int = {
    return v * 3
  }
}