package com.scala.something.applys



class ApplyTest{
  
  def apply() = "This apply is in Class."
  def test{
    println("test")
  }
}
//放在object对象中的方法都是静态方法
object ApplyTest {
  
  var count = 0
  
  def apply() = new ApplyTest
  
  def static{
    println("I am a static method!!!")
  }
  
  def incr() {
    count += 1
  }
}
object UsageOfApply extends App{
  ApplyTest.static
  
  /**
   * 使用“val a = ApplyTest()”的使用会导致apply方法的调用并返回该方法调用的值，
   * 也就是ApplyTest的实例化对象
   * 注释掉apply方法会报错
   */
  val a = ApplyTest()
  a.test
  
  val b = new ApplyTest
  println(b())
  
  for(i <- 0 until 10){
    ApplyTest.incr()
  }
  println(ApplyTest.count)
}