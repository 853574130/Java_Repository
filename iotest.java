import java.io.*;
public class iotest {
	public static void main(String[] args){
	/* �ַ���try{
	System.out.println("���룺");
	int count,n=128;
	byte buffer[]=new byte[n];
	count=System.in.read(buffer);
	FileOutputStream fos=new FileOutputStream("e:\\iauhsoaix\\java\\Fileinputstreamtest.txt");
	fos.write(buffer,0,count);
	fos.close();
	System.out.println("�Ѿ�д���ļ�");
}catch(IOException ioe){
	System.out.println("ERROR");
}*/
	/*File f1=new File("e:\\iauhsoaix\\crack");
	boolean is=f1.exists();
	System.out.println(""+is);  �����ļ���*/
	/*��ȡ�ļ���*/
	try{
	FileInputStream fis=new FileInputStream("C:\\Users\\iahusoaix\\Pictures\\ӡ��\\printpic.gif");
	byte buf[]=new byte[128];
	int count;
	count=fis.read(buf);
	System.out.println("��ȡ"+count+"���ֽ�");
	System.out.println(new String(buf));
	fis.close();
	
}catch(IOException ioe){
	System.out.println("ERROR");
}
}
}