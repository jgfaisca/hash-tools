/* Class TestSHA1Methods
 * 
 * Description: Test SHA1 Methods
 * 
 * Author: Jose Faisca
 * Date: 2016/01
 */

public class TestSHA1Methods {
	
	public static void main(String[] args) throws Exception {
		System.out.println(SHA1Methods.strSHA1("test"));
		System.out.println();
		System.out.println(SHA1Methods.fileSHA1("test.txt"));
		System.out.println();
		System.out.println(SHA1Methods.urlSHA1("https://raw.githubusercontent.com/zekaf/hash-tools/master/java/test.txt"));
		System.out.println();
	}
}
