object Q4 extends App {

  def isEven(n:Int): Boolean=n match{
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int):Boolean = {
    ! (isEven(n))
  }

  println("Determine even and odd numbers");
  println(isEven(4));
  println(isEven(7));
  println(isOdd(11));
  println(isOdd(10));

}
