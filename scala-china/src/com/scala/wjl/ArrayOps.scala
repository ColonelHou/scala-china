package com.scala.wjl

import scala.util.Sorting

/**
 * @author John
 */
object ArrayOps {
  def main(args: Array[String]) : Unit = {
    val c = Array(2, 3, 5, 8 , 11)
    //yield 产生一个新数组乘以2
    val result = for(elem <- c) yield 2 * elem
    //result.foreach(println)
    //取出所有偶数并乘以2
    val cc = for(elem <- c if elem % 2 == 0) yield 2 * elem
    //cc.foreach(println)
    //同上结果一样
    //val ccc = c.filter(_ % 2 == 0).map(2 * _)
    val ccc = c.filter(ele => ele % 2 == 0).map(2 * _)
    ccc.foreach(println)
    
    //排序
    Sorting.quickSort(c)
    //c.foreach(println)
    //2 and 3 and 5 and 8 and 11
    println(c.mkString(" and "))
    //<2,3,5,8,11>
    println(c.mkString("<", ",", ">"))
    
    val matrix = Array.ofDim[Double](3, 4)
    matrix(2)(1) = 34
    
  }
}