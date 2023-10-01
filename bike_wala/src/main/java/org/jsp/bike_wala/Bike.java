package org.jsp.bike_wala;

import java.util.Iterator;
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
public class Bike {
	@Id
	private int id;
	private String name;
	private String color;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	public static void main (String []args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();	
		
//		Bike b=new Bike();
//		b.setId(105);
//		b.setName("KTM");
//		b.setColor("Orange");
//		b.setPrice(95000);
//		
		
//	    persist is used to only insert a record 
//		save
//		et.begin();
//		em.persist(b);
//		et.commit();
		
		
//	merge is used to insert and update both
//		et.begin();
//		em.merge(b);
//		et.commit();
		
//		find
//		Bike b1=em.find(Bike.class, 1010);
//		if(b1!=null) {
//		System.out.println(b1);
//		
//	}else {
//		System.out.println("object not found");
//	}
		
		//delete
//		Bike b2=em.find(Bike.class, 105);
//		if(b2!=null) {
//			et.begin();
//			em.remove(b2);
//			et.commit();
//			}else {
//		System.out.println("object not deleted");
//	}
		
//		findall
		
		Query q=em.createQuery("select b from Bike b");
		List<Bike> list =q.getResultList();	
//		System.out.println(list);
		
		
		//to get output in list
//		Iterator i=list.iterator();
//		while(i.hasNext()){
//			System.out.println(i.next());
//		}
		
		for(Bike b:list) {
			System.out.println(b);
		}
	}
	}
