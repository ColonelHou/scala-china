package com.scala.one

/**
 * @author John
 */


/**
 * 类参数和构造函数，方法，操作符，私有成员，重载，过载，条件检查，引用自身。
 */
object ClazzObj {
  def main(args: Array[String]): Unit = {
    val r = new Rational(2, 4)
    println(r.toString())
    //var rr = new Rational(4, 0)
  }
}
/**
 *定义Rational
 *
 */
class Rational(n: Int, d: Int){
  require(d != 0)//scala解决分母不是0的问题
  println("Created " + n + " / " + d)
  //重新定义类的toString 方法
  override def toString() = n + " / " + d
}