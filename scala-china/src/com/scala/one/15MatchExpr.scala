package com.scala.one

/**
 * @author John
 */
object MatchExpr {
  
  
  /**
   * 类似其它语言中的switch语句
   * switch相比有几点不同:
   * 一是任何类型的常量都可以用在case语句中，而不仅仅是int或是枚举类型。
   * 二是每个case语句无需使用break，Scala不支持“fall through”。
   * 三是Scala的缺省匹配为”_”,其作用类似java中的default.
   * 最关键的一点是scala的match表达式有返回值
   */
  def main(args: Array[String]): Unit = {
    val firstArg = if(args.length > 0 ) args(0) else ""
    firstArg match {
      case "a" => println("aaaaaaaaaaa") 
      case "b" => println("bbbbbbbbbbb")
      case _   => println("oth")
    }
  }
}