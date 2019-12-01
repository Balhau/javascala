package com.ppb.scala.dummy

import com.ppb.scala.dummy.gods.{ChainSawLeg, DarkMana, FireBreath, FlowerHeal, GoblinHealer, God, HollyWater, MiniDemon, Minotaur, Trick, UpperSlam}
import com.ppb.scala.dummy.gods.GodImplicit._

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

    val deadPool = "Deadpool" is "a god" that "has"  attack 12 and "has" healer 5 and "has" health 13  rise
    val deadGirl = "Deadgirl" is "a goddess" that "has" attack 5 and "has" healer 2 and "has" health 10 rise



    miniDemon ? minotaur
    minotaur ? miniDemon
    goblin ? minotaur
    devilsMaid ? miniDemon

    miniDemon -!> FireBreath --;
    goblin -?> FlowerHeal -?> HollyWater;
    minotaur -!> UpperSlam --;
    devilsMaid -?> DarkMana -?> DarkMana

    (goblin target(deadPool)) -!> UpperSlam
    (deadPool target(goblin)) -!> ChainSawLeg
    (minotaur target(deadGirl)) -!> UpperSlam
    (deadPool target(deadGirl)) -?> HollyWater
    (deadGirl target(deadPool)) -?> FlowerHeal
  }
}

object AppGods extends App {

  new AppGods().run()
}
