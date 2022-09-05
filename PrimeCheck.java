public class PrimeCheck {
    public static void main(String[] args)
    {
        int digit = 5, flag = 0;
        
        for(int i = 2; i <= (digit/2); i++)
        {
            if((digit % i) == 0)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");
    }    
}
