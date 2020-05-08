
public class RotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        //roate(arr,arr.length,4);
        cyclicallyRotate(arr);
        printArr(arr);
    }
    public static void roate(int arr[],int len,int roateBy)
    {
        for (int i = 0; i < roateBy; i++) {
            int head=arr[0];
            for (int j = 0; j < len; j++) {               
                
                if(j==len-1)
                {
                    arr[j]=head;
                }
                else
                {
                    arr[j]=arr[j+1];
                }
            }
        }
        
    }
    
    public static void cyclicallyRotate(int arr[])
    {
        int temp=arr[arr.length-1];
        for (int i = arr.length-1; i >=0; i--) {
            if(i==0)
            {
                arr[i]=temp;
            }
            else
            {
                arr[i]=arr[i-1];
            }           
        }
    }
    public static void printArr(int arr[])
    {
        for (int j = 0; j < arr.length; j++) {               
            System.out.print(arr[j]);           
        }
        System.out.println();
    }
}