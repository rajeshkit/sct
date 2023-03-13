package wrapper;

public class Student {
	public static void main(String[] args) {
		char c='g';
		Character ch = Character.valueOf(c);//boxing
		char ccc=ch.charValue();//unboxing
		
				
		int x=10;//primitive 
		Integer i=Integer.valueOf(x);// converts int to Integer with wrapper class
		int k=i.intValue();
		
		
		float a=4.45f;
		Float f = Float.valueOf(a);
		float aa = f.floatValue();
		
		
		byte b=34;
		Byte bb=Byte.valueOf(b);
		byte bbb=bb.byteValue();
	}
	
}
