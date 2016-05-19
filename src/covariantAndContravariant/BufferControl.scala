package src.covariantAndContravariant


class BufferControl {
  def control(channel: NetworkChannel[String]) {
    println(channel)
  }

}

object BufferControl {
  def main(args: Array[String]) {
    val bufferControl = new BufferControl
    bufferControl.control(new StringChannel)
    //bufferControl.control(new AnyRefChannel)
  }
}