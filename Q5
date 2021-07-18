object Q5 extends App {

  def addEven(n:Int): Int=n match{
    case 0 => 0;
    case 1 => 1;
    case n if(n<0) => 0;
    case n => (n+addEven(n-2));
  }

  def lessNum(n:Int): Int ={
    if(n%2==0)
      addEven(n-2);
    else
      addEven(n-1);
  }

  println("Addition of all even numbers less than given n");
  println(lessNum(12));
}
