import java.io.*;
public class iotest {
	public static void main(String[] args){
	/* 字符流try{
	System.out.println("输入：");
	int count,n=128;
	byte buffer[]=new byte[n];
	count=System.in.read(buffer);
	FileOutputStream fos=new FileOutputStream("e:\\iauhsoaix\\java\\Fileinputstreamtest.txt");
	fos.write(buffer,0,count);
	fos.close();
	System.out.println("已经写入文件");
}catch(IOException ioe){
	System.out.println("ERROR");
}*/
	/*File f1=new File("e:\\iauhsoaix\\crack");
	boolean is=f1.exists();
	System.out.println(""+is);  创建文件夹*/
	/*读取文件流*/
	try{
	FileInputStream fis=new FileInputStream("C:\\Users\\iahusoaix\\Pictures\\印章\\printpic.gif");
	byte buf[]=new byte[128];
	int count;
	count=fis.read(buf);
	System.out.println("读取"+count+"个字节");
	System.out.println(new String(buf));
	fis.close();
	
}catch(IOException ioe){
	System.out.println("ERROR");
}
}
}