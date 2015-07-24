package com.scala.something.applys



class ApplyDemo{
  def apply = "apply in class"
  def test {
    println("test")
  }
}

//伴生对象，相当于类的静态方法
object ApplyDemo {
  
  def stat {
    println("static method")
  }
  
  def apply() = {
    println("This is obj Apply method")
    new ApplyDemo
  }
  
  var count = 0
  
  def incr = {
    count += 1
  }
}
