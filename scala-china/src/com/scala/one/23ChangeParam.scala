package com.scala.one

/**
 * @author John
 */
object ChangeParam {

  def main(args: Array[String]): Unit = {

    echo("Hello", "World")
    echo("Hello", "World", "Jim")

    println("打印数组..............")
    val arr = Array("What", "are", "Your", "?")
    //echo(arr)  编译出错;  为了避免这种情况，你可以通过在变量后面添加 _*来解决
    echo(arr: _*)
    
    println(passParam(100, 10))
    
    println(passParam(time = 10, distance = 100))
    
    printTime()
    printTime(divisor = 1000)
    
  }
  //可变参数
  def echo(args: String*) = {
    for (arg <- args)
      println(arg)
  }

  //传递参数 
  def passParam(distance: Float, time: Float): Float = distance / time

  def printTime(out: java.io.PrintStream = Console.out, divisor: Int = 1) = out.println(System.currentTimeMillis() / divisor)
}