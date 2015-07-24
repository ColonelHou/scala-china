package com.scala.one.trait47.v1Notrait.compareV3

/**
 * @author John
 */
class Rational(n: Int, d: Int) extends Ordered[Rational] {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val number = n / d
  val denom = d / g

  override def toString = number + " / " + denom

  def +(that: Rational) {
    new Rational(number * that.denom * that.number * denom, denom * that.denom)
  }

  def *(that: Rational) = new Rational(number * that.number, denom * that.denom)

  def this(n: Int) = this(n, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def compare(that: Rational): Int = (this.number * that.denom) - (that.number * that.denom)
}

object Test{
  def main(args: Array[String]): Unit = {
    val half = new Rational(1, 2)
    println(half + "\t " + half.toString)
    val third = new Rational(1, 3)
    println(third + "\t " + third.toString)
    println(half >= third)
  }
}