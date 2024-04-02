package com.singletonandbuilder;

public class VeritabaniBaglantisiSingleton {

	private static VeritabaniBaglantisiSingleton instance;

	private String host;
	private String port;
	private String database;
	private String username;
	private String password;

	private VeritabaniBaglantisiSingleton() {
		// Private constructor prevents direct instantiation.
	}

	public static VeritabaniBaglantisiSingleton getInstance() {
		if (instance == null) {
			synchronized (VeritabaniBaglantisiSingleton.class) {
				if (instance == null) {
					instance = new VeritabaniBaglantisiSingleton();
				}
			}
		}
		return instance;
	}

	// Bağlantı kurma ve diğer işlemleri içeren metotlar...

	public void setHost(String host) {
		this.host = host;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHost() {
		return host;
	}

	public String getPort() {
		return port;
	}

	public String getDatabase() {
		return database;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public static void setInstance(VeritabaniBaglantisiSingleton instance) {
		VeritabaniBaglantisiSingleton.instance = instance;
	}
}
