object Q2 extends App {

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

  def primeSeq(a:Int,b:Int=2): Any ={
    if(a>=b){
      if(prime(b))
        println(b);
      primeSeq(a, b+1);
    }

  }
  println("All prime number which less than given number:");
  primeSeq(10);

}
