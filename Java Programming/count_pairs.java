class Solution{
    static int countPairs(int arr[], int n){
        int result = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
                if(i*arr[i]>j*arr[j])
                result = result+1;
        }
        return result;
    }
    public static void main(string args[]){
        int arr[]={8,4,2,1};
        int n= arr.length;
        System.out.println("Count of Pairs: "+ countPairs(arr,n));
    
    }
}