public class typesInheritancemulti {
    
    public static void main (String args[]){
    Dog dobby = new Dog();
    dobby.eats();
    dobby.legs=4;
    System.out.println(dobby.legs);
    }}
        //base class 
        class Animal{
            String color;
            void eats(){
            System.out.println("eats");
        }
        void breath(){
            System.out.println("breats");
        }}
        class Mammals extends Animal {
            int legs;
    
    }
    
    //Derive class 
    class Dog extends Mammals {
        String bread;
        
    }

