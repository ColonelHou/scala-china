package com.scala.one.compositeExtend29

/**
 * @author John
 */
class LineElementArray(ss: Array[String]) extends ArrayElement(ss){
  
  override def weight = ss.length
  
  override def height = 2
  
}