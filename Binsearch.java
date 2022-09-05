public class Binsearch {
    public static void binarySearch(int a[], int a_len, int element){  
        int last = a_len;
        int first = 0;
        int mid = (first + last)/2;  
        while( first <= last ){
            if ( a[mid] == element ){  
                System.out.println("Element "+element+" is found at index: " + mid);  
                break;  
            }
            else if ( a[mid] < element ){
                first = mid + 1;     
            }
            else{  
              last = mid - 1;  
            }  
            mid = (first + last)/2;  
        }  
        if ( first > last ){  
           System.out.println("Element "+element+" is not found!");  
        }  
      } 
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int a_len = a.length - 1;
        int element = 8; 
        binarySearch(a,a_len,element);
    }
}
