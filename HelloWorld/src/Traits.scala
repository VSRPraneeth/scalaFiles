object Traits{
  def main(args: Array[String]): Unit = {

    val superMan = new SuperHero("SuperMan")
    println(superMan.fly)
    println(superMan.hitByBullet)
    println(superMan.ricochet(2500))

  }
  trait Flyable{
    def fly : String
  }
  trait BulletProof{
    def hitByBullet : String
    def ricochet(startspeed : Double) : String ={
      "The Bullet ricochets at a speed of %.1f ft/sec".format(startspeed*.75)
    }
  }

  class SuperHero(val name: String) extends Flyable with BulletProof{
    def fly ="%s flys through air".format(this.name)
    def hitByBullet = "The Bullet bounces off of %s".format(this.name)
  }
}