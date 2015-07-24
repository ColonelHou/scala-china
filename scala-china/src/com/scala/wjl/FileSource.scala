package com.scala.wjl

import scala.io.Source

/**
 * @author John
 */
object FileSource {
  
  
  def main(args: Array[String]) : Unit = {
    
    //lazy 试着一个错误的路经,读文件前不报错;
    //加lazy是每一次实例化时才执行;
    //lazy val fileName = FileSource.getClass.getResource(".").getPath.toString() + "source.log"
    val fileName = FileSource.getClass.getResource(".").getPath.toString() + "source.log"
    val file = Source.fromFile(fileName)
    for(line <- file.getLines()){
      println(line)
    }
  }
}