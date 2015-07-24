package com.scala.one

/**
 * @author John
 * 
 * 柯里化是把接受多个参数的函数变换成接受一个单一参数（最初函数的第一个参数）的函数，
 * 并且返回接受余下的参数而且返回结果的新函数的技术。
 */
object FunKelihua {
  
  
  def main(args: Array[String]): Unit = {
    
    
    println(CurryingFun(4)(6))
    
    val fir = CurryingFun(4)_
    val sec = fir(6)
    println(sec)//10
    
    val second = sepaCurryFun(5)
    println(second)//<function1>
    println(second(2))//7
  }
  
  /**
   * 普通函数
   */
  def normalFun(x: Int, y: Int) = x + y
  
  /**
   * 柯里化
   * 下面在使用“柯里化”技术来定义这个加法函数，原来函数使用一个参数列表，“柯里化”把函数定义为多个参数列表
   * 调用curriedSum (1)(2)时，实际上是依次调用两个普通函数（非柯里化函数）
   */
  def CurryingFun(x: Int)(y: Int) = x + y
  
  /**
   * 第一次调用使用一个参数x，返回一个函数类型的值，第二次使用参数y调用这个函数类型的值，
   * 我们使用下面两个分开的定义在模拟curriedSum柯里化函数：
   */
  def sepaCurryFun(x: Int) = (y: Int) => x + y
}