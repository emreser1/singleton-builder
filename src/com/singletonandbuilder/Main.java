package com.singletonandbuilder;

public class Main {

	public static void main(String[] args) {
		
		VeritabaniBaglantisiSingleton baglantiSingleton = VeritabaniBaglantisiSingleton.getInstance();
		
		VeritabaniBaglantisiSingleton baglantiSingleton2 = VeritabaniBaglantisiSingleton.getInstance();

		if(baglantiSingleton == baglantiSingleton2)
			System.out.println("aynı nesne");

		
		VeritabaniBaglantisiBuilder builder = new VeritabaniBaglantisiBuilder();
		
		
		VeritabaniBaglantisi veritabaniBaglantisi = builder
		    .host("localhost")
		    .port("3306")
		    .database("my_database")
		    .username("my_username")
		    .password("my_password")
		    .build();
		
		System.out.println(" db : " + veritabaniBaglantisi.getDatabase());
		System.out.println(" port : " + veritabaniBaglantisi.getPort());
		System.out.println(" host : " + veritabaniBaglantisi.getHost());
		System.out.println(" username : " + veritabaniBaglantisi.getUsername());
		System.out.println(" password : " + veritabaniBaglantisi.getPassword());



	
	}

}
