object Q1 extends App {

  def GCD (n1:Int, n2: Int): Int = n2 match{
    case 0 => n1;
    case n2 if(n2 > n1)=> GCD(n2, n1);
    case n2 => GCD(n2, n1%n2);
  }

  def prime(x: Int, y: Int=2): Boolean = x match{
    case x if(y==x)=>true;
    case x if GCD(x,y)>1=>false
    case x => prime(x, y+1)
  }
  println("Is the value given prime or not?");
  println(prime(5));
  println(prime(8));

}
