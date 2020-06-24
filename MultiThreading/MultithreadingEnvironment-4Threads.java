public class FourThreads{
    public static void main(String args[]) throws InterruptedException{
        helloWorld obj1 = new helloWorld();
        helloWorld obj2 = new helloWorld();

        T1 objT1 = new T1(obj1);
        objT1.start(); objT1.join();

        T2 objT2 = new T2(obj1);
        objT2.start(); objT2.join(); 

        T3 objT3 = new T3(obj2);
        objT3.start(); objT3.join(); 

        T4 objT4 = new T4(obj2);
        objT4.start(); objT4.join();  
    }
}

class helloWorld{
    synchronized void printhelloWorld(String s){
        System.out.println(s+" is starting.");
        System.out.println("\tHELLO WORLD");
    }
}

class T1 extends Thread{
    helloWorld obj1;
    T1(helloWorld obj1)
    {
        this.obj1=obj1;
    }
    public void run()
    {
        String className = this.getClass().getName();
        obj1.printhelloWorld(className);
    }

}

class T2 extends Thread{
    helloWorld obj1;
    T2(helloWorld obj1)
    {
        this.obj1=obj1;
    }
    public void run()
    {
        String className = this.getClass().getName();
        obj1.printhelloWorld(className);
    }

}

class T3 extends Thread{
    helloWorld obj2;
    T3(helloWorld obj2)
    {
        this.obj2=obj2;
    }
    public void run()
    {
        String className = this.getClass().getName();
        obj2.printhelloWorld(className);
    }

}

class T4 extends Thread{
    helloWorld obj2;
    T4(helloWorld obj2)
    {
        this.obj2=obj2;
    }
    public void run()
    {
        String className = this.getClass().getName();
        obj2.printhelloWorld(className);
    }

}