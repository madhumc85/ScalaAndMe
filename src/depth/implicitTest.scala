package src.depth

import scala.language.implicitConversions

/**
  * Created by chamadhu on 5/18/2016.
  */
object implicitTest extends scala.App {
  implicit val x: Int = 9

  def myInt(xx: Int): Int = {
    println(xx)
    xx
  }

  implicit def foo(x: Int) = new {
    def OH_MY_! = println("OH_MY_")
  }

  myInt(3).OH_MY_!
}
