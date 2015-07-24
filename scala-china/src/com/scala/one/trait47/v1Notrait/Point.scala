package com.scala.one.trait47.v1Notrait

/**
 * @author John
 */
class Point(val x: Int, val y: Int)

class Rectangle(val topLeft: Point, val bottomRight: Point){
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
}
