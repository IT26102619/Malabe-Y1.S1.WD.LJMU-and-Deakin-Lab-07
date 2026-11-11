import java.util.Scanner;
public class IT26102619Lab7Q1B{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++){

            System.out.println("Student " + i);
            System.out.print("Enter subject mark 1 : ");
            int mark1 = input.nextInt();
            System.out.print("Enter subject mark 2 : ");
            int mark2 = input.nextInt();
            System.out.print("Enter subject mark 3 : ");
            int mark3 = input.nextInt();
            System.out.print("Enter subject mark 4 : ");
            int mark4 = input.nextInt();

            double avg = (mark1 + mark2 + mark3 + mark4) / 4.0;
            System.out.println("Average is: " + avg);

            if (avg >= 75 && avg <= 100)
            {
                System.out.println("Overall Grade is : Distinction");
            }
            else if (avg >= 50 && avg < 75)
            {
                System.out.println("Overall Grade is : Credit");
            }
            else
            {
                System.out.println("Overall Grade is : Fail");
            }

            System.out.println();
        }
    }
}