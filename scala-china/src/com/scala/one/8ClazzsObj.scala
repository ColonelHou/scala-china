package com.scala.one

/**
 * @author John
 */
class Rationals(nn: Int, dd: Int) {
  
  //辅助构造函数,除主构造函数之外的构造函数都称为辅助构造函数
  //这样使得每个构造函数最终都会调用主构造函数，从而使得主构造函数称为创建类单一入口点。
  //在Scala中也只有主构造函数才能调用基类的构造函数，这种限制有它的优点，使得Scala构造函数更加简洁和提高一致性。
  def this(nn: Int) = this(nn, 1)
   
  require(dd != 0)
  
  val number = nn
  
  val denom = dd
  
  private val g = gcd(nn.abs, dd.abs)
  
  override def toString = number + " / " + denom
  
  /*//编译错误:但对于that来说，无法使用that.d 来访问d.因为that 不在定义的类可以访问的范围之内。
  //此时需要定类的成员变量。
  def add(that: Rationals): Rationals = {
    new Rationals(n * that.d + that.n * d, d * that.d)
  }*/
  
  //def */+/-/// (that: Rationals): Rationals = {
  def add(that: Rationals): Rationals = {
    new Rationals(number * that.denom + that.number * denom, denom * that.denom)
  }
  
  /**
   * 自身引用
   */
  def lessThan(that: Rationals) = this.number * that.denom < that.number * this.denom
  
  def max(that: Rationals) = if(lessThan(that)) that else this
  
  /**
   * 私有成员变量和方法
   * 使用一个求分子和分母的最大公倍数的私有方法gcd。同时我们使用一个私有变量g来保存最大公倍数,
   */
  private def gcd(a: Int, b: Int): Int = {
    if(b == 0)
      a
    else
      gcd(a, a % b)
  }
}

object test{
  def main(args: Array[String]): Unit = {
    val one = new Rationals(1, 2)
    val two = new Rationals(2, 3)
    println(one add two)
    println(one lessThan two)
  }
}