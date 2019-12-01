package com.ppb.scala.dummy

import com.ppb.scala.dummy.gods.{DarkMana, FireBreath, FlowerHeal, GoblinHealer, God, HollyWater, MiniDemon, Minotaur, Trick, UpperSlam}

/**
 * Hello world!
 *
 */

class AppGods {
  def run() : Unit ={

    val minotaur : God = new Minotaur {}
    val miniDemon : God = new MiniDemon {}
    val goblin : God = new GoblinHealer {}
    val devilsMaid : God = new GoblinHealer {}



    miniDemon ? minotaur
    minotaur ? miniDemon
    goblin ? minotaur
    devilsMaid ? miniDemon

    miniDemon -!> FireBreath --;
    goblin -?> FlowerHeal -?> HollyWater;
    minotaur -!> UpperSlam --;
    devilsMaid -?> DarkMana -?> DarkMana


  }
}

object AppGods extends App {

  new AppGods().run()
}
