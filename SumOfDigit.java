public class SumOfDigit {
    public static void main(String[] args)
    {
        int digit = 456, sum = 0;
        int temp = digit;
        while(temp > 0)
        {
            sum += (temp %10);
            temp /= 10;
        }
        System.out.println("Sum of digit of the number is " + sum);
    }    
}
