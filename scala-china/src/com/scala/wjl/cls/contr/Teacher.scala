package com.scala.wjl.cls.contr

/**
 * @author John
 */

class T1 {
  var name : String = _;
  private var age = 27
  private[this] val gender = "male"
  
  def this(name: String){
    //这里不写this, 默认T1有一个空构造器,自定义构造器都需要调用这个空构造器
    this
    this.name = name
  }
  def sayHello(){
    println(this.name + " : " + this.age + " : " + this.gender)
  }
}
class Teacher(val name: String, val age : Int) {
  println("This is the primary constructor!!!")
  var agender : String = _
  println(agender)
  def this(name : String , age: Int, gender: String){
    this(name, age)
    this.agender = gender
  }
}