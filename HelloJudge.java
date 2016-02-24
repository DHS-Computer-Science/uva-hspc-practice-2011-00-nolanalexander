import java.util.Scanner;

public class HelloJudge 
{

   public static void main(String[] args)
   {  
      int numJudges;
      Scanner scan = new Scanner(System.in);
      numJudges = scan.nextInt();
      for(int i=0;i<numJudges;i++){
         System.out.println("Hello World, Judge "+(i+1)+"!");
      }
   }

}