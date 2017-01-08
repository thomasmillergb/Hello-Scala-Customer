package customer

/**
  * @author Thomas
  *         Created by Thomas on 08/01/2017.
  */
class Customer(var name : String, var age : Int) {
var id = 0

  def increaseAge(){
    age = age + 1
  }

  override def clone(): Customer ={
    new Customer(name, age)
  }


  def canEqual(other: Any): Boolean = other.isInstanceOf[Customer]

  override def equals(other: Any): Boolean = other match {
    case that: Customer =>
      (that canEqual this) &&
        name == that.name &&
        age == that.age
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(id, name, age)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
