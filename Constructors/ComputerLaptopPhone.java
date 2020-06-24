class Computer {
   Computer comp;
    Computer() {
       System.out.println("Constructor of Computer class.");
       computer_method();
       computer_details("");
    }
    void computer_method() {
       System.out.println("Power gone! Shut down your Computer soon...");
    }
    void computer_details(String str){
       System.out.println(str);
    }
 }

 class Laptop {
    Laptop() {
       System.out.println("Constructor of Laptop class.");
       laptop_method();
       laptop_details();
    }
    void laptop_method() {
       System.out.println("99% Battery available.");
    }
    void laptop_details(){
      System.out.println("HP Envy 2018 Edition");
    }
 }

 class Phone {
    Phone() {
       System.out.println("Constructor of Phone class.");
       phone_method();
       phone_details();
    }
    void phone_method() {
       System.out.println("Discharging...");
    }
    void phone_details(){
      System.out.println("Oneplus 6 2018 Edition");
    }
 }

 class mainclass{
    public static void main(final String[] args) {
       final Computer c = new Computer();
       final Laptop l = new Laptop();
       final Phone p = new Phone();
        c.computer_method();
        c.computer_details("Dell Inspiron");
        l.laptop_method();
        p.phone_method();
 
     }
 }
