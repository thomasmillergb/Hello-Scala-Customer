import customer.Customer

/**
  * @author Thomas
  *         Created by Thomas on 08/01/2017.
  */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("hello")
    val customer = new Customer("Thomas Miller", 23)
    val customer2 = customer.clone()
    customer id = 10
    customerMatch(customer, customer2)
    println("Hello " + customer.name + " you are the " + customer.id + " customer.")
    println("Your age was " + customer.age)
    customer increaseAge()
    println("Happy Birthday you age is now " + customer.age)
    println("You are stuck in a time loop")

    (1 to 10).foreach(_ => {
      customer increaseAge()
      println("Happy Birthday you age is now " + customer.age)
    })
    customerMatch(customer, customer2)



  }

  private def customerMatch(customer: Customer, customer2: Customer): Unit = {
    if (customer == customer2) {
      println("Match")
    }
    else {
      println("Not a Match")
    }
  }
}
