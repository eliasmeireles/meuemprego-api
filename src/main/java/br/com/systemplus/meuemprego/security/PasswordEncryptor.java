package br.com.systemplus.meuemprego.security;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;

import br.com.systemplus.meuemprego.fw.Constants;


public class PasswordEncryptor {

	public static final String SALT_KEY = "PRIVATE_SALT";
	public static final String PASSWORD_KEY = "ENCRYPTED_PASSWORD";
	private static final int iterations = 500000;

	private PasswordEncryptor() {
	}

	public static Map<String, String> encrypt(String password) {
		return encrypt(password, RandomStringUtils.randomAscii(50));
	}

	public static Map<String, String> encrypt(String password, final String privateSalt) {
		password = Constants.PUBLIC_SALT + password + privateSalt;

		for (int i = 0; i < iterations; i++) {
			password = DigestUtils.sha384Hex(password);
		}

		final String finalPassword = password;

		return new HashMap<String, String>() {
			private static final long serialVersionUID = 1L;
			{
				put(SALT_KEY, privateSalt);
				put(PASSWORD_KEY, finalPassword);
			}
		};
	}

}