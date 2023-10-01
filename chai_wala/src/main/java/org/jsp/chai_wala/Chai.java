package org.jsp.chai_wala;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.Table;

@Entity
@Table
public class Chai {

	@Id
	private int id;
	private String type;
	private int quantity;
	private double price;
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}

	


	@Override
	public String toString() {
		return "Chai [id=" + id + ", type=" + type + ", quantity=" + quantity + ", price=" + price + "]";
	}



	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Chai c =new Chai();
//		c.setId(5);
//		c.setType("Masala Chai");
//		c.setQuantity(5);
//		c.setPrice(500);
		
		// persist is used to only insert a record
//		et.begin();
//		em.persist(c);
//		et.commit();
//		
//		merge is used to insert and update both
//		et.begin();
//		em.merge(c);
//		et.commit();
//		
		//find 
//		Chai c1= em.find(Chai.class,10);
//		if(c1!=null) {
//			System.out.println(c1);
//		}
//		else {
//			System.out.println("object not found");
//		}
		
		//delete
		Chai c2=em.find(Chai.class, 105);
		if(c2!=null) {
			et.begin();
			em.remove(c2);
			et.commit();
			}else {
		System.out.println("object not deleted");
	}
		
//		findAll
//		Query q=em.createQuery("select c from Chai c");
//		List<Chai> list = q.getResultList();
//		System.out.println(list);
		
//		for (Chai c1:list) {
//			System.out.println(c1);
//		}
//		
		
	}
	

}
