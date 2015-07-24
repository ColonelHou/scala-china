package com.scala.one

/**
 * @author John
 */
object Closure {
  def main(args: Array[String]): Unit = {
    def makeIncre(more : Int) = (x : Int) => x + more
    
    //当你调用makeIncre(1)时，你创建了一个闭包
    val inc = makeIncre(1)
    println(inc)

    println(inc(10))
    
    //该闭包定义时more的值为1, 而调用makeIncreaser(9999)所创建的闭包的more的值为9999
    val inc9999 = makeIncre(9999)
    println(inc9999(10))
    
    //此后你也无法修改已经返回的闭包的more的值。因此inc1始终为加一，而inc9999始终为加9999.
  }
}  