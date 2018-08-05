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
 * 项目功能：实现网易云音乐获取歌名(粗糙版，就是找到a标签，把a标签中的内容提取出来，
 * 下一步是精确提取歌名)
 * @author iahusoaix
 *
 */

public class demo {

	/**
	 * @author iauhsoaix
	 * @parameter
	 * @date2018年8月5日
	 */
	public static void main(String[] args) throws IOException {
		outfile();
		System.out.println("ok!");
		// 你可以把document对象看做后台版的js,通过class找，name找甚至利用jQuery都是支持的
	}

	/**
	 * @author iauhsoaix
	 * @throws IOException
	 * @parameter 把内存内容输出为文件
	 * @date2018年8月5日
	 */
	public static void outfile() throws IOException {
		Connection conn = Jsoup.connect("https://music.163.com/playlist?id=556285609");
		// 修改http包中的header,伪装成浏览器进行抓取
		conn.header("User-Agent", "userAgent");
		FileWriter fileOutputStream = new FileWriter("e:\\歌单.txt");
		Document doc = conn.get();
		// File input = new File("/tmp/input.html" );
		// #auto-id-pRQR54O0LitGv82g > table #auto-id-0uZA4lFxH4Vsi1LI
		// Elements elements= doc.select("#auto-id-pRQR54O0LitGv82g").select("table");
		Elements elements = doc.select("a[href]");
		// 获取迭代器
		Iterator it = elements.iterator();
		while (it.hasNext()) {
			Element element = (Element) it.next();
			System.out.println(element.html().toString());
			String temp=element.html().toString();
			// Node titleNode= element.child(0).childNode(0);
			// 遍历中。。。。。。
			fileOutputStream.append("\r\n");
			fileOutputStream.append(temp);
		}
				
		fileOutputStream.flush();
		fileOutputStream.close();

		//fileOutputStream.write(temp);
	}

}
