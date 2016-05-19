package src.depth

/**
  * Created by chamadhu on 5/19/2016.
  */
object Expressions_1 {
  def main(args: Array[String]) {
    println(numberStr(2))
    println(numberStr(888))
  }

  //List<Str>
  def numberStr(myNumber: Int): String = myNumber match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case 4 => "four"
    case 5 => "five"
    case 6 => "six"
    case 7 => "seven"
    case 8 => "eight"
    case 9 => "nine"
    case 0 => "zero"
    case _ => "unknown integer"
  }
}
