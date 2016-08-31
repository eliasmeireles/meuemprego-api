package br.com.systemplus.meuemprego.fw;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Constants {

	public static final String VERSION = "0.0.1 (Beta)";

	public static final String PUBLIC_SALT;
	public static final String PUBLIC_TOKEN_KEY;
	public static final String PRIVATE_TOKEN_KEY;

	public static final String PATTERN_DATE_FULL;
	public static final String PATTERN_TIME_FULL;
	public static final String PATTERN_DATE_TIME_FULL;

	public static final String ENCODING;

	private static Map<Object, Object> properties;

	static {
		properties = new HashMap<Object, Object>();

		Properties props = new Properties();

		ENCODING = props.getProperty("encoding");

		PATTERN_DATE_FULL = props.getProperty("pattern.date.full");
		PATTERN_TIME_FULL = props.getProperty("pattern.time.full");
		PATTERN_DATE_TIME_FULL = PATTERN_DATE_FULL + " " + PATTERN_TIME_FULL;

		PUBLIC_SALT = props.getProperty("public.salt");
		PUBLIC_TOKEN_KEY = props.getProperty("public.token");
		PRIVATE_TOKEN_KEY = props.getProperty("private.token");

		addProperties(props.entrySet());
	}

	public static Object getProperty(Object property) {
		return properties.get(property);
	}

	public static void addProperties(Set<Entry<Object, Object>> entrySet) {
		for (Entry<Object, Object> entry : entrySet) {
			properties.put(entry.getKey(), entry.getValue());
		}
	}
}