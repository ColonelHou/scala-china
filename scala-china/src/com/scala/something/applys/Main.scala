package com.scala.something.applys

/**
 * @author John
 */
object Main {
  
  
  def main(args: Array[String]): Unit = {
    ApplyDemo.stat
    
    //类名后面加括号，相当于调用伴生对象的apply方法
    /*val a = ApplyDemo() 
    a.test
    //对象加括号相当于调用对象的apply方法
    println(a)*/
    
    val b = ApplyDemo.apply()
    b.test
    
    for(i <- 0 until 10){
      ApplyDemo.incr
    }
    
    println(ApplyDemo.count)
    Console println 20
  }
}