public class lastoccurence {
      public static int lastOccurence(int arr[],int key,int i) {
    if(i == arr.length){// ye line mainly base case hai, jab i arr ki length ke barabar ho jaye toh hum -1 return kar denge
        return -1;
    }
    int isFound =lastOccurence(arr, key, i+1);// ye line recursion call kar rahi hai, aur isFound me last occurence ka index store kar rahi hai
    if(isFound == -1 && arr[i] == key){
      return i;
  } 
  return isFound;
}
  public static void main(String[] args) {
      int arr[]={5,5,5,5};
      System.out.print(lastOccurence(arr, 5, 0));
  } 
      }

