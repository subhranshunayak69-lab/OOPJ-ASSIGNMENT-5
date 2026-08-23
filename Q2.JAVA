import java.lang.*;

class A5Q2
{
    public static void main(String args[])
    {
        int i, j;
        int fact;
        double sum = 0;

        for(i = 1; i <= 5; i++)
        {
            fact = 1;

            for(j = 1; j <= i; j++)
            {
                fact = fact * j;
            }

            sum = sum + (1.0 / fact);
        }

        System.out.println("Answer = " + sum);
    }
}