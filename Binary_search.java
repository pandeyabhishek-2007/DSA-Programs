//Binary Search//
import java.util.Scanner;
public class Binary_search {
    public static int binary_search(int arr[],int x,int i,int n){
        if(i>n){
            return -1;
        }
int mid = (i+n)/2;
if(arr[mid]==x){
    return mid;
}
else if(arr[mid]>x){
    return binary_search(arr,x,i,mid-1);
}
else {
    return binary_search(arr,x,mid+1,n);
}
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter sorted array : ");
        for(int j=0;j<10;j++){
            arr[j] = sc.nextInt();
        }
         System.out.println("Enter which element you wants to search : ");
        int x = sc.nextInt();
    int result = binary_search(arr,x,0,arr.length-1);
    if(result==-1){
        System.out.println("Element not found.");
    }
    else{
        System.out.println("Element found at index : " +result);
    }
        }
}
