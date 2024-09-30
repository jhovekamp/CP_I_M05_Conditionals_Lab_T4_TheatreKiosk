import java.util.Scanner;

//Program AgeVerification
//class AgeVerification
    //main()
        //num age = 0
            //output "How old are you (in years)?: "
        //input age
        //if age >= 21 then
            //output "You are " + age + "years old. See the associate for a 21+ wristband!"
        //endif
    //return
//endClass
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;
        String trash = "";

        System.out.print("Enter your age: ");
        age = Integer.parseInt(in.nextLine());
        if(age >= 21)
        {
            System.out.println("You are " + age + ". You get a wristband!");
        }
        else
        {
            System.exit(0);
        }
    }
}