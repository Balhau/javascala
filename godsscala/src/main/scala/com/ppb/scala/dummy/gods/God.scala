package com.ppb.scala.dummy.gods

/**
  * Behaviour of god
  */
trait God {
  var name = "unknownGod"
  var health: Int = 100
  var attackPower: Int = 1
  var healPower : Int = 1
  var targetGod: God = _


  override def toString: String = {
    val targetName = targetGod match {
      case null => "None"
      case _ => targetGod.name
    }

    s"name: $name, health:  $health, attack: $attackPower, targetGod: ${targetName}"
  }

  def target(godTgt: God): God = {
    targetGod = godTgt
    this
  }

  /**
    * Decrease health
    */
  def --(): Unit = this -- attackPower

  /**
    * Increase health
    */
  def ++(): Unit = this ++ attackPower

  /**
    * Decrease health by damage
    *
    * @param damage
    */
  def --(damage: Int) = {
    health = health - damage
    println(s"DAMAGE | $this | => Health: $health")
  }

  /**
    * Increase by damage
    *
    * @param heal
    */
  def ++(heal: Int) = {
    health = health + heal
    println(s"HEAL: | $this | => Health: $health")
  }

  /**
    * Attack other god
    *
    * @param god
    */
  def --(god: God): Unit = god -- attackPower

  /**
    * Heal other god
    *
    * @param god
    */
  def ++(god: God): Unit = god ++

  /**
    * Target god
    *
    * @param god
    */
  def ?(god: God): God = {
    targetGod = god
    this
  }

  /**
    * Combine an offensive trick into god
    *
    * @param trick
    * @return
    */
  def -!>(trick: Trick): God = {
    this
  }

  /**
    * Combine a regenerative trick into god
    *
    * @param trick
    * @return
    */
  def -?>(trick: Trick): God = {
    this
  }

}
