public class Factors {
    public static void main(String[] args)
    {
        int digit = 50;
        
        for(int i = 1; i <= digit; i++)
        {
            if((digit % i) == 0)
            {
                System.out.println(i);
            }
        }
    }
}
