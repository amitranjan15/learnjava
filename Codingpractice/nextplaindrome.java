public class nextplaindrome 
{ 
    public static void main(String[] args) {    
       int[] arr={1,2,3,4};
       nextPalindrome(arr,arr.length);
       System.out.println();
    }
    public static void nextPalindrome(int arr[],int len)
    {
        boolean isAll9=true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=9)
            {
                isAll9=false;
                break;
            }
        }
        if (isAll9) {
            System.out.print(1);
            for (int i = 0; i < arr.length-1; i++) {
                System.out.print(0);
            }
            System.out.print(1);        
            return;
        }
        getPalindrome(arr,len);
    }
    public static void getPalindrome(int arr[],int len)
    {
        int center=len/2;
        int beforeCenter=center-1;
        int afterCenter=len%2==0?center:++center;
        for(;beforeCenter>=0 && arr[beforeCenter]==arr[afterCenter];){
            beforeCenter--;
            afterCenter++;
        }   
        boolean isSmall=false; 
        if(beforeCenter<0 || arr[beforeCenter]<arr[afterCenter])
        {
            isSmall=true;
        }
        for(;beforeCenter>=0;)
        {
            arr[afterCenter++]=arr[beforeCenter--];
        }
        if(isSmall)
        {
            int increment=1;
            if(len%2==1)
            {
                arr[center]=arr[center]+1;
                increment=arr[center]/10;
                arr[center]=arr[center]%10;
            }
            beforeCenter=center-1;
            afterCenter=len%2==0?center:center++;
    
            for (;beforeCenter >= 0 && increment>0;) 
            { 
                arr[beforeCenter] = arr[beforeCenter] + increment; 
                increment = arr[beforeCenter] / 10; 
                arr[beforeCenter] %= 10; 
                arr[afterCenter] = arr[beforeCenter]; 
                beforeCenter--; 
                afterCenter++; 
            } 
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    
} 
