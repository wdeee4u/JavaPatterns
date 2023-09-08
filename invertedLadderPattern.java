import java.util.*;

public class AdvancedPatterns
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= 4; i++)
        {
            //first triangle
            for(int j = 1; j <= i; j++)
            {
                System.out.print("$" + " ");
            }

            System.out.println();
        }

        for(int i = 1; i <= 4; i++)
        {
            //spaces
            for(int j = 1; j <= 4; j++)
            {
                System.out.print("  ");
            }

            //second triangle
            for(int j = 1; j <= i; j++)
            {
                System.out.print("$" + " ");
            }
            System.out.println();
        }

        for(int i = 1; i <= 4; i++)
        {
            //spaces
            for(int j = 1; j <= 8; j++)
            {
                System.out.print("  ");
            }

            //second triangle
            for(int j = 1; j <= i; j++)
            {
                System.out.print("$" + " ");
            }
            System.out.println();
        }
    }
}
