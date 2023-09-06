import java.util.*;

public class AdvancedPatterns
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            //spaces
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print("  ");
            }

            for(int j = 1; j <= n; j++)
            {
                //stars
                if(i == 1 || i == n || j == 1 || j == n)
                {
                    System.out.print(" *");
                }

                //blank spaces
                else
                {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
