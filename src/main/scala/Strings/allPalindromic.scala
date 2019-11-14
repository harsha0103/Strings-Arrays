package Strings
//https://www.geeksforgeeks.org/given-a-string-print-all-possible-palindromic-partition/
object allPalindromic {
  def main(args: Array[String]): Unit = {

    //var string = "a,b,$c".toArray
//    var string = "geeks".toArray
    var string = "nithtienin".toArray
    //var nstring = string
    var i = 0
    var j = string.length - 1

    //check where to switch
      while (j >= i && i <= string.length - 1) {
        if (string.charAt(i) == string.charAt(j)) {
          if (isPalindrome(string.subSequence(i, j+1).toString)) {
            println(string.subSequence(i, j+1).toString)
              i = j+1
              j = string.length - 1
          }
          else{
            j=j-1
          }
        }
        else {
          j = j - 1

        }
      }
  }
  //find if the character is alphabet or not
  def isPalindrome(x: String): Boolean = {
    if (x==x.reverse){
      true
    }
    else {
      false
    }
  }

}
