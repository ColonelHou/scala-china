package com.scala.one

import scala.io.Source

/**
 * @author John
 */
object ReadFile {
  
  
  // 如果需要引入多个类，Scala使用 “_” 而非 “*”.
  def main(args: Array[String]): Unit = {
    Source.fromFile("E:\\hn\\analysis\\scala\\wksp\\scala-china\\src\\com\\scala\\one\\1HelloWorld.scala").getLines().foreach(println)
    println("================================")
    if(args.length > 0)
      for(line <- Source.fromFile(args(0)).getLines()){
        println(line)
      }
    else
      Console.err.println("Please input filename")
  }
}