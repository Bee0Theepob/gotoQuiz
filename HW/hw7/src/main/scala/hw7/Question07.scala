package hw7

object Question07 {
  def square(x:Int)=x*x
  def myMap(f:Int => Int) (list:List[Int]) :List[Int] = {
    if(list.isEmpty){
      return List()
    }
    else{
      return List(f(list.head))++myMap(f)(list.tail)
    }

  }

  def main(args: Array[String]): Unit = {
    println(myMap(x => x*2)(List(1,2,3,4,5)))
    println(myMap(square)(List(1,2,3,4,5)))
  }


}
