package com.scala.one

/**
 * @author John
 */
object PassName {
  
  val assert = true
  
  def main(args: Array[String]) : Unit = {
    
    //但调用起来看起来却有些别扭, 我希望直接调用 10> 9
    //myAssert { () => 10 > 9 }
    
    myAssert { 10 > 9 }
    
    
    def withHW(op: => Unit) {
      op
      println("HelloWorld")
    }
    withHW{println("Hello, Guide")}
  }
  
  /**
   * 此时，我们可以把按值传递（上面使用的是按值传递，传递的是函数类型的值）
   * 参数修改为按名称传递的参数，修改方法，是使用 => 开始而不是 ()=>来定义函数类型
   */
  //def myAssert(predicate: () => Boolean) = 
  def myAssert(predicate:  => Boolean) =
    //if(assert && !predicate())
    if(assert && !predicate)
      throw new AssertionError
}