package ua.com.java.trenirovka.mavenprojectproba1;

import ua.com.java.trenirovka.mavenprojectproba1.util.PrintStr;
import ua.com.java.trenirovka.mavenprojectproba1.util.Operation;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello, my friend !!!");
		PrintStr.print("How do you do !??");
		System.out.println("Summa 5+3 = "+Operation.summa(5, 3));
	}
}
