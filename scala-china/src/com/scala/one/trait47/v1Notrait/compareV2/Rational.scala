package com.scala.one.trait47.v1Notrait.compareV2

/**
 * @author John
 * 
 * 
 * Scala对于比较这种常见的操作，提供了Ordered Trait定义，使用它，
 * 你可以把所有的比较运算的代码使用一个compare定义来替代。
 * 这个ordered trait可以让需要实现比较运算的类，通过和Ordered特质“融合”，
 * 而只需实现一个compare方法即可。
 */
class Rational(n:Int, d:Int) extends Ordered[Rational] {
  override def compare(that: Rational): Int = {
    //(this.num * that.deamon ) - (this.num * that.deamon ) 
    0
  }
}