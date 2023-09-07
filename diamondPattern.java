import java.util.*;

public class AdvancedPatterns
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //upper half
        for(int i = 1; i <= n; i++)
        {
            //spaces
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print("  ");
            }

            //first half numbers
            for(int j = i; j >= 1; j--)
            {
                System.out.print("*" + " ");
            }

            //second half numbers
            for(int j = 2; j <= i; j++)
            {
                System.out.print("*" + " ");
            }

            System.out.println();
        }

        //lower half
        for(int i = n; i >= 1; i--)
        {
            //spaces
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print("  ");
            }

            //first half numbers
            for (int j = i; j >= 1; j--)
            {
                System.out.print("*" + " ");
            }

            //second half numbers
            for (int j = 2; j <= i; j++)
            {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
}
