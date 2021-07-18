object Q3 extends App {

  def sum(n:Int):Int={
    if(n==1)
      1;
    else
      n+sum(n-1);
  }
  println("addition of numbers from 1 to n");
  println(sum(5));

}
