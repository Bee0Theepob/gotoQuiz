package hw2

object Question02 {
  def insertInOrder(x: Int, l:List[Int]): List[Int] ={
      if(l.isEmpty){
        return l++List(x)
      }

      if(x<l.head){
        return List(x)++l
      }
    return List(l.head)++insertInOrder(x,l.tail)
  }

  def main(args: Array[String]): Unit = {
    var mylist=List(1,5,9,10,20,25,38,69,112)
    println(insertInOrder(6,mylist))
    println(insertInOrder(70,mylist))
    println(insertInOrder(113,mylist))
  }

}
