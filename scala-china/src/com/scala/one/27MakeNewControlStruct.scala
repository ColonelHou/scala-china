package com.scala.one

import java.io.File
import java.io.PrintWriter
import java.io.Writer

/**
 * @author John
 */
object MakeNewControlStruct {
  
	val files = (new java.io.File("E:\\hn\\analysis\\scala\\wksp\\scala-china\\src\\com\\scala\\one")).listFiles
  
  def main(args: Array[String]): Unit = {
    println(twice(_ +1, 5))
    
    println("==============")
    println{"af"}
    withPrintWriter(new File("E:\\hn\\analysis\\scala\\wksp\\scala-china\\src\\com\\scala\\one\\data.txt"), writer => writer.println(new java.util.Date))
  }
  
  //上面调用twice ，其中 _+1调用两次，也就是5调用两次+1，结果为7.
  def twice(op: Double => Double, x: Double) = op(op(x))
  
  
  def filesMatching(
    matcher: (String) => Boolean) = {
    for(file <- files; if matcher(file.getName))
      yield file
   }
  
  
   def withPrintWriter(file: File, op: PrintWriter => Unit){
     val writer = new PrintWriter(file)
     try{
    	 op (writer)
     }finally{
       writer.close()
     }
   }

}