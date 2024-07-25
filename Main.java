import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        int number,userinput,i,a;
        Random integer=new Random();
        Scanner obj1=new Scanner(System.in);
        number=integer.nextInt(100);
        number+=1;
        System.out.println("-----------------------------------------------------Number Game-----------------------------------------------------");
        System.out.println("Would you like to play the game??");
        System.out.println("1.Yes");
        System.out.println("2.No");
        a=obj1.nextInt();
        if(a==1)
        {
        System.out.println("You have 3 attempts......");
        System.out.println("Enter the number");
        for(i=0;i<3;i++)
        {
         userinput=obj1.nextInt();
         if(userinput==number)
         {
             System.out.println("Congratulations you win ");
         }
         else
        {
            if(i!=2)
            {
            System.out.println("Again try");
            }
        } 
    }
    System.out.println("you lost");
        }
        else
        {
            System.out.println("Thank you for your interest in number game.");
        }
}
}    