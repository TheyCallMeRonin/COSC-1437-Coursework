import java.util.Scanner;

public class CellPhoneService
{
    public static void main(String[]args)
    {
        // declaration of variables
        int talktime;
        int textmessagessent;
        double gbofdata;

        Scanner messages = new Scanner(System.in);

        System.out.print("Enter the talk time per month: ");
        talktime = messages.nextInt();

        System.out.print("Enter text messages per month: ");
        textmessagessent = messages.nextInt();

        System.out.print("Enter the Gigabyte data used per month: ");
        gbofdata = messages.nextDouble();

        //Plan A
        if ((talktime < 500) && (textmessagessent == 0) && (gbofdata == 0))
        {
            System.out.print("Plan A at $49 permonth");
        }

        //Plan B
        else if ((talktime < 500) && (textmessagessent > 0) && (gbofdata == 0))
        {
            System.out.print("Plan B at $55 per month: ");
        }

        //Plan C
        else if ((talktime >= 500) && (textmessagessent < 100) && (gbofdata == 0))
        {
            System.out.print("Plan C at $61 per month");
        }

        //Plan D
        else if ((talktime >= 500) && (textmessagessent >= 100) && (gbofdata == 0))
        {
            System.out.print("Plan D at $70 per month");
        }

        //Plan E
        else if ((gbofdata > 0) && (gbofdata < 3))
        {
            System.out.print("Plan E at $79 per month");
        }

        //Plan F
        else if (gbofdata >= 3)
        {
            System.out.print("Plan F at $87 per month");
        }
    }
}