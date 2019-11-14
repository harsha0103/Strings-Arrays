package Strings

object sumArrayLessThanGivenNumber {
// Simple way is to achieve it by using 3 loops each loop uses O(n3)
//  Below example shows it

//if there is a sorted arry we can reduce the complexity O(n2)
  def main(args: Array[String]): Unit = {

    //var string = "a,b,$c".toArray
    var array = Array(5, 1, 3, 4, 7)
    //find all the possible sume less than give number
    var number = 12
    var i = 0
    var j=1
    var k = array.length - 1
    var sum =0
    for (i <- 0 to array.length - 3){
     for(j<- i+1 to array.length-2){
      for(k<-j+1 to array.length-1 ){
        if (isValidSum(Array(array(i),array(j), array(k)),number)) {
          sum=sum+1
        }
      }
     }
    }
    println(sum)
  }


  def isValidSum(x: Array[Int],number:Int): Boolean = {
    if (x.sum<number){
       true
    }
    else{
      false
    }
  }
}