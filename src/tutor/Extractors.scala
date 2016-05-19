package src.tutor

/**
  * Created by chamadhu on 5/18/2016.
  */
object Teshht {
  def main(args: Array[String]) {

    val x = Teshht(5)
    println(x)

    x match
    {
      case Teshht(num) => println(x+" is bigger two times than "+num)
      //unapply is invoked
      case _ => println("i cannot calculate")
    }

  }
  def apply(x: Int) = x*2
  def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None
}


object Test {
  def main(args: Array[String]) {

    println ("Apply method : " + apply("Zara", "gmail.com"))
    println ("Unapply method : " + unapply("Zara@gmail.com"))
    println ("Unapply method : " + unapply("Zara Ali"))

  }
  // The injection method (optional)
  def apply(user: String, domain: String) = {
    user +"@"+ domain
  }

  // The extraction method (mandatory)
  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2){
      Some(parts(0), parts(1))
    }else{
      None
    }
  }
}
