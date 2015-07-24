package com.scala.one.compositeExtend29

/**
 * @author John
 */
abstract class Element {
  
  /**
   * 抽象方法
   * 
   * 和Java不同的是，抽象方法不需要使用abstract修饰符来表示，只要这个方法没有具体实现，就是抽象方法，
   * 
   * 有实现的叫具体方法
   */
  def contents: Array[String]
  
  //如def height(): Int，被称为空括号方法
  def height: Int = contents.length
  
  //三个方法没一个有参数列表
  def weight: Int = if(height == 0) 0 else contents(0).length
}