package com.scala.one

import scala.io.Source

/**
 * @author John
 */
object FunClassFun {
  
  
  
  def processFile(filename: String, width: Int) {
    val source= Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(filename,width,line)
   }
  
  
   private def processLine(filename:String,
     width:Int, line:String){
     if(line.length > width)
       println(filename + ":" +line.trim)
   }

}