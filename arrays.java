public class arrays {
    public static void main(String[] args)
    {
        // int arr[]; // declaring
        // arr = new int[10]; // allocating the memory
        int arr[] = new int[]{ 1,3,2,9,5,10,7,8,4,6 };
        for(int i = 0; i < (arr.length - 1); ++i)
        {
            for(int j = i+1; j < arr.length; ++j)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int n : arr)
            System.out.print(n+" ");
    }
}
