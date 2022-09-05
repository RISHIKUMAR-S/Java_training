public class PrimeFactors {
    public static void main(String[] args)
    {
        int digit = 20, flag;
        int temp = digit;
        int i = 2;
        while(temp >= i)
        {
            flag = 1;
            if(temp % i == 0)
            {
                flag = 0;
                for(int j = 2; j <= (i/2); j++)
                {
                    if((i % j) == 0)
                    {
                        flag = 1;
                        i++;
                        break;
                    }
                }
            }
            if(flag == 0)
            {
                System.out.print(i+" ");
                temp /= i;
                continue;
            }
            else
                i++;
                
        }
    }    
}
