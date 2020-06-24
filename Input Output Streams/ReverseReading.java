import java.io.*; 
class ReverseReading{
    public static void main(String[] args)throws Exception{
        FileInputStream finp1=new FileInputStream("E:/Codes/JAVA/Assignment 19-06/Input Output/Reverse Read/input.txt");
        FileInputStream finp2=new FileInputStream("E:/Codes/JAVA/Assignment 19-06/Input Output/Reverse Read/input.txt");
        int i, j, k, t;
        char[] letters = new char[100];
        int n=0;
        char a;
        while((k=finp1.read())!=-1)
        {
            n++;
        }
        t=n;
        finp1.close();
        while((j=finp2.read())!=-1)
        {
            a=(char)j;
            letters[n] = a;
            n--;
        }
        finp2.close();
        String string = new String(letters);
        System.out.println(string);
    }
}