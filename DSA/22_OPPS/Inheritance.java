public class Inheritance {
    public static void main (String args[]){
        Fish shark=new Fish();
        shark.eats();
        
    }}
        //base class 
        class Animal{
            String color;
            void eats(){
            System.out.println("eats");
        }
        void breath(){
            System.out.println("breats");
        }
    }
    //Derive class 
    class Fish extends Animal {
        int fins;
        void swins(){
            System.out.println("swins in water");
        
    }
    }
