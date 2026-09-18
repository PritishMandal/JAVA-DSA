public class Static {
  public static void main(String[] args) {
      Student s1 = new Student();
      s1.schoolname="TGPCET";
      Student s2 = new Student();
      System.out.println(s2.schoolname); 

  }  
}
class Student{
    String name ;
    int roll;
    static String schoolname;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}