package javasessions;

/**
 * This class is used for different data types in java
 * 
 * @author sarat
 *
 */
public class DataTypes {

	public static void main(String[] args) {
		System.out.println("Hello World");

		// data types
		// strict data type
		// 1. primitive data type -
		// Boolean: boolean
		// Character: char
		// Byte: byte
		// Short: short
		// Integer: int
		// Long: long
		// Float: float
		// Double: double
		// 2. non primitive data type
		// String, Arrays, Objects, Interface

		// 1.Byte: byte
		// Size: 1 byte = 8 bits
		// range -128 to 127
		byte b1 = 10;
		b1 = 20;
		System.out.println(b1);

		// 2.Short: short
		// Size: 2 bytes = 16 bits
		// range -32768 to 32767
		short s = 100;
		System.out.println(s);

		// 3.Integer: int
		// Size 4 bytes = 32 bits
		// range -2147483648 to 2147483647
		int i = 1000;
		int i1 = -10;
		int i2 = 400;
		System.out.println(i + i1 + i2);

		// 4. Long: long
		// size 8 bytes = 64 bits
		long l1 = 1000000000;
		System.out.println(l1);

		// 5. Float: float
		// size : 4 bytes = 32 bits
		// range up to 7 digits after decimal
		float f1 = 12.33f;
		float f2 = (float) 19.33;

		// 6. Double: double
		// Size: 8 bytes = 64 bits
		// range up to 16 digits after decimal
		double d1 = 14.546232;
		System.out.println(d1);

		// 7. Character: char
		// Size: 2 bytes = 16 bits
		// UNICODES + LANGUAGE CODES LIKE JAPANESE, CHINESE, INDIAN , FRENCH ECT--->
		// ASCII CODES
		char c1 = 'a';
		char c2 = 'b';
		char c3 = '1';
		char c4 = '$';
		System.out.println(c3);
		System.out.println(c1 + c2);// Answer is 195 as there is a decimal value for each character - a = 97 + b= 98

		// 8. Boolean boolean
		// Checkpoint: validation/verifications
		// Assert
		// conditional operators
		// size ~ 1 bit
		boolean flag = true;
		boolean fl = false;

		// Non-primitive type
		// String: default class in java
		String str = "Hello world";
		System.out.println(str);
		System.out.println("Hello selenium");

	}

}
