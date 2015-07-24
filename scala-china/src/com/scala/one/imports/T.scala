package com.scala.one.imports

/**
 * @author John
 */
object T  {
  
  /**
   * 和Java不同的是，是使用“_”代替“*”,
   * 可以出现在文件中任何地方
   * 支持对引入的对象重命名或者隐藏某些类型
   * import Fruits.{Apple,Orange}
   * 同样重命名也可以重新定义包名称，比如import java.{sql => S}
   * 如果需要隐藏某个类型，可以使用 Type => _ ，将某个类型改名为_就达到隐藏某个类型的效果，比如
   * import Fruits.{Apple=>_,_}
   * 
   * 
   * Scala缺省为每个文件添加如下几个package. 这几个包无需明确指明:
   *  import java.lang._   
   *  import scala._  
   *  import Predef._ 
   *  此外这三个包的顺序也需要了解一下，比如StringBuilder类定义在包scala 和java.lang包中，
   *  后定义的import会覆盖前面的定义，因此如果不明确指明，
   *  StringBuilder为scala.StringBuilder而非java.lang.StringBuilder.
   */
  def main(args: Array[String]): Unit = {
    
  }
}