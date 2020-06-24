import java.io.*;  
    class InputStreamExample {    
      public static void main(String args[])throws Exception{    
       FileInputStream fin1=new FileInputStream("E:/Codes/JAVA/Assignment 19-06/Input Output/Contents Of Two Files Copied/file1.txt");    
       FileInputStream fin2=new FileInputStream("E:/Codes/JAVA/Assignment 19-06/Input Output/Contents Of Two Files Copied/file2.txt"); 
       FileOutputStream fout=new FileOutputStream("E:/Codes/JAVA/Assignment 19-06/Input Output/Contents Of Two Files Copied/outputfile.txt");
       SequenceInputStream sqip=new SequenceInputStream(fin1, fin2);
       int i;    
       while((i=sqip.read())!=-1){
       char c = (char)i;
       fout.write(c); 
       }
       sqip.close();    
       fin1.close();    
       fin2.close();  
       fout.close();  
      }    
    }    
