import java.util.Random;


public class SimulationDriver
{
    public static void main(String[] args)
    {
        Question s1 = new SingleAnswer("What is often seen as the smallest unit of memory? \n1) Byte \n2) Kilobyte \n3) Gigabyte \n4) Terabyte", 1);
        Question s2 = new SingleAnswer("When was the company Nike founded? \n1) 1965 \n2) 1982 \n3) 1971 \n4) 1990 ", 3);


        Question s3 = new MultiAnswer("What two numbers did Kobe Bryant have? \n1)8 \n2)23 \n3)6 \n4)24", 1, 4);
        Question s4 = new MultiAnswer("Which two colors appear on the Greece flag? \n1) Red \n2)Blue \n3)White \n4)Yellow", 2, 3);

        System.out.println(s1.toString());

        //System.out.println(s1.);

        System.out.println(s2.toString());

        

        System.out.println();



        System.out.println(s3.toString());
        System.out.println(s4.toString());
    }
}

