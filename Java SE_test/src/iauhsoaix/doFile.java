package iauhsoaix;

import java.io.File;
import java.util.ArrayList;
/**
 * ��Ҫ��ȡһ��e�̵Ĵ�С
 * @author iahusoaix
 *
 */
public class doFile {

	public static void main(String[] args) {
		File f=new File("E:\\");
		ArrayList<File> fList=new ArrayList<>();
		File[] farr=f.listFiles();
		for(File ff:farr) {
			System.out.println(""+ff.getName()+"�ļ���СΪ"+ff.length());
		}
		
		

	}

}
