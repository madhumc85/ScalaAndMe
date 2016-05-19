package src.depth

/**
  * Created by chamadhu on 5/19/2016.
  */


class Address(val doNo: String, val street: String, val city: String, val country: String)

case class Person(addresses: List[Address])

object Expression_2 {
  def findPeople(city: String, people: List[Person]) = for {
    person <- people.toSet[Person]
    addrs <- person.addresses
    if addrs.city == city
  } yield person



  def main(args: Array[String]) {
    val address1 = List(new Address("#12", "2", "bangalore", "india"))
    val address2 = List(new Address("#13", "3", "chennai", "india"))
    val address3 = List(new Address("#14", "4", "kerala", "india"))
    val address4 = List(new Address("#15", "5", "kerala", "india"))


    val persons = List(new Person(address1),
      new Person(address2),
      new Person(address3),
      new Person(address4)
    )

    //val personXerox = new Person(address2)
    //val person = personXerox.copy(address1)
    //persons.copyToArray()

    val yPersons = findPeople("kerala", persons)
    println(yPersons)
  }

}


