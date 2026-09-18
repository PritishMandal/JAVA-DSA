   public class linearsearch2{
    public static int linearsearch(String[] menu,String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==(key)){// ye code menu array ke har element ko check karega, aur agar current element key ke barabar hai to i return karega, aur agar loop khatam ho jata hai to -1 return karega.
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args ) {

        String menu[]={"dosa","chole bhature","samosa"};
        String key ="dosa";
        int index =linearsearch(menu, key);// ye code linearsearch method ko call karega, jisme menu array aur key pass kiya jayega, aur uska result index variable me store hoga. Agar index -1 hai to "NOT FOUND" print hoga, nahi to "key is at index: " + index print hoga.
        if (index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("key is at index: " + index);
        }
            
        }
}
    


 