import java.io.*; 
class LettersNumbersandSpecialCharecters {
    public static void main(String[] args) throws Exception{
        FileInputStream fin=new FileInputStream("E:/Codes/JAVA/Assignment 19-06/Input Output/Letters Numbers and Special Characters/file.txt");
        int i, letter=0, num=0, specialchar=0;    
        while((i=fin.read())!=-1){
            char c = (char)i;
            if(Character.isLetter(c)){
                letter ++ ;
            }
            else if(Character.isDigit(c)){
                num ++ ;
            }
            else{
                specialchar ++;
            } 
        }
        fin.close();
        System.out.println("Letters: " + letter);
		System.out.println("Numbers: " + num);
		System.out.println("Special Characters: " + specialchar);
    }
    
}