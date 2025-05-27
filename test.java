import java.util.Scanner;

class Solution {
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   String x = scanner.nextLine();
   String[] pieces = x.split("");
   String i = pieces[0];
   int j = pieces.length;
   String y = pieces[j-1];
  
   boolean tf = false;
   if(i.equals(y)){
   tf = true;
   System.out.println("true");
   }
   
   if(!tf){
   System.out.println("false");
   }
   
}
}
//Write a program that creates an account with a balance of 100.0, deposits 20.0 in it, and finally prints the balance. NB! 
//Perform all the operations in this exact order.