
public class ThreeThreads{
    public static void main(String args[]) throws InterruptedException{
        Table obj = new Table();
        MyThread1 t1=new MyThread1(obj);
        t1.start(); t1.join();
        MyThread2 t2=new MyThread2(obj);
        t2.start(); t2.join(); 
        MyThread3 t3=new MyThread3(obj);
        t3.start(); t3.join();  
    }
}
 
class Table{
    synchronized void printTable(int n,String s){
        Thread t = Thread.currentThread();
        long id = t.getId();
        String name = t.getName();
        System.out.println(s+" is accessing the object.");
        System.out.println("\t"+name+" with ID "+id+" is running.");
        for(int i=1;i<=3;i++)
        {
            System.out.println("\t"+n+" * "+i+" = "+n * i);
        }
    }
}

class MyThread1 extends Thread{
    //This thread finds the multiple of 1.
    Table t;
    MyThread1(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        String className = this.getClass().getName();
        t.printTable(1,className);
    }

}

class MyThread2 extends Thread{
    //This thread finds the multiple of 10.
    Table t;
    MyThread2(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        String className = this.getClass().getName();
        t.printTable(10,className);
    }
}

class MyThread3 extends Thread{
    //This thread finds the multiple of 100.
    Table t;
    MyThread3(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        String className = this.getClass().getName();
        t.printTable(100,className);
    }
}