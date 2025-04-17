public class LargestNumberInArray {
    
    public static void main(String[] args) {
        int arr[]={12,32,12,43,76,43};
        int largest=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
