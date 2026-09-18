public class linearsearch {
    public static int linearsearch(int numbers [],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int numbers[]={2,4,6,8,10,12,14,16};
      //home work   //String menu[]={"dosa","chole bhature","samosa"} 
        int key =4;
        int index =linearsearch(numbers, key);
        if (index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("key is at index: " + index);
        }
            
        }
    }
       

