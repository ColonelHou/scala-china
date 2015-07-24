package com.scala.one.pckag50

/**
 * @author John
 */
package lauch {
 
  class Booster3
}

package bobsrockets{
  package navigtion{
    package lauch{
      class Booster1
    }
    
    class MissionControl{
      val booster1 = new lauch.Booster1
      val booster2 = new bobsrockets.lauch.Booster2
      /**
       * 内层的包launch隐藏了这个外部的同名包。为解决这种情况，Scala提供了_root_,
       * 也就是所有最外层的类型都可以当成定义在_root_包中。
       * 因此_root_.launch.Booster3可以访问最外层定义的类型。
       */
      //val booster3 = new _root_.launch.Booster3
    }
  }
  
  package lauch{
    class Booster2
  }
}