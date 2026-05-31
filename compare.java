import java.util.Scanner;

class compare {
    public static void main(String args[]){
   Scanner scan = new Scanner(System.in);
   int num1 =  scan.nextInt();
   int num2 =  scan.nextInt();
   if(num1 == num2){
    System.out.print("Both are Equal");
   }else{
    System.out.print("Not Equal");
   }

    }
}