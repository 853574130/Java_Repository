package iauhsoaix;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
/**
 * ��Ŀ���ܣ�ʵ�����������ֻ�ȡ����(�ֲڰ棬�����ҵ�a��ǩ����a��ǩ�е�������ȡ������
 * ��һ���Ǿ�ȷ��ȡ����)
 * @author iahusoaix
 *
 */

public class demo {

	/**
	 * @author iauhsoaix
	 * @parameter
	 * @date2018��8��5��
	 */
	public static void main(String[] args) throws IOException {
		outfile();
		System.out.println("ok!");
		// ����԰�document��������̨���js,ͨ��class�ң�name����������jQuery����֧�ֵ�
	}

	/**
	 * @author iauhsoaix
	 * @throws IOException
	 * @parameter ���ڴ��������Ϊ�ļ�
	 * @date2018��8��5��
	 */
	public static void outfile() throws IOException {
		Connection conn = Jsoup.connect("https://music.163.com/playlist?id=556285609");
		// �޸�http���е�header,αװ�����������ץȡ
		conn.header("User-Agent", "userAgent");
		FileWriter fileOutputStream = new FileWriter("e:\\�赥.txt");
		Document doc = conn.get();
		// File input = new File("/tmp/input.html" );
		// #auto-id-pRQR54O0LitGv82g > table #auto-id-0uZA4lFxH4Vsi1LI
		// Elements elements= doc.select("#auto-id-pRQR54O0LitGv82g").select("table");
		Elements elements = doc.select("a[href]");
		// ��ȡ������
		Iterator it = elements.iterator();
		while (it.hasNext()) {
			Element element = (Element) it.next();
			System.out.println(element.html().toString());
			String temp=element.html().toString();
			// Node titleNode= element.child(0).childNode(0);
			// �����С�����������
			fileOutputStream.append("\r\n");
			fileOutputStream.append(temp);
		}
				
		fileOutputStream.flush();
		fileOutputStream.close();

		//fileOutputStream.write(temp);
	}

}
