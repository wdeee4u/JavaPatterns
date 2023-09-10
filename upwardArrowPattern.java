import java.util.;

public class Patterns 
{
    public static void main(String[] args) 
    {

        int n = 5;
        int m = 2;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n-i; j++)
            {
                System.out.print("  ");
            }
          
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* " + "  ");
            }
          
            System.out.println();
        }

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= m + 1; j++)
            {
                System.out.print("  ");
            }
          
            for (int j = 1; j <= m; j++)
            {
                System.out.print("* " + " ");
            }
          
            System.out.println();
        }
    }
}
