

package p3
import java.util.Scanner;
public class Tax{
 double basicpay;
  
  public void taxcalculation(){
    Scanner scanner=new Scanner(System.in);
if(basicpay>60000){
    int taxamount=basicpay*0.3;
   basicpay=basicpay-taxamount;
}


  }
}