public class SmallestMultiple{
  
  public static int findSmallestMultiple(){
    int divisibleUpTo = 1;
    int num = 20;
    
    while(true){
      
      for(int i = 1; i <= 20; i++){
        if(num%i == 0){
          divisibleUpTo++;
        }else{
          divisibleUpTo = 0;
        }
      }
      
      if(divisibleUpTo == 20){
        return num;
      }
      
      num++;
    }
  }
  
  public static void main(String[] args){
    System.out.println(SmallestMultiple.findSmallestMultiple());
  }
}