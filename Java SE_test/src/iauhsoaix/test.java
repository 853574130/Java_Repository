package iauhsoaix;



public class test {

	public static void main(String[] args) {
	
		
		//testString();
		testStringBuilder();
		testStringBuffer();
	}
/**
 * 在哪里找什么
 * 1.数组里找
 * 2.找目标值
 * 返回什么？
 * 返回索引
 */

	static void testString() {
		long begin=System.currentTimeMillis();
		String string="";
		for(int i=0;i<30000;i++) {
			string=string+i;
		}
		long end=System.currentTimeMillis();
		System.out.println(end-begin);
		
	}
	static void testStringBuilder() {
		long begin=System.currentTimeMillis();
		StringBuilder string=new StringBuilder("hh");
		for(int i=0;i<300000;i++) {
			string.append(i);
		}
		long end=System.currentTimeMillis();
		System.out.println(end-begin+"build");
	}
	static void testStringBuffer() {
		long begin=System.currentTimeMillis();
		StringBuffer string=new StringBuffer("?");
		for(int i=0;i<300000;i++) {
			string.append(i);
		}
		long end=System.currentTimeMillis();
		System.out.println(end-begin+"buffer");
	}
public static int lastindex(int[] arr,int key) {
	int index=0;
	for(index=arr.length-1;index>=0;index--) {
		
		System.out.println(arr[index]);
	}
	return -1;
}
}
