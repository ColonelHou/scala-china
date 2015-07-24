package com.scala.wjl

/**
 * @author John
 */
object StrOps {
  
  
  def main(args: Array[String]): Unit = {
    //(HS,ello park)
    println("Hello Spark".partition(_.isUpper))
  }
}