package com.scala.wjl

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

object ScalaAction {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val s = Array("Hello", "World")                 //> s  : Array[String] = Array(Hello, World)
  val a = new Array[Int](10)                      //> a  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
  s(0) = "GoodBye"
  s                                               //> res0: Array[String] = Array(GoodBye, World)
  for(elem <- s ) println(elem)                   //> GoodBye
                                                  //| World
  val b = new ArrayBuffer[Int]()                  //> b  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
  //b.max
  b += 1                                          //> res1: com.scala.wjl.ScalaAction.b.type = ArrayBuffer(1)
  b += (1, 2, 3, 4)                               //> res2: com.scala.wjl.ScalaAction.b.type = ArrayBuffer(1, 1, 2, 3, 4)
  b ++= Array(6, 7, 8)                            //> res3: com.scala.wjl.ScalaAction.b.type = ArrayBuffer(1, 1, 2, 3, 4, 6, 7, 8)
                                                  //| 
  b                                               //> res4: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 2, 3, 4,
                                                  //|  6, 7, 8)
  //删除最后五个
  b.trimEnd(5)
  b                                               //> res5: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 2)
  //2的位置插入4
  b.insert(2, 4)
  b                                               //> res6: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 4, 2)
  
  b.insert(2, 7, 8, 9)
  b                                               //> res7: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 7, 8, 9,
                                                  //|  4, 2)
  //删除第二个位置上的值
  b.remove(2)                                     //> res8: Int = 7
  b                                               //> res9: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 8, 9, 4,
                                                  //|  2)
  //第二个位置开始删除3个元素
  b.remove(2, 3)
  b                                               //> res10: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 2)
  val c = b.toArray                               //> c  : Array[Int] = Array(1, 1, 2)
  b                                               //> res11: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 1, 2)
  //这里错了
  //c += 1
  
  val cc = Array(2, 3, 5, 7 , 11)                 //> cc  : Array[Int] = Array(2, 3, 5, 7, 11)
  //cc.sum
	//yield 产生一个新数组乘以2
	val result = for(elem <- cc) yield 2 * elem
                                                  //> result  : Array[Int] = Array(4, 6, 10, 14, 22)
 val matrix = Array.ofDim[Double](3, 4)           //> matrix  : Array[Array[Double]] = Array(Array(0.0, 0.0, 0.0, 0.0), Array(0.0,
                                                  //|  0.0, 0.0, 0.0), Array(0.0, 0.0, 0.0, 0.0))
 matrix(2)(1) = 34
 matrix                                           //> res12: Array[Array[Double]] = Array(Array(0.0, 0.0, 0.0, 0.0), Array(0.0, 0.
                                                  //| 0, 0.0, 0.0), Array(0.0, 34.0, 0.0, 0.0))
 val tuple = (1, 2, 4.0, "spark")                 //> tuple  : (Int, Int, Double, String) = (1,2,4.0,spark)
 println(tuple _3)                                //> 4.0
 val (first, second, third, _) = tuple            //> first  : Int = 1
                                                  //| second  : Int = 2
                                                  //| third  : Double = 4.0
 val symbol = Array("[", "-", "]")                //> symbol  : Array[String] = Array([, -, ])
	val counts = Array(2, 4, 3)               //> counts  : Array[Int] = Array(2, 4, 3)
	val thr = Array(3, 3, 3)                  //> thr  : Array[Int] = Array(3, 3, 3)
	val pairs = symbol.zip(counts)            //> pairs  : Array[(String, Int)] = Array(([,2), (-,4), (],3))
	val pairss = pairs.zip(thr)               //> pairss  : Array[((String, Int), Int)] = Array((([,2),3), ((-,4),3), ((],3),
                                                  //| 3))
}