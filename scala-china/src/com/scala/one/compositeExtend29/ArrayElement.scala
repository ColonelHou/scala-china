package com.scala.one.compositeExtend29

/**
 * @author John
 * 
 * 
 * 其中extends具有两个功效，
 * 一是让ArrayElement继承所有Element类的非私有成员，
 * 第二使得ArrayElement成为Element的一个子类。
 * 
 * 缺省继承自scala.AnyRef
 * 
 * 
 * Scala中成员函数和成员变量地位几乎相同而且也处在同一个命名空间，
 * 也就是Scala中不允许定义同名的成员函数和成员变量，
 * 但带来的一个好处是，可以使用成员变量来重载一个不带参数的成员函数。
 */
class ArrayElement(cont: Array[String]) extends Element {
  
  /**
   * 定义了一个contents函数，这个函数中其父类（基类）中是抽象的,
   * 因此可以说ArrayElement中的contents函数实现了父类中的这个抽象函数，
   * 也可以说“重载”(override)了父类中的同名函数。
   */
  def contents: Array[String] = cont
  
  /**
   * 你可以通过一个成员变量来实现基类中定义的抽象函数contents.
   */
  //val contents: Array[String] = cont
  
}
object TEE {
  def main(args:Array[String]): Unit = {
    val ae = new ArrayElement(Array("Hello", "World"))
    println(ae.weight)
    
    val aee: Element = new ArrayElement(Array("hah"))
  }
}