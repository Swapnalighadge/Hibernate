package org.jsp.car_wala;

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
public class Car {
	@Id
    private int id;
	private String name;
	private String colour;
	private double price;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String colour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour=colour;
	}
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public String toString() {
		return "Car[id="+id +", name="+ name + ", colour=" + colour + ", price=" + price + "]";
		
	}
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Car c =new Car();
		c.setId(3);
		c.setName("Thar");
		c.setColour("Black");
		c.setPrice(16000000);
		
		//persist is used to only insert a data
//		et.begin();
//		em.persist(c);
//		et.commit();
		
		
		//merge is used to insert and update the data
		et.begin();
		em.merge(c);
		et.commit();
		
		//find
//		Car c1=em.find(Car.class,1);
//		if(c1!=null) {
//			System.out.println(c1);
//		}
//		else {
//			System.out.println("object is not present");
//		}
		
		//delete
//				Car c2=em.find(Car.class, 105);
//				if(c2!=null) {
//					et.begin();
//					em.remove(c2);
//					et.commit();
//					}else {
//				System.out.println("object not deleted");
//			}
				
//				findAll
				Query q=em.createQuery("select c from Car c");
				List<Car> list = q.getResultList();
//				System.out.println(list);
				
			for (Car c1:list) {
					System.out.println(c1);
			}
				
		
		
		
	}
}
