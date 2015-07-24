package com.scala.one

/**
 * @author John
 */


/**
 * 隐式自动转换的概念将在后面介绍，简单的说就是可以为基本类型提供扩展，
 * 比如如果调用（-1）.abs() ，Scala发现基本类型Int 没有提供abs（）方法，
 * 但可以发现系统提供了从Int类型转换为RichInt的隐式自动转换，而RichInt具有abs方法，
 * 那么Scala就自动将1转换为RichInt类型，然后调用RichInt的abs方法。
 */
object BaseType {
  
  
  /**
   * 际上Scala运行环境自动会载入包scala和java.lang中定义的数据类型，
   * 你可以使用直接使用Int，Short，String 而无需再引入包或是使用全称。
   */
  def main(args: Array[String]): Unit = {
    //Scala支持数据类型推断，你在定义变量时多数可以不指明数据类型，而是由Scala运行环境自动给出变量的数据类型
    var hex = 0x5
    println(hex)
    
    
    //Scala的基本数据类型的字面量也支持方法
    println((-2.7).abs)
    println(1 to 4)
    println(4 max 9)
  }
}