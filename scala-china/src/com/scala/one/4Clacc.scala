package com.scala.one

import scala.collection.mutable.Map

/**
 * @author John
 */



/**
 * Scala比Java更加面向对象，这是因为Scala不允许类保护静态元素(静态变量或静态方法）
 * 
 * 。在Scala中定义Singleton对象的方法除了使用object，而非class关键字外和类定义非常类似
 * 
 * 
 */
object Clacc {
  
}

/**
 * 这个对象和上一篇创建的类ChecksumAccumulator同名，
 * 这在Scala中把这个对象成为其同名的类的“伴侣”对象（Companion object)。 
 * 如果你需要定义的类的companion对象，Scala要求你把这两个定义放在同一个文件中。
 * 类和其companion对象可以互相访问对方的私有成员。
 * 
 * 可以把Singleton对象看成以前Java定义静态成员的地方。
 */
class ChecksumAccumulator{
   private var sum=0
   def add(b:Byte) :Unit = sum +=b
   def checksum() : Int = ~ (sum & 0xFF) +1
}

object ChecksumAccumulator {
   private val cache = Map [String, Int] ()
   def calculate(s:String) : Int =
      if(cache.contains(s))
         cache(s)
      else {
         val acc=new ChecksumAccumulator
         for( c <- s)
            acc.add(c.toByte)
         val cs=acc.checksum()
         cache += ( s -> cs)
         cs
       }
}