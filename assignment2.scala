package sparkscala

object Hello {
  def main(args: Array[String]) {
//    println("Hello!")
//    val val1:Int = 8
//    val1 = 9

//    var var1:Int = 8
//    var1 = 9
//    println(var1)

    def multiply(x:Int,y:Int):Int={
      var tmp: Int = 0
      tmp = x*y
      tmp
    }
//    tmp = 100
    println("multiplication of two numbers:" + multiply(10,20))
  }
}
