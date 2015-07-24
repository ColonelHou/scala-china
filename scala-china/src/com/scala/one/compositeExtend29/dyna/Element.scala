package com.scala.one.compositeExtend29.dyna

/**
 * @author John
 */
class Element {
  def demo() {
    println("Element's implementation invoked")
  }
}

class ArrayElement extends Element {
  override def demo() {
    println("ArrayElement's implementation invoked")
  }
}

class LineElement extends ArrayElement {
  override def demo() {
    println("LineElement's implementation invoked")
  }
}

class UniformElement extends Element {
  override def demo() {
    println("UniformElement's implementation invoked")
  }
}

object TT {

  def invokeDemo(e: Element) {
    e.demo()
  }

  def main(args: Array[String]): Unit = {
    invokeDemo(new ArrayElement)
    invokeDemo(new LineElement)
    invokeDemo(new UniformElement)
    
    val arr = new Array[String](2)
    arr(0) = "hello"
    arr(1) = "world"
    println(arr mkString )
  }
}
