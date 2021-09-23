import java.io.*;
import java.util.*;

public class Co4pg4 
{
  public static void main(String[] args) throws Exception 
   {
    int i=0;
    FileInputStream file = new FileInputStream("NUMBERS.text");
    FileOutputStream evenFile = new FileOutputStream("even.txt");
    FileOutputStream oddFile = new FileOutputStream("odd.txt");   
   while((i=file.read())!=-1) 
    {
     if(i%2==0)
     {
      evenFile.write(i);
     }
     else
     oddFile.write(i);
    }
  file.close();
  evenFile.close();
  oddFile.close();
  }
}