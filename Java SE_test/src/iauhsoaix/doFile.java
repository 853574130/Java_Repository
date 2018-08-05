package iauhsoaix;

import java.io.File;
import java.util.ArrayList;
/**
 * 需要获取一下e盘的大小
 * @author iahusoaix
 *
 */
public class doFile {

	public static void main(String[] args) {
		File f=new File("E:\\");
		ArrayList<File> fList=new ArrayList<>();
		File[] farr=f.listFiles();
		for(File ff:farr) {
			System.out.println(""+ff.getName()+"文件大小为"+ff.length());
		}
		
		

	}

}
