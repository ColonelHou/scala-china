package com.scala.one

import sun.org.mozilla.javascript.internal.ast.Yield

/**
 * @author John
 */
object ReduceCodeRepoeat {
  
  
  def main(args: Array[String]): Unit = {
    matchFile
  }
  
  def matchFile(): Unit = {
    val files = (new java.io.File("E:\\hn\\analysis\\scala\\wksp\\scala-china\\src\\com\\scala\\one")).listFiles
    
    println(filesEnding(".scala"))
    
    println("-----------------下面这三个函数功能不一样, 但是冗余严重, 使用scala高阶函数处理")
    def filesEnding(query: String) = 
      for(file <- files if file.getName.endsWith(query))
        yield  file
        
    def fileContain(query : String) = 
      for(file <- files if file.getName.contains(query))
        yield file
        
    def fileRegex(query : String) = 
      for(file <- files if file.getName.matches(query))
        yield file
        
    println("-----------------上面这三个函数功能不一样, 但是冗余严重, 使用scala高阶函数处理")
    
    /**
     * 这个函数的第二个参数matcher的类型也为函数
     * 该函数的类型为 (String,String ) =>Boolean
     * ，可以匹配任意使用两个String类型参数，返回值类型为Boolean的函数。
     * 使用这个辅助函数，我们可以重新定义filesEnding,filesContaining和filesRegex。
     */
    def fileMatching(query: String, matcher: (String, String) => Boolean) = 
    ///def fileMatching(query: String, matcher: (String) => Boolean) =
      for(file <- files if matcher(file.getName, query))
        yield file
    def filesEnd(query: String) = 
      fileMatching(query, _.endsWith(_))
      //fileMatching(query, _.endsWith(query))
    def filesContain(query: String) = 
      fileMatching(query, _.contains(_))
    def filesRegex(query: String) = 
      fileMatching(query, _.matches(_))
    //函数类型参数 _.endsWith(query)，_.contains(query)和_.matches(query) 为函数闭包
  }
}