package hw9

object Question09 {
  def f1(c:Char): Char = {
    return c.toLower
  }
  //val tape = List('C','H','A','R')

  def turingStep(f:Char => Char,tape:List[Char], n:Int): List[Char] ={
    if(n==0 || tape.isEmpty){
      return tape
    }
    else{
      return List(f(tape.head))++turingStep(f,tape.tail,n-1)
    }
  }

  def main(args: Array[String]): Unit = {
    var tape = List('C','H','A','R')

    println(turingStep(f1,tape,2))
    println(turingStep(f1,tape,3))
    println(turingStep(f1,tape,0))
    println(turingStep(f1,tape,5))
  }


}
