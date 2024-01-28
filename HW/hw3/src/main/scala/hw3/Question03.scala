package hw3

object Question03 {
  def member(x:Any,l:List[Any]): Boolean= {
    if(l.isEmpty){
      return false
    }
    if(l.head==x){
      return true
    }
    return member(x,l.tail)
  }

  def subList(l1: List[Any], l2:List[Any]): Boolean ={
    if(l1.isEmpty){
      return true
    }
    return member(l1.head,l2) && subList(l1.tail,l2)

  }

  def main(args: Array[String]): Unit = {
    var mylist1=List(0,1,2,3,4,5,6)
    var mylist2=List(0,1,2,3,4,5,6,7,8,9)
    print(subList(mylist1,mylist2))
  }

}
