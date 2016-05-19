package src.depth

/**
  * Created by chamadhu on 5/19/2016.
  */
trait MyReallySweetAwesomeAbstraction {
  def weight: Int
  def height: Int
  def area: Int = height * weight
}

class Square(h: Int, w: Int) extends MyReallySweetAwesomeAbstraction {
  override val weight: Int = w
  override val height: Int = h
}

object Square {
  def main(args: Array[String]) {
    println(new Square(10, 10).height == 10)
    println(new Square(10, 10).weight == 10)
    println(new Square(10, 10).area == 100)
  }
}