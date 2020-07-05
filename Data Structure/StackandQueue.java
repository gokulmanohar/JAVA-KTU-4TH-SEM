import java.util.Scanner;
//-------------------------------------------------------------------------------
//------------------------------GLOBAL VARIABLES---------------------------------
//-------------------------------------------------------------------------------
class Global_Variables{
   public static int top = -1, size;
   public static int[] stack_array = new int[50];
   public static int front = -1, rear = -1;
   public static int[] queue_array = new int[50];
}

//-------------------------------------------------------------------------------
//--------------------------------INSERT CLASS-----------------------------------
//-------------------------------------------------------------------------------
class Insert{
   Scanner scan = new Scanner(System.in);
   String checkforDS;

   //CONSTRUCTOR OVERLOADING
   Insert(String ds){
      this.checkforDS = ds;
   }
   Insert(){
      checkforDS = "Queue";
   }
   void insert(){
      if(checkforDS == "Stack")
      {
         insert_into_stack();
      }
      else if(checkforDS == "Queue")
      {
         insert_into_queue();
      }
      else{
         System.out.println("\nAn Error Occurred!");
         System.exit(1);
      }
   }
   void insert_into_stack(){
      System.out.println("\nInserting item into Stack...");
      int num;
      if(Global_Variables.top==Global_Variables.size-1)
      {
         System.out.println("\nStack Overflow!");
         return;
      }
      else
      {
         System.out.println("\nEnter a number for insertion:");
         num = Integer.parseInt(scan.next());
         Global_Variables.top = Global_Variables.top + 1;
         Global_Variables.stack_array[Global_Variables.top] = num;
         System.out.println("\nElement Inserted Successfully!");
      }
   }
   void insert_into_queue(){
      System.out.println("\nInserting item into Queue...");
      int add_item;
      if (Global_Variables.rear == 49)
      {
         System.out.println("\nQueue Overflow!");
         return;
      }
      else
      {
      if (Global_Variables.front == -1){
         Global_Variables.front = 0;
      }
      System.out.println("\nEnter a number for insertion:");
      add_item = Integer.parseInt(scan.next());
      Global_Variables.rear = Global_Variables.rear + 1;
      Global_Variables.queue_array[Global_Variables.rear] = add_item;
      System.out.println("\nElement Inserted Successfully!");
      }
   }
}

//-------------------------------------------------------------------------------
//--------------------------------DELETE CLASS-----------------------------------
//-------------------------------------------------------------------------------
class Delete{
   String checkforDS;
   
   //CONSTRUCTOR OVERLOADING
   Delete(String ds){
      this.checkforDS = ds;
   }
   Delete(){
      checkforDS = "Queue";
   }
   void delete(){
      if(checkforDS == "Stack")
      {
         delete_from_stack();
      }
      else if(checkforDS == "Queue")
      {
         delete_from_queue();
      }
      else{
         System.out.println("\nAn Error Occurred!");
         System.exit(1);
      }
   }
   void delete_from_stack(){
      System.out.println("\nDeleting item from Stack...");
      if(Global_Variables.top == -1)
      {
         System.out.println("\nStack UnderFlow!");
         return;
      }
      else
      {
        int x;
        x=Global_Variables.stack_array[Global_Variables.top];
        Global_Variables.top = Global_Variables.top - 1;
        System.out.println("\nDeleted Element: "+x);
      }
   }
   void delete_from_queue(){
      System.out.println("\nDeleting item from Queue...");
      if (Global_Variables.front == -1 || Global_Variables.front > Global_Variables.rear)
      {
         System.out.println("\nQueue Underflow!");
         return;
      }
      else
      {
         System.out.println("Element deleted from queue is: "+ Global_Variables.queue_array[Global_Variables.front]);
         Global_Variables.front = Global_Variables.front + 1;
      }
   }
}

//-------------------------------------------------------------------------------
//-------------------------------DISPLAY CLASS-----------------------------------
//-------------------------------------------------------------------------------
class Display{
   String checkforDS;
   
