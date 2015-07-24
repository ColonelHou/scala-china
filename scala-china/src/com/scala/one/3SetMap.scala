package com.scala.one


//缺省情况Set为Immutable Set
import scala.collection.immutable.Set

//如果你需要使用可修改的集合类（Set类型），你可以使用全路径来指明Set，比如 scala.collection.mutalbe.Set 。

/**
 * @author John
 */
object SetMap {
  
  /**
   * Scala语言的一个设计目标是让程序员可以同时利用面向对象和面向函数的方法编写代码
   * 因此它提供的集合类分成了可以修改的集合类和不可以修改的集合类两大类型。
   * 比如Array总是可以修改内容的，而List总是不可以修改内容的。
   */
  def main(args: Array[String]) : Unit = {
    var jetSet = Set("Hello", "World")
    jetSet += " Jim"
    println(jetSet.toString())
    
    val map = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IIII", 5 -> "IIIII")
    println(map(4))
  }
}