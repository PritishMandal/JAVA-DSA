public class firstoccurence {
  public static int firstoccurence(int arr[],int key,int i) {
    if(i == arr.length){
        return -1;
    }
    if(arr[i]== key){
        return i ;
    }
    return firstoccurence(arr, key, i + 1);
      
  } 
  public static void main(String[] args) {
      int arr[]={8,3,6,9,5,10,2,5,3};
      System.out.print(firstoccurence(arr, 5, 0));
  } 
}
