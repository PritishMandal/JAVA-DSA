
public class builders {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
          //sb.append(ch);
          sb.append(ch).append(" ");// ye space bhi add kar dega har character ke baad, agar space nahi chahiye to sirf sb.append(ch) use kar sakte ho
        }
        System.out.println(sb);//
    
    }
}


