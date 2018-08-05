import java.io.*;
public class TestBufferedReader{
public static void main(String args[]){
BufferedWriter bufout=null;
try{
bufout=new BufferedWriter(new FileWriter("e:\\iauhsoaix\\java\\Fileinputstreamtest.txt"));
bufout.write("nihao");
bufout.newLine();
bufout.write("hello");
bufout.flush();
}catch(IOException e){

}
finally{
try{
bufout.close();
}catch(IOException e){
}
}
/*BufferedReader bfr=null;
try{

FileReader fr=new FileReader("e:\\iauhsoaix\\java\\Fileinputstreamtest.txt");
bfr=new BufferedReader(fr);
String str=bfr.readLine();
System.out.println(str);
while(str!=null){
System.out.println(str);
str=bfr.readLine();
}
}
catch(IOException ioe){
}finally{
try{
bfr.close();
}catch(IOException e){
}
}*/

}
}