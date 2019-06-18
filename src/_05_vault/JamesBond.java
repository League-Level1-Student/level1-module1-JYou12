package _05_vault;

import sun.applet.Main;

public class JamesBond {

	public static void main(String[] args) {

		Vault v = new Vault(500);
		tryCode(v);
		
	}
	
	static void tryCode(Vault v) {
		boolean code = false;
		int number = 0;
		while(code == false) {
		number ++;
		code = v.tryCode(number);
		System.out.println(number);
		
		}
		
		
	}
	
}
