# Java and Scala Tinkering

## What is!

This is just a small java/scala mini project tries to explore some of the fancy capabilities of scala and at the same time try to use it in a java codebase. The code here is exoteric and a bit to an extreme and the purpose is to show some of the problems that we can create by pushing the specifics of the scala language too far from Java conservative specification. 

The demo application consists of a *god* module in which we define the *God* trait and an *DSL* builder strategy.

We can see the expressiveness of the language in the following snippet

```scala
    val deadPool = "Deadpool" is "a god" that "has"  attack 12 and "has" healer 5 and "has" health 13  rise
    val deadGirl = "Deadgirl" is "a goddess" that "has" attack 5 and "has" healer 2 and "has" health 10 rise

    (deadPool target(deadGirl)) -?> HollyWater
    (deadGirl target(deadPool)) -?> FlowerHeal
```

This is perfectly valid *Scala* code that leverage the DSL build specifically as an example.