package Strings
//Question : https://www.geeksforgeeks.org/reverse-a-string-without-affecting-special-characters/
object reverseString {

  def main(args: Array[String]): Unit = {

    //var string = "a,b,$c".toArray
    var string = "Ab,c,de!$".toArray
    //var nstring = string
    var i=0
    var j=string.length-1

 //check where to switch
    while(i<j) {

      if (!isAlphanbet(string(i).toString)){
       i=i+1

      }
      else if(!isAlphanbet(string(j).toString)) {
        j=j-1
      }
      else{
        var temp= string(i)
        string(i)=string(j)
        string(j)=temp
        i=i+1
        j=j-1
      }
    }

    string.foreach(print)
  }
//find if the character is alphabet or not
  def isAlphanbet(x: String): Boolean = {
    if ((x >= "A" && x <= "Z") || (x >= "a" && x <= "z")) {
      true
    }
    else {
      false
    }

  }
}
