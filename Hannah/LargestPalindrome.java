public class LargestPalindrome{
  
  public static int findLargestPalindrome(){
    int largestPalindrome = 0;
    for(int i = 100; i < 1000; i++){
      for(int j = 100; j < 1000; j++){
        if(isPalindrome(i*j)){
          if(i*j > largestPalindrome){
            largestPalindrome = i*j;
          }
        }
      }
    }
    
    return largestPalindrome;
  }
  
  public static boolean isPalindrome(int n){
    if(n < 99999){
      if(n%10 == n/10000%10){
        if(n/10%10 == n/1000%10){
          return true;
        }
      }
    }else{
      if(n%10 == n/100000%10){
        if(n/10%10 == n/10000%10){
          if(n/100%10 == n/1000%10){
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public static void main(String[] args){
    System.out.println(LargestPalindrome.findLargestPalindrome());
  }
}