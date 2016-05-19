package src.covariantAndContravariant


class AnyRefChannel extends NetworkChannel[AnyRef] {
  override def write(x:AnyRef) {

  }
}

class StringChannel extends NetworkChannel[String] {
  override def write(x:String) {

  }
}