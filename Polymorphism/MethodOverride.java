    class Dog{
        public void bark(){
            System.out.println("woof ");
        }
    }
    class Hound extends Dog{
        public void bark(){
            System.out.println("ruf-ruf");
        }
    }
    
    class OverridingTest{
        public static void main(String [] args){
            Dog dog1 = new Dog();
            dog1.bark();
            Dog dog2 = new Hound();
            dog2.bark();
            
        }
    }
