package com.scala.one

/**
 * @author John
 */
object IfExpr {
  
  
  def main(args: Array[String]): Unit = {
    
  }
  
  /**
   * 1.代码短
   * 2.这段代码使用val而无需使用var类型的变量
   */
  def scalaIF(args: Array[String]): Unit = {
    var fileName = if(!args.isEmpty) args(0) else "default.txt"
  }
  
  def javaIF(args: Array[String]): Unit = {
    var filename = "default.txt"
    if(!args.isEmpty)
      filename = args(0)
  }
}