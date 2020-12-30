object ScalaMain {
/*This function divides a by greatest divisible power of b*/
 def maxDivide(a: Int, b: Int) : Int =
 {
  var c = a;
  var d = b;
     while(java.lang.Math.floorMod(c, d) == 0){
         c /= d;
    }
     return c;
 }

 /* Function to check if a number is ugly or not */
  def isUgly(no: Int) : Int =
 {
var x = no;
     x = maxDivide(x, 2);
     x = maxDivide(x, 3);
     x = maxDivide(x, 5);

     return if(x == 1) 1 else 0;
 }

 /* Function to get the nth ugly number*/
 def getNthUglyNo(n: Int) : Int =
 {
     var i:Int = 1;

     // ugly number count
     var count:Int = 1;

     // check for all Integers
     // until count becomes n
     while(n > count)
     {
         i=i+1;
         if(isUgly(i) == 1) {
             count=count+1;
         }
     }
     return i;
 }
  def main(args: Array[String]): Unit = {
    var input:Int = 10;
    println("[INPUT] " + input);
    var output:Int = getNthUglyNo(input);
    println("[OUTPUT] " + output);
  }
}
