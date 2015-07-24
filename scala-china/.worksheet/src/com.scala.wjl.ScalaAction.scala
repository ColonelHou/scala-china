package com.scala.wjl

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

object ScalaAction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(159); 
  println("Welcome to the Scala worksheet");$skip(34); 
  val s = Array("Hello", "World");System.out.println("""s  : Array[String] = """ + $show(s ));$skip(29); 
  val a = new Array[Int](10);System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(19); 
  s(0) = "GoodBye";$skip(4); val res$0 = 
  s;System.out.println("""res0: Array[String] = """ + $show(res$0));$skip(32); 
  for(elem <- s ) println(elem);$skip(33); 
  val b = new ArrayBuffer[Int]();System.out.println("""b  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(b ));$skip(19); val res$1 = 
  //b.max
  b += 1;System.out.println("""res1: com.scala.wjl.ScalaAction.b.type = """ + $show(res$1));$skip(20); val res$2 = 
  b += (1, 2, 3, 4);System.out.println("""res2: com.scala.wjl.ScalaAction.b.type = """ + $show(res$2));$skip(23); val res$3 = 
  b ++= Array(6, 7, 8);System.out.println("""res3: com.scala.wjl.ScalaAction.b.type = """ + $show(res$3));$skip(4); val res$4 = 
  b;System.out.println("""res4: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$4));$skip(26); 
  //删除最后五个
  b.trimEnd(5);$skip(4); val res$5 = 
  b;System.out.println("""res5: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$5));$skip(29); 
  //2的位置插入4
  b.insert(2, 4);$skip(4); val res$6 = 
  b;System.out.println("""res6: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$6));$skip(26); 
  
  b.insert(2, 7, 8, 9);$skip(4); val res$7 = 
  b;System.out.println("""res7: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$7));$skip(29); val res$8 = 
  //删除第二个位置上的值
  b.remove(2);System.out.println("""res8: Int = """ + $show(res$8));$skip(4); val res$9 = 
  b;System.out.println("""res9: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$9));$skip(35); 
  //第二个位置开始删除3个元素
  b.remove(2, 3);$skip(4); val res$10 = 
  b;System.out.println("""res10: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$10));$skip(20); 
  val c = b.toArray;System.out.println("""c  : Array[Int] = """ + $show(c ));$skip(4); val res$11 = 
  b;System.out.println("""res11: scala.collection.mutable.ArrayBuffer[Int] = """ + $show(res$11));$skip(57); 
  //这里错了
  //c += 1
  
  val cc = Array(2, 3, 5, 7 , 11);System.out.println("""cc  : Array[Int] = """ + $show(cc ));$skip(76); 
  //cc.sum
	//yield 产生一个新数组乘以2
	val result = for(elem <- cc) yield 2 * elem;System.out.println("""result  : Array[Int] = """ + $show(result ));$skip(40); 
 val matrix = Array.ofDim[Double](3, 4);System.out.println("""matrix  : Array[Array[Double]] = """ + $show(matrix ));$skip(19); 
 matrix(2)(1) = 34;$skip(8); val res$12 = 
 matrix;System.out.println("""res12: Array[Array[Double]] = """ + $show(res$12));$skip(34); 
 val tuple = (1, 2, 4.0, "spark");System.out.println("""tuple  : (Int, Int, Double, String) = """ + $show(tuple ));$skip(19); 
 println(tuple _3);$skip(39); 
 val (first, second, third, _) = tuple;System.out.println("""first  : Int = """ + $show(first ));System.out.println("""second  : Int = """ + $show(second ));System.out.println("""third  : Double = """ + $show(third ));$skip(35); 
 val symbol = Array("[", "-", "]");System.out.println("""symbol  : Array[String] = """ + $show(symbol ));$skip(29); 
	val counts = Array(2, 4, 3);System.out.println("""counts  : Array[Int] = """ + $show(counts ));$skip(26); 
	val thr = Array(3, 3, 3);System.out.println("""thr  : Array[Int] = """ + $show(thr ));$skip(32); 
	val pairs = symbol.zip(counts);System.out.println("""pairs  : Array[(String, Int)] = """ + $show(pairs ));$skip(29); 
	val pairss = pairs.zip(thr);System.out.println("""pairss  : Array[((String, Int), Int)] = """ + $show(pairss ))}
}
