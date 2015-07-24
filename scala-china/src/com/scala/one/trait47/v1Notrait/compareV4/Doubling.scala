package com.scala.one.trait47.v1Notrait.compareV4

/**
 * @author John
 * 
 * `abstract override' modifier only allowed for members of traits
 * Trait能够修改类的方法，并且能够通过叠加这些操作（不同组合）修改类的方法。
 */
trait Doubling extends IntQueue{
  
  abstract override def put(x: Int) = if (x >= 0) super.put( 2 * x) 
}

trait Incrementing extends IntQueue{
  abstract override def put(x:Int) { super.put(x+1)}
}

trait Filtering extends IntQueue{
  abstract override def put (x:Int) = if(x>=0) super.put(x)
}

object Exe {
  def main(args: Array[String]): Unit = {
    val queue = new BasicIntQueue with Doubling
    queue.put(10)
    println(queue.get())
    println("==============================")
    val queue1 = new BasicIntQueue with Doubling with Incrementing with Filtering
    queue1.put(10)
    queue1.put(-4)
    queue1.put(20)
    println(queue1.get())
    
  }
}