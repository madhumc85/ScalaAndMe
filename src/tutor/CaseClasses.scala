package src.tutor

/**
  * Created by chamadhu on 5/2/2016.
  */

abstract class Term

case class Var(name: String) extends Term

case class Fun(arg: String, body: Term) extends Term

case class App(f: Term, v: Term) extends Term

case class Slapp(f: Term, v: Term) extends Term {
  object Slapp {
    print()
  }
}

object TermTest extends scala.App {
  def printTerm(term: Term) {
    term match {
      case Var(n) =>
        print(n)
      case Fun(x, b) =>
        print("^" + x + ".")
        printTerm(b)
      case App(f, v) =>
        print("(")
        printTerm(f)
        print(" ")
        printTerm(v)
        print(")")
      case Slapp(f, v) =>
        print("(")
    }
  }

  def isIdentityFun(term: Term): Boolean = term match {
    case Fun(x, Var(y)) if x == y => true
    case _ => false
  }

  val id = Fun("x", Var("x"))
  val id2 = Fun("x", Var("y"))
  val t = Fun("x", Fun("y", App(Var("x"), Var("y"))))
  printTerm(t)
  println
  println(isIdentityFun(id))
  println(isIdentityFun(id2))
  println(isIdentityFun(t))
}