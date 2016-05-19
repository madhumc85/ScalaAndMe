package src.tutor

/**
  * Created by chamadhu on 5/2/2016.
  */

class Decorator(left: String, right: String) {
  def layout[A](x: A) = left + x.toString + right
}

object FunTest extends scala.App {
  def apply(fun: Int => String, v: Int) = fun(v)

  def unapply(fun: Int => String, intVal: Int) = fun(intVal)

  val decorator = new Decorator("[", "]")
  println(apply(decorator.layout, 7))
  println(unapply(decorator.layout, 8))
}
