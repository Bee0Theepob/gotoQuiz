package hw1

import jdk.internal.org.jline.utils.InfoCmp.Capability

object Question01 {
  def insertAtPosition(x: Any, pos: Int, l: List[Any]): List[Any] = {
      if(pos<0 || pos>l.length){
        return l
      }
      else if(pos==l.length-1){
        return l++List(x)
      }
      else{
        if(pos==0){
          return List(x)++l
        }
        else{
          List(l.head)++insertAtPosition(x,pos-1,l.tail)
        }
      }
    }


    def main(args: Array[String]): Unit = {
      var myList:List[Any]=List(0,1,2,3,5,6)
      for(i <-0 to 6){
        println(insertAtPosition(99,i,myList))
      }
    }
}
