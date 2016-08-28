import java.util.Scanner;

public class Camel
 {
 public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter any sentence : ");
  String input1=sc.nextLine();
  String result = "";
   char firstchar=input1.charAt(0);
   result=result+Character.toUpperCase(firstchar);
    for(int i;i<=input1.length();i++)
    {
    char currntchar=input1.charAt(i);
    char prevchar=input1.charAt(i-1);
    if(prevchar ==' ')
    result=result+Character.toUpperCase(currntchar);
     else
    result=result+currntchar;
    }
  System.out.println(result);
  }
}
  
