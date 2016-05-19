import java.util

import scala.collection.immutable.HashMap

class Company[T](val company: T) {
  def test(x: T): T = {
    return x
  }
}

class CompanyList[+List](val company: List) {

}

