package com.scala.one.trait47

/**
 * @author John
 * 
 * 
 * 第一点，Trait不能有任何“类”参数
 */
class Frog extends Animal with Philosophical with HasLegs{
  override def toString = "gree"
  
  override def philosophize() = {
    println("It ain't easy being " + toString + "!")
  }
}

class Animal
trait HasLegs

object AA{
  def main(args: Array[String]): Unit = {
    println("hello world")
    val frog : Frog = new Frog
    frog.philosophize
    
    val ph : Philosophical = frog
    ph.philosophize
  }
}  
