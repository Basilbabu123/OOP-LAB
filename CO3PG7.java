import java.util.Arrays;
import java.util.*;
class Sortstr{
       String str[]=new String[10];
       int len;
       void  get()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit:");
        len = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i=0;i< len;i++){
            str[i] = sc.next();
        }
System.out.println("\n orginal string");
 for (int i=0;i< len;i++){
        System.out.println("\n"+str[i]);
}

     }

        void asc()
       {
        
        for (int i = 0; i <len; i++){
            for (int j = i+1; j <len; j++){
                if (str[i].length() > str[j].length()){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
System.out.println("\nSorted in (ascending order):");
for (int i=0;i< len;i++){
        System.out.println("\n" +str[i]);
                        }    

}
    void desc()
       {   for (int i = 0; i < len; i++){
            for (int j = i+1; j < len; j++){
                if (str[i].length() < str[j].length()){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
System.out.println("\nSorted in (descending order):");
for (int i=0;i< len;i++){
        System.out.println("\n"+str[i]);
                         }

}

       }
public class CO3PG7 {
    public static void main(String[] args)
 {
    Sortstr s=new Sortstr(); 
    s.get();
    s.desc();
    s.asc();
}
}