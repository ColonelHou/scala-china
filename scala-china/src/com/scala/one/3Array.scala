package com.scala.one

/**
 * @author John
 */
object Three {
  
  
  
  def main(args: Array[String]): Unit = {
    
    
  }
  
  //Scala使用[]来为数组指明类型化参数
  def defineArr(): Unit = {
    //定义1
    val greeting = new Array[String](3)
    //Scala中，数组和其它普遍的类定义一样，没有什么特别之处，当你在某个值后面使用（）时，
    //Scala将其翻译成对应对象的apply方法
    //greetStrings(1) 其实调用greetString.apply(1)方法
    greeting(0) = "Hello"
    greeting(1) = "world"
    greeting.update(0, "HELLO")
    
    //定义2
    val greetingT = Array("hello", "world")
    val greetStrings =Array.apply("Hello",",","World\n")

  }
}