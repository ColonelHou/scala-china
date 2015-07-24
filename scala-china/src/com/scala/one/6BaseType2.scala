package com.scala.one

/**
 * @author John
 */
object BaseType2 {
  
  def main(args: Array[String]): Unit = {
    baseTypeMethod
    loc
  }
  
  //scala 的==只用于比较两个对象的值是否相同，
  //而对于引用类型的比较使用另外的操作符 eq 和 ne。
  def valEqual() : Unit = {
    println(1 == 2)
    println(1 !=2)
    println(List(1,2,3) == List (1,2,3))
    println(("he"+"llo") == "hello")
  }
  
  def loc() = {
    println(1 & 2)
    println(56 | 123456)
    println(56 ^ 123456)
    println(3 ^ 27)
    println( ~ 2)
  }
  
  //比如 1+2 ，实际为 (1).+(2) ，也就是调用 Int类型的+方法。
  def baseTypeMethod(): Unit = {
    val sum = (-1).+(2)
    println(sum)
    
    
    //由此可以看出运算符在Scala中并不是什么特殊的语法，任何Scala方法都可以作为操作符来使用。
    //是否是操作符取决于你如何使用这个方法，当你使用 s.indexOf(‘o’) indexOf不是一个运算符。 
    //而你写成 s indexOf ‘o’ ,indexOf 就是一个操作符，因为你使用了操作符的语法。
    val s = "Hello, World"
    println(s indexOf 'o')
    println(s.indexOf('o'))
    println(s toLowerCase)
    
    println("===============有前缀运算符和后缀运算符====================")
    println(2.0.unary_-  == -2.0)//true
    
    //要注意的是逻辑运算支持“短路运算”，比如 op1 || op2 ，当op1=true ，op2无需再计算，
    //就可以知道结果为true。这时 op2表示式不会执行。
    def salt() = {
      println("salt")
      false
    }
    def peper() = {
      println("pepper")
      true
    }
    println("===========salt && peper: " + (salt && peper))
    println("===========peper && salt: " + (peper && salt))
    println("===========salt || peper: " + (salt || peper))
    println("===========peper || salt: " + (peper || salt))
  }
}