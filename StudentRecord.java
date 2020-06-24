import java.io.*;
import java.lang.StringBuilder;
import java.lang.System;
class StudentRecords
{
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public String singleString;

  //-----------------------ADD-RECORDS-----------------------

  public void addRecords() throws IOException
  {
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("studentRecords.txt",true)));
    String name, Class, fname, email, address, dob;
    int age, rollNumber;
    long phoneNum;
    String s;
    boolean addMore = false;
    do
    {
      System.out.print("\nEnter Roll Number: ");
      rollNumber = Integer.parseInt(br.readLine());
      
      System.out.print("\nEnter name: ");
      name = br.readLine();

      System.out.print("Father's Name: ");
      fname = br.readLine();

      System.out.print("Email: ");
      email = br.readLine();

      System.out.print("Address: ");
      address = br.readLine();

      System.out.print("Class: ");
      Class = br.readLine();

      System.out.print("Date of Birth (dd/mm/yy): ");
      dob = br.readLine();

      System.out.print("Age: ");
      age = Integer.parseInt(br.readLine());

      System.out.print("Phone No.: ");
      phoneNum = Long.parseLong(br.readLine());

      pw.println(rollNumber);
      pw.println(name);
      pw.println(fname);
      pw.println(email);
      pw.println(address);
      pw.println(Class);
      pw.println(dob);
      pw.println(age);
      pw.println(phoneNum);
      
      System.out.print("\nRecords added successfully! \n \nDo you want to add more records ? (y/n): ");
      s = br.readLine();
      if(s.equalsIgnoreCase("y"))
      {
        addMore = true;
        System.out.println();
      }
      else
      addMore = false;
    }
    while(addMore);
    pw.close();
    showMenu();
  }
  
  //----------------------- READ-ALL-RECORDS-----------------------

  public void readRecords() throws IOException
  {
    try
    {
      BufferedReader file = new BufferedReader(new FileReader("studentRecords.txt"));
      String rollNumber;
      while((rollNumber = file.readLine()) != null)
      {
        System.out.println("\nRoll Number: " +Integer.parseInt(rollNumber));
        System.out.println("Name: " +file.readLine());
        System.out.println("Father's Name: "+file.readLine());
        System.out.println("Email: "+file.readLine());
        System.out.println("Address: "+file.readLine());
        System.out.println("Class: "+file.readLine());
        System.out.println("Date of Birth: "+file.readLine());
        System.out.println("Age: "+Integer.parseInt(file.readLine()));
        System.out.println("Phone. No.: "+Long.parseLong(file.readLine()));
      }
      
      file.close();
      showMenu();
    }
    catch(FileNotFoundException e)
    {
      System.out.println("\nERROR : File not Found !!!");
    }
  }

  //-----------------------SEARCH-RECORDS-----------------------

  public void searchRecord() throws IOException
  {
    try
    {
      BufferedReader file = new BufferedReader(new FileReader("studentRecords.txt"));
      String rollNumber;
      System.out.print("\nEnter the Roll number of the student you want to search: ");
      int rno = Integer.parseInt(br.readLine());
      while((rollNumber = file.readLine()) != null)
      {
        if(rno==Integer.parseInt(rollNumber))
        {
            System.out.println("\nRoll Number: " +Integer.parseInt(rollNumber));
            System.out.println("Name: " +file.readLine());
            System.out.println("Father's Name: "+file.readLine());
            System.out.println("Email: "+file.readLine());
            System.out.println("Address: "+file.readLine());
            System.out.println("Class: "+file.readLine());
            System.out.println("Date of Birth: "+file.readLine());
            System.out.println("Age: "+Integer.parseInt(file.readLine()));
            System.out.println("Phone. No.: "+Long.parseLong(file.readLine()));
          }
          else
          {
              for(int j=0;j<8;j++)
              {
                file.readLine();
              }
          }
      }
      file.close();
      showMenu();
    }
    catch(FileNotFoundException e)
    {
      System.out.println("\nERROR: File not Found !!!");
    }
  }

  //-----------------------CLEAR-RECORD-----------------------

  public void clearRecord() throws IOException
  {
  BufferedReader file = new BufferedReader(new FileReader("studentRecords.txt"));
  StringBuilder stringBuilder = new StringBuilder();
  String ls = System.getProperty("line.separator");
  String rollNumber, remains;
  System.out.print("\nEnter the Roll number of the student you want to clear: ");
  int rno = Integer.parseInt(br.readLine());
  while((rollNumber = file.readLine()) != null)
  {
    if(rno==Integer.parseInt(rollNumber))
    {
      for(int j=0;j<8;j++)
      {
          file.readLine();
      }
    }
    else
    {
      stringBuilder.append(rollNumber);
      stringBuilder.append(ls);
      for(int k=0;k<8;k++)
      {
          remains=file.readLine();
          stringBuilder.append(remains);
          stringBuilder.append(ls);
      }
    }
  }
  singleString = stringBuilder.toString();
  clearandWrite cw = new clearandWrite();
  cw.clearfile();
  file.close();
  System.out.println("\nRecord of Roll Number " + rno + " cleared successfully!\n");
  showMenu();
  }

  class clearandWrite
  {
    public void clearfile() throws IOException
    {
        FileWriter fwOb = new FileWriter("studentRecords.txt", false); 
        PrintWriter pwOb = new PrintWriter(fwOb, false);
        pwOb.flush();
        pwOb.close();
        fwOb.close();
        writeFile();
    }
    public void writeFile() throws IOException
    {
      FileWriter fw=new FileWriter("studentRecords.txt");
      fw.write(singleString);    
      fw.close();    
    }
  
  }

  //-----------------------SHOW-MENU-----------------------

  public void showMenu() throws IOException
  {
    System.out.print("\n-----------------------MENU-----------------------\n");
    System.out.print("1: Add Records\n2: Display all Records\n3: Search for a Specific Records\n4: Clear a Specific Records\n5: EXIT\nEnter Your Choice: ");
    int choice = Integer.parseInt(br.readLine());
    System.out.print("--------------------------------------------------\n");
    switch(choice)
    {
      case 1:
      addRecords();
      break;
      case 2:
      readRecords();
      case 3:
      searchRecord();
      break;
      case 4:
      clearRecord();
      break;
      case 5:
      System.exit(1);
      break;
      default:
      System.out.println("\nInvalid Choice !");
      break;
    }
  }
  
  public static void main(String args[]) throws IOException
  {
    StudentRecords call = new StudentRecords();
    call.showMenu();
  }
}