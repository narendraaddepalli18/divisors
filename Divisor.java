import java.util.Scanner;
class Divisor{
    public static void main(String args[]){
Scanner s=new Scanner(System.in);
    System.out.println("enter a number to check divisibles");
    int num=s.nextInt();
    System.out.println("The divisors of "+num+" are:");

    for(int i=1;i<=num;i++){
        if (num%i==0){
            
 System.out.println(i);
        }
    }
    
}
    }