   //CONSTRUCTOR OVERLOADING
   Display(String ds){
      this.checkforDS = ds;
   }
   Display(){
      checkforDS = "Queue";
   }
   void display(){
      if(checkforDS == "Stack")
      {
         display_stack();
      }
      else if(checkforDS == "Queue")
      {
         display_queue();
      }
      else{
         System.out.println("An Error Occurred!");
         System.exit(1);
      }
   }
   void display_stack(){
      System.out.println("\nDisplaying items from Stack");
      int i;
      if (Global_Variables.top == -1){
         System.out.println("\nStack is empty!");
         return;
      }
      else
      {
         for(i=Global_Variables.top;i>=0;i--)
         {
            System.out.println(" "+Global_Variables.stack_array[i]);
         }
      }
   }
   void display_queue(){
      System.out.println("\nDisplaying items from Queue");
      int i;
      if (Global_Variables.front == -1){
         System.out.println("\nQueue is empty!");
         return;
      }
      else
      {
         for (i=Global_Variables.front; i<=Global_Variables.rear; i++)
         {
            System.out.println(" "+Global_Variables.queue_array[i]);
         }
      }
   }
}

//-------------------------------------------------------------------------------
//--------------------------------STACK CLASS------------------------------------
//-------------------------------------------------------------------------------
class Stack{
   static Scanner scan = new Scanner(System.in);
   public void stack(){
      Insert ins = new Insert("Stack");
      Delete del = new Delete("Stack");
      Display dis = new Display("Stack");
      System.out.print("\n-----------------------STACK-----------------------\n");
      System.out.println("\nEnter the size of the Stack: ");
      Global_Variables.size = Integer.parseInt(scan.next());
      boolean condition = true;
      while(condition){
         System.out.println("\n1. Insert element to Stack \n2. Delete element from Stack \n3. Display all elements of Stack \n4. Quit");
         System.out.print("Enter Your Choice: ");
         int choice = Integer.parseInt(scan.next());
         switch (choice)
         {
            case 1:
            ins.insert();
            break;
            case 2:
            del.delete();
            break;
            case 3:
            dis.display();
            break;
            case 4:
            System.exit(1);
            default:
            System.out.println("\nWrong choice \n");
         }

         System.out.println("\nDo You Want To Continue? (Y/N)");
         String str = scan.next();
         System.out.print("--------------------------------------------------\n");
         char e = str.charAt(0);
         if(e =='y' || e == 'Y'){
            condition = true;
         }
         else{
            condition = false;
         }
      }
   }
}

//-------------------------------------------------------------------------------
//--------------------------------QUEUE CLASS------------------------------------
//-------------------------------------------------------------------------------
class Queue{
   static Scanner scan = new Scanner(System.in);
   public void queue(){
      Insert ins = new Insert();
      Delete del = new Delete();
      Display dis = new Display();
      boolean condition = true;
      while(condition){
         System.out.print("\n-----------------------QUEUE-----------------------\n");
         System.out.println("\n1. Insert element to Queue \n2. Delete element from Queue \n3. Display all elements of Queue \n4. Quit");
         System.out.print("Enter Your Choice: ");
         int choice = Integer.parseInt(scan.next());
         switch (choice)
         {
            case 1:
            ins.insert();
            break;
            case 2:
            del.delete();
            break;
            case 3:
            dis.display();
            break;
            case 4:
            break;
            default:
            System.out.println("\nWrong Choice!");
            break;
         }
         System.out.println("\nDo You Want To Continue? (Y/N)");
         String str = scan.next();
         System.out.print("--------------------------------------------------\n");
         char e = str.charAt(0);
         if(e =='y' || e == 'Y'){
            condition = true;
         }
         else{
            condition = false;
         }
      }
   }
}

//-------------------------------------------------------------------------------
//-------------------------------MAIN CLASS--------------------------------------
//-------------------------------------------------------------------------------
public class StackandQueue{
   public static void main(String[] args){

      //Data Structure - Stack & Queue Using Array
      Scanner scan = new Scanner(System.in);
      System.out.print("CHOOSE THE DATA STRUCTURE");
      System.out.print("\n1. Stack \n2. Queue \n3. EXIT\n");
      System.out.print("Enter Your Choice: ");
      int DSchoice = Integer.parseInt(scan.next());
      Stack st = new Stack();
      Queue qu = new Queue();
         switch(DSchoice)
         {
            case 1:
            st.stack();
            break;
            case 2:
            qu.queue();
            break;
            case 3:
            scan.close();
            System.exit(1);
            break;
            default:
            System.out.println("\nWrong Choice!");
            break;
         }
      }
   }
