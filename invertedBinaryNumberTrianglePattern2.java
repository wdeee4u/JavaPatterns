import java.util.*;

public class Patterns
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row size of pattern: ");
        int n = sc.nextInt();

        int count = 1;
        for(int i = n; i >= 1; i--)
        {
            for(int j = i; j >= 1; j--)
            {
                if((i + j)%2 == 0)
                {
                    System.out.print("1 ");
                }

                else if((i + j)%2 == 1)
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
