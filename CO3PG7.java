import java.util.Arrays;
import java.util.*;

public class CO3PG7 {
    public static void main(String[] args) {
        String[] str = new String[10];
        int len;
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

        for (int i = 0; i < len; i++){
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
}