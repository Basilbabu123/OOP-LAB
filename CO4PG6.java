import java.util.*;
import java.io.*;

class Co4pg6
{
            public static void main(String args[])throws IOException
            {
                        int l=1,w=0;           
                        char ch;
                        Scanner scr=new Scanner(System.in);
                        System.out.print("\nEnter File name: ");
                        String str=scr.nextLine();
                        FileInputStream f=new FileInputStream(str);
                        int n=f.available();
                        for(int i=0;i<n;i++)
                          {
                                    ch=(char)f.read();
                                    if(ch=='\n')
                                    l++;
                                     else if(ch==' ')
                                                w++;
                                                                       
                           }
                        System.out.println("\nNumber of lines : "+l);
                        System.out.println("\nNumber of words : "+(l+w));
                        System.out.println("\nNumber of characters : "+n);
                       

            }
}
