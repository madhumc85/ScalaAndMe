package src.covariantAndContravariant

import java.util.Observer
import java.util.concurrent.Future


trait NetworkChannel[T] {
  def write(x: T)
}
