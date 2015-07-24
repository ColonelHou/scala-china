package com.scala.one.access.scope

/**
 * @author John
 *
 *
 *
 * 比如一些通用的函数，变量，你都可以直接定义在包中。
 * 在Scala中，可以把这些函数或方法放在一个称为“包对象”中。
 * 每个包只有一个包对象，任何放在包对象的类型都可以认为是包自身的成员。
 */
package object bobsdelights {
  def showFruit(fruit: Int) {
    import fruit._
    println(fruit + "s are " + fruit)
  }
}