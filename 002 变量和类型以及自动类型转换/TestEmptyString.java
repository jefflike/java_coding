import java.io.UnsupportedEncodingException;
class Test{
	public static void main(String[] args){
		System.out.println(new String());// 调用字符串的无参构造器，会生成一个空字符串对象
		System.out.println(1+new String()+2);//12
		System.out.println(new String(new char[]{'j', 'e', 'f', 'f'}));//jeff
		System.out.println(new String(new char[]{'j', 'e', 'f', 'f', 'l', 'i', 'k', 'e'}, 4, 4));//like
		System.out.println(new String(new char[]{'j', 'e', 'f', 'f', 'l', 'i', 'k', 'e'}, 4, 0));//还是一个空串
		// System.out.println(new String(new char[]{'j', 'e', 'f', 'f', 'l', 'i', 'k', 'e'}, 4, 5));//java.lang.StringIndexOutOfBoundsException: String index out of range: 9
		System.out.println(new String(new char[]{'\u4e01', '\u6607'}, 0, 1));//丁
		System.out.println(new String(new char[]{'\u1234','\u4e01', '\u6607'}, 0, 1));//?
		System.out.println(new String(new char[]{'\u1234','\u4e01', '\u6607'}, 0, 1).codePointAt(0));//4660
		System.out.println(new String(new char[]{'\u4e01', '\u6607'}, 0, 1).codePointAt(0));//19969
		System.out.println(new String(new char[]{'j', 'e', 'f', 'f', 'l', 'i', 'k', 'e'}, 4, 4).codePointAt(1));//105
		System.out.println(new String(new char[]{'j', 'e', 'f', 'f', 'l', 'i', 'k', 'e'}, 4, 4).codePointAt(2));//107
		System.out.println(new String(new char[]{'j', 'e', 'f', 'f', 'l', 'i', 'k', 'e'}, 4, 4).codePointAt(3));//102
		System.out.println(new String(new char[]{'j', 'e', 'f', 'f', 'l', 'i', 'k', 'e'}, 4, 4).codePointBefore(1));//108
		System.out.println(new String(new char[]{'j', 'e', 'f', 'f', 'l', 'i', 'k', 'e'}, 4, 4).codePointBefore(2));//105
		System.out.println(new String(new char[]{'j', 'e', 'f', 'f', 'l', 'i', 'k', 'e'}, 4, 4).codePointBefore(3));//107
		
		System.out.println(new String(new char[]{'j', 'e', 'f', 'f', 'l', 'i', 'k', 'e'}).codePointCount(1,7));//6
		System.out.println(new String(new char[]{'j', 'e', 'f', 'f', 'l', 'i', 'k', 'e'}).offsetByCodePoints(1,7));//8
		System.out.println(new String(new char[]{'j', 'e', 'f', 'f', 'l', 'i', 'k', 'e'}).offsetByCodePoints(1,1));//2
		
		try{
			byte[] str = "丁杰".getBytes("utf-8");
			System.out.println(str[0]);//-28
			System.out.println(str[1]);//-72
			System.out.println(str[2]);//-127
			System.out.println(str[3]);//-26
			System.out.println(str[4]);//-99
			System.out.println(str[5]);//-80
			System.out.println(str[6]);//异常
		}catch(UnsupportedEncodingException e){
			System.out.println(e);
		}
	}
}