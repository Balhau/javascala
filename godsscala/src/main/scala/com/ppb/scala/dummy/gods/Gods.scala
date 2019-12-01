package com.ppb.scala.dummy.gods

trait Minotaur extends God {
  health = 200
  attackPower = 10
  name="Minotaur"

  override def -?>(trick: Trick): God = this
}

trait MiniDemon extends God{
  name = "MiniDemon"
  health = 150
  attackPower = 5
}

trait GoblinHealer extends God {
  name="GoblinHealer"
  health = 50
  attackPower = 1

  override def -!>(trick: Trick) : God = {
    targetGod -- attackPower
    this
  }

  override def -?>(trick: Trick) : God = {
    targetGod ++ trick.heal()
    this
  }
}

