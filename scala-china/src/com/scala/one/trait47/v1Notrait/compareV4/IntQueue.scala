package com.scala.one.trait47.v1Notrait.compareV4

import scala.collection.mutable.ArrayBuffer

/**
 * @author John
 */
abstract class IntQueue {
  
  def get(): Int
  def put(x: Int)
}


/**
 * 新的需求，希望在添加元素时，添加元素的双倍，并且过滤掉负数，你可以直接修改put方法 来完成，
 * 但之后需求又变了，添加元素时，添加的为参数的递增值，你也可以修改put方法，
 * 这样显得队列的实现不够灵活。
 */
class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  
  def get(): Int = buf.remove(0)

  def put(x: Int): Unit = buf += x
}
object Tt{
  def main(args: Array[String]): Unit = {
    val queue : IntQueue = new BasicIntQueue
    queue.put(10)
    queue.put(20)
    println(queue.get())
    //println(queue.get())
    println(queue.get())
    
  }
}