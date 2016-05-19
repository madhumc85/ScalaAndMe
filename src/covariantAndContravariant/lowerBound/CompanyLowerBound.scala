package src.covariantAndContravariant.lowerBound

/**
  * Created by chamadhu on 5/16/2016.
  */

class CompanyLowerBound[+T](val CompanyLowerBound: T) {
  def partnerWith[U >: T](y: U) {

  }
}

class CompanyUpperBound[+T](val CompanyUpperBound: T) {
  def partnerWith[U <: CompanyUpperBound[BigCompany]](y: U) {

  }
}

class CompanyInvestor[T](val company: T)

class BigCompany

class SmallCompany extends BigCompany

class Investor(val company: CompanyLowerBound[BigCompany])

class CrappyCompany

object CompanyLowerBound {
  def main(args: Array[String]) {
    val littleCompany: CompanyLowerBound[SmallCompany] = new CompanyLowerBound[SmallCompany](new SmallCompany)

    val bigCompany: CompanyLowerBound[BigCompany] = new CompanyLowerBound[BigCompany](new BigCompany)

    littleCompany.partnerWith(bigCompany)

    val crappyCompany: CompanyLowerBound[CrappyCompany] = new CompanyLowerBound[CrappyCompany](new CrappyCompany)

    littleCompany.partnerWith(crappyCompany)

  }
}

object CompanyUpperBound {
  def main(args: Array[String]) {
    val littleCompany: CompanyUpperBound[SmallCompany] = new CompanyUpperBound[SmallCompany](new SmallCompany)

    val bigCompany: CompanyUpperBound[BigCompany] = new CompanyUpperBound[BigCompany](new BigCompany)

    littleCompany.partnerWith(bigCompany)

   /* val crappyCompany: CompanyUpperBound[CrappyCompany] = new CompanyUpperBound[CrappyCompany](new CrappyCompany)

    littleCompany.partnerWith(crappyCompany)*/

  }
}