/*
package src.tutor

/**
  * Created by chamadhu on 5/2/2016.
  */


object CurryTest extends App {
  def filter(xs: List[Int], p: Int => Boolean): List[Int] =
    if (xs.isEmpty) xs
    else if (p(xs.head)) xs.head :: filter(xs.tail, p)
    else filter(xs.tail, p)

  def modN(n: Int)(x: Int) = x % n == 0

  val nums = List(1, 2, 3, 4, 5, 6, 7, 8)

  println(filter(nums, modN(2)))
  println(filter(nums, modN(3)))

  /*-----------------------------------------*/

  def curryingExample_2() {
    val str1: String = "Hello, "
    val str2: String = "Scala!"
    println("str1 + str2 = " + strcat(str1)(str2))
  }

  def strcat(s1: String)(s2: String) = {
    s1 + s2
  }

  curryingExample_2()
}
*/
