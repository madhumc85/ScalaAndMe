package src.depth

/**
  * Created by chamadhu on 5/19/2016.
  */
object Option_1 extends scala.App{

  def getPersons: List[Option[Person]] = {
    val address1 = List(new Address("#12", "2", "bangalore", "india"))
    val address2 = List(new Address("#13", "3", "chennai", "india"))
    val address3 = List(new Address("#14", "4", "andra", "india"))
    val address4 = List(new Address("#15", "5", "kerala", "india"))

    List(
      Some(new Person(address1)),
      Some(new Person(address2)),
      Some(new Person(address3)),
      Some(new Person(address4))
    )
  }

  def forgienor = println("Person may be forgienor")

  def localLangProblem = println("Or Person dont know the local language")

  def unknownPerson = println("Or Unknow person")

  def persons: List[Option[Person]] = for {
    person <- getPersons
    addrs <- person.get.addresses
    if addrs.city == "kerala"
  } yield person

  println(persons(0) getOrElse (forgienor))
  println(persons.flatten)
}


