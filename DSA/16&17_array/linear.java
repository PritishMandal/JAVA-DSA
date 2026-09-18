public  class linear {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n = 5;
        int result = 6;
        for(int i=0;i<n;i++){
            if (result==arr[i]) {// ye code linear search algorithm ko implement karta hai, jisme hum array ke har element ko check karte hain ki kya wo element result ke barabar hai ya nahi. Agar mil jata hai to "element found" print hota hai, nahi to "element not found" print hota hai.
                System.out.println("element found");
                
            } else {
                System.out.println("element not found");
            }
        }
    }

    
}
