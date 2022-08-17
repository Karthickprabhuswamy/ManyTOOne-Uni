package com.ty.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveReview {
	
public static void main(String[] args)
	
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager  entityManager =  entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		
		Product product =  new Product();
		product.setName("Mobile Phone");
		product.setBrand("Samsung m21");
		product.setCost(14799);
		
		Reviwe review =  new Reviwe();
		
		review.setUsername("Karthick");
		review.setDescription("Very bad");
		review.setProduct(product);
		
		
		Reviwe review1 =  new Reviwe();
		
		review1.setUsername("Akhilesh");
		review1.setDescription("Very  very bad");
		review1.setProduct(product);
		
		Reviwe review2=  new Reviwe();
		
		review2.setUsername("Umesh");
		review2.setDescription("Very  very bad");
		review2.setProduct(product);
		
		
		entityTransaction.begin();
		
		 entityManager.persist(product);
		 entityManager.persist(review);
		 entityManager.persist(review1);
		 entityManager.persist(review2);
		 
		entityTransaction.commit();
		 
		 System.out.println("--------Data Saved------------");

}
}