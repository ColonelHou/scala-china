package com.scala.wjl.cls



class Person{
  //这个age必须有初始值
  //默认生成 get set函数
  private var age = 0
  def increment() {
    age += 1
  }
  //没加括号, 没有参数可以把这个括号省略掉
  def current = age
}
/*
class Student {
  //var age = 0
  //只限定当前对象使用,不能被当前对象类的方法使用
  private[this] var age = 0
  //def age = age
  def age_(age: Int)
}
*//**
 * @author John
 *//*
object HelloOOP {
  def main(args: Array[String]): Unit = {
    val person = new Person
    person.increment
    println(person.current)
    
    val stu = new Student
    //def age_=(x$1: Int): Unit 这里代码自动帮我生成的
    stu.age = 10
    //def age: Int 通过age函数取出a值
    println(stu.age)
  }
  
}*/