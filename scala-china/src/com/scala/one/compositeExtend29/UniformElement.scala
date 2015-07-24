package com.scala.one.compositeExtend29

/**
 * @author John
 */
class UniformElement(ch : Char, override val weight : Int, override val height: Int) extends Element {
  
  
  private val line = ch.toString * weight
  
  def contents = Array.fill(height)(line)
}

object TT {
  def main(args: Array[String]): Unit = {
    val e1 = new ArrayElement(Array("hello", "world"))
    val ae : ArrayElement = new LineElementArray(Array("hello"))
    val e2 = ae
    val e3 : Element = new UniformElement('x', 2, 3)
  }
}