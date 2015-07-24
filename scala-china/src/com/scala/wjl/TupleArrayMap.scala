package com.scala.wjl

/**
 * @author John
 */
object TupleArrayMap {
  
  /**
   * 索引以1开始
   */
  def testTuple() : Unit = {
    //类型推断, 使用Tuple接收返回多参数值 
    val pair = (100, "Scala", "Spark")
    println(pair._1)
    println(pair._2)
    val (first, second, third) = pair
    println(first)
  }
  
  def testArray() : Unit = {
    val array = Array(1,2,3,4,5, "adbd")
    for(i <- 0 until array.length){
      println(array(i))
    }
    for(ele <- array) {
      println(ele)
    }
  }
  
  def testMap() {
    val ages = Map("Rocky" -> 22, "spark" -> 6)
    for((k, v) <- ages){
      println("key is " + k + ", value " + v)
    }
    
    //不需要Value值 就用一个占位符
    for((k,_) <- ages){
      println("key is " + k )
    }
  }
  
  def main(args: Array[String]): Unit = {
    testTuple
  }
}