object Classes{
  def main(args: Array[String]): Unit = {
    val rover = new Animal
    rover.setName("Rover")
    rover.setSound("Woof")
    printf("%s says %s\n", rover.getName, rover.getSound)

    val whiskers = new Animal("Whiskers", "Meow")
    println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.sound}")
    println(whiskers.toString())

    val spike = new Dog("Spike","Woof", "Grrrrr")
    spike.setName("Spike")
    println(spike.toString())

    val fang = new Wolf("Fang")
    fang.moveSpeed = 36.045
    println(fang.move)

  }
  class Animal(var name: String, var sound: String ){
    this.setName(name)
    this.setSound(sound)
    val id: Int = Animal.newIdNum

    def getName: String = name
    def getSound: String = sound

    def setName(name: String): Unit ={
      if(!name.matches(".*&^%$#@\\d"))
        this.name = name
      else
        this.name = "Invalid Name"
    }

    def setSound(sound: String): Unit ={
      this.sound = sound;
    }

    def this(name: String){
      this("Invalid Name", "No Sound")
      this.setName(name)
    }

    def this() {
      this("Invalid Name", "No Sound")
    }

    override def toString(): String = {
      return "%s with id %d sounds like %s".format(this.name, this.id, this.sound)
    }
  }

  object Animal{
    private var idNumber = 0
    private def newIdNum ={
      idNumber +=1
      idNumber
    }
  }

  class Dog(name: String, sound: String, growl: String) extends Animal(name, sound){
    def this(name: String, sound : String){
      this("Invalid Name", sound, "No Growl")
      this.setName(name)
    }
    def this(name: String){
      this("Invalid Name", "No sound", "No Growl")
      this.setName(name)
    }
    def this(){
      this("Invalid Name", "No sound", "No Growl")
    }
    override def toString(): String = {
      return "%s with id %d sounds like %s or %s".format(this.name, this.id, this.sound, this.growl)
    }
  }

  abstract class Mammal(val name: String){
    var moveSpeed : Double
    def move : String
  }

  class Wolf (name: String) extends Mammal(name){
    var moveSpeed = 35.0
    def move = "The Wolf %s runs %.2f mph".format(this.name, this.moveSpeed)
  }

}