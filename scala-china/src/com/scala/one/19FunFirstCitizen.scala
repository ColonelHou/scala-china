package com.scala.one

/**
 * @author John
 * 
 * 
 * 函数–头等公民
 */

object FunFirstCitizen {

  def main(args: Array[String]) : Unit = {
    var increase = (x : Int) => x + 1
    println(increase(2))//3
    
    var in = (x : Int) => {
      println("---------start")
      println("---------end")
      x + 1}
    println(in(4))
    
    val someNum = List(1, 2, 23, -90, 45)
    someNum.foreach((x : Int) => println(x))
    
    val someNums = someNum.filter(x => x > 0)//List(1, 2, 23, 45)
    println(someNums)
  }
}