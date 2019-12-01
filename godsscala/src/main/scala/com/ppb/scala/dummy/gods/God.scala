package com.ppb.scala.dummy.gods

/**
  * Behaviour of god
  */
trait God {
  var health : Int = 100
  var attackPower : Int = 1
  var target : God = _



  /**
    * Decrease health
    */
  def --() : Unit = this -- attackPower

  /**
    * Increase health
    */
  def ++() : Unit = this ++ attackPower

  /**
    * Decrease health by damage
    * @param damage
    */
  def --(damage:Int) = {
    health=health-damage
    println(s"$this Health: $health")
  }

  /**
    * Increase by damage
    * @param heal
    */
  def ++(heal : Int) = {
    health=health+heal
    println(s"$this Health: $health")
  }

  /**
    * Attack other god
    * @param god
    */
  def --(god : God) : Unit = god --

  /**
    * Heal other god
    * @param god
    */
  def ++(god : God) : Unit = god ++

  /**
    * Target god
    * @param god
    */
  def ?(god: God) : God = {
    target = god
    this
  }

  /**
    * Combine an offensive trick into god
    * @param trick
    * @return
    */
  def -!>(trick : Trick) : God = {
    this
  }

  /**
    * Combine a regenerative trick into god
    * @param trick
    * @return
    */
  def -?>(trick: Trick) : God = {
    this
  }

}
