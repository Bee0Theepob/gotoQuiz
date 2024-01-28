package hw6

object Question06 {
  def isLessThan3(x:Int) = x<3

  def myFilter(f:Int => Boolean) (list:List[Int]) :List[Int] = {
    if(list.isEmpty){
      return List()
    }
    else{
      if(f(list.head)){
        return List(list.head)++myFilter(f)(list.tail)
      }
      else{
        return myFilter(f)(list.tail)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    println(myFilter(x => x%2==0)(List(1,2,3,4,5)))
    print(myFilter(isLessThan3)(List(1,2,3,4,5)))
  }

}
