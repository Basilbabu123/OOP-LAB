import java.io.*;
import java.util.*;
class filename{
String fname;
void getname(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter  file name (.text):");
fname = sc.next();
}
void writefile() throws Exception{
FileOutputStream fos = new FileOutputStream(fname);
DataOutputStream dos = new DataOutputStream(fos);
dos.writeUTF("BASILBABU");
}
void readfile() throws Exception{
FileInputStream fis = new FileInputStream(fname);
DataInputStream dis = new DataInputStream(fis);
String str = dis.readUTF();
System.out.println(str);
}}
public class Co42 {
public static void main(String ...a) throws Exception {
filename f = new filename();
f.getname();
f.writefile();
f.readfile();
}}