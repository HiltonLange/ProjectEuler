public class EvenFibonacci{
  
  public static int calculate(int upperLimit){
    int x = 1;
    int y = 2;
    int z = 2;
    int temp;
    //System.out.println("upperLim" + (x<upperLimit));
    while(x < upperLimit){
      //System.out.println("In for" + x);
      temp = y;
      y += x;
      x = temp;
      
      if(y%2 ==0){
        //System.out.println("In for" + y);
        z += y;
      }
    }
    
    return z;
  }
  
  public static void main(String[] args){
    System.out.println(EvenFibonacci.calculate(4000000));
  }
}