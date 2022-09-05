public class loop {
    public static void main(String args[]){
        int sum = 1;

        for(int i = 2 ; i <= 10 ; i++)
            sum += i ;
        System.out.println("sum of first 10 number is "+ sum);

        int i = 2 ;
        sum = 1;
        while(i <= 10)
        {
            sum += i;
            ++i;
        }
        System.out.println("sum of first 10 number is "+ sum);

        do
        {
            System.out.println(" hi ");
        }
        while(1 > 7);

    }    
}
