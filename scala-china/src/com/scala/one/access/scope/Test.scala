package com.scala.one.access.scope

/**
 * @author John
 */
class Test {
  
}

package bobsrockets{}
package navigation{
  //类Navigator使用private[bobsrockets]来修饰，这表示这个类可以被bobsrockets中所有类型访问
   //private[bobsrockets] class Navigator{
    class Navigator{
      protected[navigation] def useStarChart(){}
      class LegOfJourney{
        private[Navigator]  val distance=100
      }
       private[this] var speed = 200
   }
}
package launch{
    import navigation._
    //比如通常情况下Vehicle无法访问私有类型Navigator,但使用包作用域之后，Vechile中可以访问Navigator.
    object Vehicle{
      private[launch] val guide=new Navigator
    }
}