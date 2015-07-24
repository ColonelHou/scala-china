package com.scala.one

/**
 * @author John
 */
object While {
  
  
  def main(args: Array[String]): Unit = {
    
  }
  
  /**
   * 计算最大公倍数
   * 推荐尽量避免在代码使用while循环 正如函数化编程要避免使用var变量一样
   */
  def maxNum(x : Long, y : Long): Long = {
    var a = x
    var b = y
    while(a != 0){
      var tmp = a
      a = b % a
      b = tmp
    }
    b
  }
  
  def gcd (x :Long, y:Long) :Long =
   if (y ==0) x else gcd (y, x % y)

  
}