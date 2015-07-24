package com.scala.one

import scala.io.Source

/**
 * @author John
 */
object Fors {
 
  
  
  def main(args: Array[String]): Unit = {
    var files = (new java.io.File("E:\\hn\\analysis\\scala\\wksp\\scala-china\\src\\com\\scala\\one")).listFiles
    
    files.foreach(file => println(file.getAbsolutePath))
    
    //加过虑器
    for(file <- files if file.isFile() if file.getName.endsWith(".scala")){
      println(file)
    }

    //生成新集合
    def scalaFiles =
      for {
        file <- files if file.getName.endsWith(".scala")
      } yield file

  }
}