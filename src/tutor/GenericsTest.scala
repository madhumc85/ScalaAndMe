package src.tutor

/**
  * Created by chamadhu on 5/5/2016.
  */
object GenericsTest extends scala.App {
  val stack = new Stack[Int]
  stack.push(1)
  stack.push('a')
  stack.push('b')
  stack.push('t')
  println(stack.top)
  stack.pop()
  println(stack.top)
}


class Stack[T] {
  var elems: List[T] = Nil

  def push(x: T) {
    elems = x :: elems
  }

  def top: T = elems.head

  def pop() {
    elems = elems.tail
  }
}

class Queueee[T] {
  var elems: List[T] = Nil

  def push(x: T) {
    elems = x :: elems
  }


}