package com.scala.one

/**
 * @author John
 */
object TwoFun {
  
  
  def main(args: Array[String]): Unit = {
    println(max(6, 8))
    
    var arr: Array[String] = Array("Hello", "World")
    whiles(arr)
    fors(arr)
    
  }
  
  def fors(args: Array[String]): Unit = {
    println("--------------args.foreach(ar => println(ar))----------")
    args.foreach(ar => println(ar))
    
    println("--------------args.foreach(println)----------")
    args.foreach(println)
    args.foreach(println _)
    
    println("--------------for(arg <- args)----------")
    //< – 在Scala中称为“生成器 (generator)”
    for(arg <- args){
      println(arg)
    }
    
    //0 to 2, 其实为（0）.to(2) 调用的为整数类型的 to方法
    //实际上Scala中表达式 1+2 ,最终解释为(1).+(2) +也是Int的一个方法
    println("--------------for(i <- 1 to 3)----------")
    for(i <- 1 to 3){
      println(i)
    }
  }
  
  def whiles(args: Array[String]) : Unit = {
    println("--------------whiles-----------")
    var i=0
    while (i < args.length) {
      println (args(i))
      //Scala不支持　＋＋i,i++ 运算符
      i+=1
    }
  }
  
  def max(x: Int, y: Int): Int = {
    if(x > y)
      x
    else
      y
  }
}