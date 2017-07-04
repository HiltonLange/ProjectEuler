public class LargestPrimeFactor{
  
  public static int getLargestPrimeFactor(){//long num){
    int prime;
    long upperLim = (long)600851475143;//num;
    while(true){
      prime = getPrime(upperLim);
      if(num%prime == 0){
        return prime;
      }
      
      upperLime = prime;
    }
  }
  
  public int getNextPrime(int upperLim){
    int n = upperLim;
    while(true){
      if(isPrime(n)){
        return n;
      }
      n--;
    }
  }
  
  public static boolean isPrime(int n) {

    if (n > 2 && n%2 == 0){
        return false;
    } 
    int top = (int) Math.sqrt(n) + 1;
    for (int i = 3; i < top; i += 2){
        if (n%i == 0){
            return false;
        }
    }
    return true;
  }
  
  public static void main(String[] args){
    System.out.println(LargestPrimeFactor.getLargestPrimeFactor());
  }
}