package com.singletonandbuilder;

public class VeritabaniBaglantisiBuilder {
	String host;
	String port;
	String database;
	String username;
	String password;

	public VeritabaniBaglantisiBuilder() {
	}

	public VeritabaniBaglantisiBuilder host(String host) {
		this.host = host;
		return this;
	}

	public VeritabaniBaglantisiBuilder port(String port) {
		this.port = port;
		return this;
	}

	public VeritabaniBaglantisiBuilder database(String database) {
		this.database = database;
		return this;
	}

	public VeritabaniBaglantisiBuilder username(String username) {
		this.username = username;
		return this;
	}

	public VeritabaniBaglantisiBuilder password(String password) {
		this.password = password;
		return this;
	}

	public VeritabaniBaglantisi build() {
		return new VeritabaniBaglantisi(this);
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

class VeritabaniBaglantisi {
	private final String host;
	private final String port;
	private final String database;
	private final String username;
	private final String password;

	public VeritabaniBaglantisi(VeritabaniBaglantisiBuilder builder) {
		this.host = builder.host;
		this.port = builder.port;
		this.database = builder.database;
		this.username = builder.username;
		this.password = builder.password;
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

}
