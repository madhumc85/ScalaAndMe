/*
package src.tutor.scala_in_depth

/**
  * Created by chamadhu on 5/13/2016.
  */
trait InstantaneousTime_T1 {
  val repr: Int

  override def equals(other: Any): Boolean = other match {
    case that: InstantaneousTime_T1 =>
      if (this eq that) {
        true
      } else {
        (that.## == this.##) &&
          (repr == that.repr)
      }
    case _ => false
  }

  override def hashCode(): Int = repr.##
}


trait EventT1 extends InstantaneousTime_T1 {
  val name: String

  override def equals(other: Any): Boolean = other match {
    case that: InstantaneousTime_T1.Event =>
      if (this eq that) {
        true
      } else {
        (repr == that.repr) &&
          (name == that.name)
      }
    case _ => false
  }
}

object main {
  def main(args: Array[String]) {
    val x = new InstantaneousTime_T1 {
      val repr = 2
    }
    val y = new InstantaneousTime_T1.Event {
      val name = "TestEvent"
      val repr = 2
    }

    println("x==y " + x == y)
    println("y==x " + y == x)


  }
}*/
