public class Largestnumberinanarray {
    public static void main(String args[]){
        int arr[]={10,20,30,40,90};
        int ans=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
            

        }
        System.out.println("Largest number is "+ans);

    }
}