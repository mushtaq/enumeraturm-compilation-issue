package issue1

import enumeratum.{Enum, EnumEntry}
import issue1.Base.findValues

import scala.collection.immutable

sealed trait Base extends EnumEntry

class Derived extends Base

object Base extends Enum[Base] {
  override def values: immutable.IndexedSeq[Base] = findValues // compilation error fixed!

  case object E1 extends Base
  case object E2 extends Base
}

object Demo {
  def main(args: Array[String]): Unit = {
    println(Base.values) // Vector(E1, E2)
  }
}
