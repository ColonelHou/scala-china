package com.scala.one

/**
 * @author John
 * 
 * 
 * 
 * 如果代码中含有var类型的变量，这段代码就是传统的指令式编程，如果代码只有val变量，
 * 这段代码就很有可能是函数式代码，因此学会函数式编程关键是不使用vars来编写代码。
 */
object FunPrograme {
  
  
  
  /**
   * Scala编程的一个基本原则上，能不用Vars，尽量不用vars,能不用mutable变量，
   * 尽量不用mutable变量，能避免函数的副作用，尽量不产生副作用。
   */
  def main(args: Array[String]) : Unit = {
    
  }
  
  def javaPrograme(args : Array[String]): Unit = {
    var i = 0
    while(i < args.length)
    {
      println(i)
      i += 1
    }
  }
  
  def scalaPrograme(args : Array[String]): Unit = {
    args.foreach(println)
    
    args.foreach(arg => println(arg))
    for(arg <- args)
      println(arg)
  }
}