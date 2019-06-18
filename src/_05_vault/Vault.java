package _05_vault;

import java.util.Random;

public class Vault {

private int secretCode;

public Vault(int secretCode) {
	
	
	this.secretCode = secretCode;
}

boolean tryCode(int code) {

	
	if (code == secretCode) {
	System.out.println("Success = " + secretCode);
		return true;
	}else {
	return false;
	}
}

}
