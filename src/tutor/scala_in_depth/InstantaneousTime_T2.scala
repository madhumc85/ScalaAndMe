package src.tutor.scala_in_depth

import scala.Option

/**
  * Created by chamadhu on 5/13/2016.
  */
trait InstantaneousTime_T2 extends Equals {
  val repr: Int

  override def canEqual(other: Any) =
    other.isInstanceOf[InstantaneousTime_T2]

  override def equals(other: Any): Boolean =
    other match {
      case that: InstantaneousTime_T2 =>
        if (this eq that) true
        else {
          (that.## == this.##) &&
            (that canEqual this) &&
            (repr == that.repr)
        }
      case _ => false
    }

  override def hashCode(): Int = repr.hashCode
}

trait EventT2 extends InstantaneousTime_T2 {
  val name: String

  /*override def canEqual(other: Any) =
    other.isInstanceOf[EventT1]

  override def equals(other: Any): Boolean = other match {
    case that: EventT1 =>
      if (this eq that) {
        true
      } else {
        (that canEqual this) &&
          (repr == that.repr) &&
          (name == that.name)
      }
    case _ => false
  }*/
}
