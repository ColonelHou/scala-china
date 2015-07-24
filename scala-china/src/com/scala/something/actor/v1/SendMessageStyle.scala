package com.scala.something.actor.v1

import actors._

/**
 * @author John
 */
object SendMessageStyle {/*
  def main(args: Array[String]): Unit = {
     val caller = self
     val accumulator = actor {
       var continue = true
       var sum = 0
       loopWhile(continue) {
         reactWithin(500) {
           case number: Int => sum += number
           case TIMEOUT =>
             continue = false
             caller ! sum
         }
       }
     }
     accumulator ! 1
     accumulator ! 2
     accumulator ! 3
     receiveWithin(1000) {
       case result => println("Total is " + result)
     }
   }
*/}