import java.util.*;
import java.io.*;
public class getFiles{
	public static void main(String[] args){
	getFile("e:/");
}
public static ArrayList<String> getFile(String path) {
    ArrayList<String> files = new ArrayList<String>();
    File file = new File(path);
    File[] tempList = file.listFiles();

    for (int i = 0; i < tempList.length; i++) {
        if (tempList[i].isFile()) {
            System.out.println("��     ����" + tempList[i]);
            files.add(tempList[i].toString());
        }
       if (tempList[i].isDirectory()) {
             System.out.println("�ļ��У�" + tempList[i]);
        }
    }
    return files;
}
	
}