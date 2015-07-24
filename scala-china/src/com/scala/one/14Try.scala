package com.scala.one

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
import java.net.URL
import java.net.MalformedURLException

/**
 * @author John
 */
object Try {
  
  
  def main(args: Array[String]): Unit = {
    ioException
    
    //下面的两个函数的返回值不一致,
    //上面两种情况常常使得程序员产生困惑，因此关键的一点是避免在finally生成返回值，而只用来做些清理工作，比如关闭文件。
    println(f)
    println(g)
  }
  
  /**
   * 和Java异常处理不同的一点是，Scala不需要你捕获checked的异常，
   * 
   */
  def ioException(): Unit = {
    try{
      val f = new FileReader("input.data")
    }catch{
      case ex: FileNotFoundException => println("文件找不到")
      case ex: IOException => println("IO异常")
    }finally{
      println("关闭流")
    }
  }
  
  def urlFor(path: String) = 
    try{
      new URL(path)
    }catch{
      case ex: MalformedURLException => new URL("http://www.xxx.com")
    }finally{
      println("都执行")
    }
  def f(): Int = try{
    return 1
  }finally{
    return 2
  }
  def g(): Int = try 1 finally 2
  
  def simple(): Unit = {
    val n = 3
    val half = if(n % 2 == 0) n / 2 else throw new RuntimeException("n must be even")
  }
}