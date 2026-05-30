
import java.util.Scanner;

class hello {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
    //    String name =  input.nextLine();
    //    int  age = input.nextInt();
    //    input.nextLine();
    //    String address =  input.nextLine();

    //     System.out.print(name);
    //     System.out.print(age);
    //     System.out.print(address);
    // int a = input.nextInt();
    // int b = input.nextInt();
    // int c = input.nextInt();
    // int d = a*b*c;
    // int e = a+b+c;
    //     System.out.print(d/e);
   
   String name  = input.nextLine();
   double score =  input.nextDouble();
      input.nextLine();
      String department =  input.nextLine();
      System.out.println("My name is " + name);
      System.out.println("My score is" + score/10 + "/10");
      System.out.print("My department is " + department);
    }
}
