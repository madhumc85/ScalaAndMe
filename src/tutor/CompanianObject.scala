package src.tutor

/**
  * Created by chamadhu on 5/2/2016.
  */

class CompanianObject(val x: Int, val y: Int)

object CompanianObject {

  import math.Ordering

  implicit def ipord: Ordering[CompanianObject] =
    Ordering.by(ip => (ip.x, ip.y))
}