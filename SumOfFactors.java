public class SumOfFactors {
    public static void main(String[] args)
    {
        int digit = 50, sum = 0;
        
        for(int i = 1; i <= digit; i++)
        {
            if((digit % i) == 0)
            {
                sum += i;
            }
        }
        System.out.println("sum of factors is "+ sum);
    }
}
