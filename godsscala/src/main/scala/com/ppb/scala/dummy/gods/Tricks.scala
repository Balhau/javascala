package com.ppb.scala.dummy.gods

case object FlowerHeal extends Trick {
  override def heal(): Int = 1
}

case object HollyWater extends Trick {
  override def heal() : Int = 5
}

case object FireBreath extends Trick {
  override def hit() : Int = 15
}

case object UpperSlam extends Trick {
  override def hit(): Int = super.hit()
}

case object DarkMana extends Trick{
  override def heal() : Int = 5
}

case object ChainSawLeg extends Trick{
  override def hit(): Int = 10
}