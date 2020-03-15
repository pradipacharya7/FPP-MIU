package test123;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text: ");
		var text = sc.nextLine();
		System.out.println("Enter something else");
		var text2 = sc.next();
		System.out.println(text);
	}
}
