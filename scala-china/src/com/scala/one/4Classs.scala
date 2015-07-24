package com.scala.one

/**
 * @author John
 */
object Classs {
  
  
  def main(args: Array[String]): Unit = {
    
  }
}
/**
 * Scala缺省定义为 public 
 */
class CheckSum{
  private var sum = 0
  
  //注意的Scala的方法的参数都是val类型，而不是var类型，因此在函数体内不可以修改参数的值
  def add(b:Byte): Unit = sum += b
  //b = 1 sum += b  这样就会出错
  
  def checkSum(): Int = ~ (sum & 0xFF) + 1 
}