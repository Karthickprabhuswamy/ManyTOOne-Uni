package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavrRoom {
	
	public static void main(String[] args)
	
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager  entityManager =  entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		
		Hotel hotel = new Hotel();
		
		hotel.setName("Kadamba");
		hotel.setAddress("Banglore");
		
		Room room = new Room();
		room.setCapacity(3);
		room.setType("AC");
		room.setHotel(hotel);
		
		Room room1 = new Room();
		room1.setCapacity(2);
		room1.setType("Non-AC");
		room1.setHotel(hotel);
		
		Room room2 = new Room();
		room2.setCapacity(1);
		room2.setType("AC");
		room2.setHotel(hotel);
		
		Hotel hotel1 = new Hotel();
		
		hotel1.setName("Malgudi");
		hotel1.setAddress("Banglore");
		
		Room room3 = new Room();
		room3.setCapacity(3);
		room3.setType("AC");
		room3.setHotel(hotel1);
		
		Room room4 = new Room();
		room4.setCapacity(3);
		room4.setType("AC");
		room4.setHotel(hotel1);

		entityTransaction.begin();
		
		entityManager.persist(hotel);
		entityManager.persist(hotel1);
		entityManager.persist(room);
		entityManager.persist(room1);
		entityManager.persist(room2);
		entityManager.persist(room3);
		entityManager.persist(room4);
		
		entityTransaction.commit();
		
		System.out.println("Data saved");
		
		
				
		
	}

}
