import java.io.*;
public class TestFileRead{
public static void main(String args[]){
try{
FileReader fin=new FileReader("C:\\Users\\iahusoaix\\Pictures\\Ó¡ÕÂ\\printpic.gif");
int c=fin.read();
while(c!=-1){
System.out.print((char)c);
c=fin.read();
System.out.print("¶ÁÈ¡Íê³É");
}
}catch(IOException ioe){
System.out.print("666");
}

}
}