package hw4

object Question04 {
  def reverse(l:List[Any]): List[Any] = {
    if(l.isEmpty){
      return List()
    }
    else{
      return reverse(l.tail)++List(l.head)
    }
  }
  def palindrome(l :List[Any]): Boolean ={
    return l==reverse(l)

  }

  def main(args: Array[String]): Unit = {
    var mylist=List(5,1,2,3,3,2,1,5)
    print(palindrome(mylist))
  }

}
