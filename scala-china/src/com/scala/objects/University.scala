package com.scala.objects

import scala.actors.Actor

/**
 * @author John
 */

class University{
  
}
object University {
  private var studentNo = 0
  
  def newStudenNo = {
    studentNo += 1
    studentNo
  }
}
object test{
  def main(args: Array[String]): Unit = {
    /**
     * 1
     * 2
     */
    println(University.newStudenNo)
    println(University.newStudenNo)
    
    val arr = Array(1 ,32,54)
  }
}