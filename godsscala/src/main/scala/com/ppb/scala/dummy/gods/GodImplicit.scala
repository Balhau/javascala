package com.ppb.scala.dummy.gods

object GodImplicit {

  implicit class ImplicitString(godName: String) {
    val godBuilder = new GodBuilder

    def is(str: String): GodBuilder = {
      godBuilder.godName = godName
      godBuilder.desc=godName+" is " +str
      godBuilder
    }
  }

  class GodBuilder {
    var desc : String = _
    var healthLevel : Int  = 0
    var attackLevel : Int = 0
    var healerLevel : Int = 0
    var godName : String = _

    def that(str : String) : GodBuilder = {
      this.desc=this.desc+" that "+str
      this
    }

    def a(): GodBuilder = {
      this.desc=this.desc+" a "
      this
    }

    def a(str : String) : GodBuilder = {
      this.desc=this.desc+" a " + str
      this
    }

    def that(): GodBuilder = {
      this.desc=this.desc+" that "
      this
    }

    def has() : GodBuilder = {
      this.desc=this.desc+" has "
      this
    }

    def and() : GodBuilder = {
      this.desc=this.desc+" and "
      this
    }

    def and(str : String) : GodBuilder = {
      this.desc=this.desc+" and "+str
      this
    }

    def attack(attackLvl : Int) : GodBuilder = {
      attackLevel=attackLvl
      desc+=s" attack level $attackLvl"
      this
    }

    def healer(healerLVL : Int) :GodBuilder = {
      healerLevel=healerLVL
      desc+=s" attack level $healerLevel"
      this
    }

    def health(healthLvl : Int) : GodBuilder = {
      healthLevel=healthLvl
      desc+=s" health level $healthLvl"
      this
    }

    def rise() : God = {
      val god : God = new God {
        attackPower = attackLevel
        healPower = healerLevel
        health = healthLevel
        name=godName

        override def --(): Unit = super.--()
        override def ++(): Unit = super.++()
        override def --(damage: Int): Unit = super.--(damage)
        override def ++(heal: Int): Unit = super.++(heal)
        override def --(god: God): Unit = super.--(god)
        override def ++(god: God): Unit = super.++(god)
        override def ?(god: God): God = super.?(god)

        override def -!>(trick: Trick): God = {
          attackPower != 0 match {
            case true => this -- attackPower
            case _ => super.-!>(trick)
          }
          this
        }

        override def -?>(trick: Trick): God = {
          healerLevel != 0 match {
            case true => this ++ targetGod
            case _ => super.-?>(trick)
          }
          this
        }
      }
      println(s"$desc")
      god
    }
  }

}