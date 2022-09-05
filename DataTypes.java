public class DataTypes {
	public static void main(String args[])
	{
        boolean bo = true; // 1 bit
		char a = 'G'; // 16 bit 
		byte b = 4; // 8 bit -128 to 127 
		short s = 56; // 16 bit, -32,768 to 32,767
        int i = 89; // 32 bit, -2,147,483,648 to 2,147,483,647
        long l = 199; // 64 bit, -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		double d = 4.355453532; // 64 bit, holds upto 16 decimals
		float f = 4.7333434f; // 32 bit, holds upto 7 decimals

        System.out.println("Boolean: " + bo);
		System.out.println("char: " + a);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
		System.out.println("integer: " + i);
        System.out.println("long: " + l);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
	}
}

