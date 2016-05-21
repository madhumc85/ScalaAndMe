package src.depth

/**
  * Created by chamadhu on 5/21/2016.
  */

object IPAddress {

  def apply(a: String, b: String, c: String, d: String): String = a + "." + b + "." + c + "." + d


  def unapply(ip: String): Option[(String, String, String, String)] = {
    val tokens = ip split "\\."
    if (tokens.length == 4 && isValid(tokens))
      Some(tokens(0), tokens(1), tokens(2), tokens(3))
    else None
  }

  private def isValid(tokens: Array[String]): Boolean = {
    tokens forall {
      elem => elem.toInt >= 0 && elem.toInt <= 255
    }
  }

  def main(args: Array[String]) {
    IPAddress("127", "0", "0", "1") match {
      case IPAddress(_, _, _, a) => println("Yes its valid ip Address")
      case _ => println("Invalid ip address")
    }
  }
}

object IPAdrresses extends scala.App {
  def unapplySeq(ips: String): Option[Seq[String]] = {
    Some(ips split ",")
  }

  "192.168.0.1,192.168.0.2,192.168.0.3,192.168.0.4" match {
    case IPAdrresses(IPAddress(a, _, _, _), IPAddress(b, _, _, _), _*) => println(a + " " + b)
    case _ => println("Invalid ip Address")
  }
}
