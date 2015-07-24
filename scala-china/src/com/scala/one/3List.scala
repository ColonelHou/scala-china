package com.scala.one

/**
 * @author John
 */
object ListsTest {
  
  
  
  /**
   * 前面介绍的数组，它的元素是可以被修改的。如果需要使用不可以修改的序列，Scala中提供了Lists类。
   * 
   * Scala的Lists对象是不可修改的。
   * 
   * List只能包含同类型的数据
   */
  def main(args: Array[String]): Unit = {
    listsT
    
  }
  
  def listsT(): Unit = {
    val oneTwo = List(1,2)
    val threeFour = List(3,4)
    val all = oneTwo ::: threeFour
    println(oneTwo + " and " + threeFour + " were not mutated.")
    println("Thus, " + all + " is a new list")
    
    println("-------------使用常量创建一个列表：----------------")
    val add = 1 :: 2 :: 3 :: Nil
    println(add)
    val addd = Nil.::(3).::(2).::(1)
    println(addd)
  }
}