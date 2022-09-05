public class twoDarray {
    public static void main(String[] args)
    {
        int sum[][] = new int[2][2];
        int arr1[][] = { { 1, 2}, { 3, 4} };
        int arr2[][] = { { 2, 4}, { 6, 8} };
        for(int i = 0; i < 2; ++i)
            for(int j = 0; j < 2; ++j)
                sum[i][j] = arr1[i][j] + arr2[i][j];
        for(int[] n : sum)
        {
            for(int m : n)
                System.out.print(m+" ");
            System.out.println("");
    }   }
}
