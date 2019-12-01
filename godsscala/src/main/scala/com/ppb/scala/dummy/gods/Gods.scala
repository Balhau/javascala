package com.ppb.scala.dummy.gods

trait Minotaur extends God {
  health = 200
  attackPower = 10

  override def -?>(trick: Trick): God = this
}

trait MiniDemon extends God{
  health = 150
  attackPower = 5
}

trait GoblinHealer extends God {
  health = 50
  attackPower = 1

  override def -!>(trick: Trick) : God = {
    target -- attackPower
    this
  }

  override def -?>(trick: Trick) : God = {
    target ++ trick.heal()
    this
  }
}

