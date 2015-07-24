package com.scala.summary

/**
 * @author John
 */
object PassParam {
  
  
  def main(args: Array[String]): Unit = {
    println(a0(max, 10, 11))
  }
  
  def max(a: Int, b: Int): Int = {
    if(a < b) return b else return a
  }
  
  def a0(v:(Int, Int) => Int, a: Int, b: Int): Int = {
    return v(a, b) * 3
  }
}