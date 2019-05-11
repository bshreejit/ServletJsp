package com.shreejit.JEEMaven;

import java.util.List;
import java.util.function.Consumer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TestSystem {
	// Create an EntityManagerFactory when you start the application
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = 
			Persistence.createEntityManagerFactory("JEEMaven");

	public static void main(String[] args) {
		addCustomer(1, "Shreejit", "Bhattarai");
		addCustomer(2, "Sujan", "Dhakal");
		addCustomer(3, "Subeg", "Aryal");
		addCustomer(4, "Suraj", "Adhikari");
		getCustomer(1);
		getCustomers();
		changeFName(4, "Doresh");
		deleteCustomer(3);
		ENTITY_MANAGER_FACTORY.close();
	}

	public static void addCustomer(int id, String fname, String lname) {
		// The EntityManager class allows operations such as create, read, update,
		// delete
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		// Used to issue transactions on the EntityManager
		EntityTransaction et = null;

		try {
			// Get transaction and start
			et = em.getTransaction();
			et.begin();

			// Create and set values for new customer
			Customer cust = new Customer();
			cust.setId(id);
			cust.setfName(fname);
			cust.setlName(lname);

			// Save the customer object
			em.persist(cust);
			et.commit();
		} catch (Exception ex) {
			// If there is an exception rollback changes
			if (et != null) {
				et.rollback();
			}
			ex.printStackTrace();
		} finally {
			// Close EntityManager
			em.close();
		}
	}

	
	//For retrieving Single Customer
	public static void getCustomer(int id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		// the lowercase c refers to the object
		// :custID is a parameterized query thats value is set below
		String query = "SELECT c FROM Customer2 c WHERE c.id = :custID";

		// Issue the query and get a matching Custome2r
		TypedQuery<Customer> tq = em.createQuery(query, Customer.class);
		tq.setParameter("custID", id);

		Customer cust = null;
		try {
			// Get matching customer object and output
			cust = tq.getSingleResult();
			System.out.println(cust.getfName() + " " + cust.getlName());
		} catch (NoResultException ex) {
			ex.printStackTrace();
		} finally {
			em.close();
		}
	}

	//For retriving Multiple Customer
	public static void getCustomers() {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();

		String strQuery = "SELECT c FROM Customer c WHERE c.id IS NOT NULL";

		TypedQuery<Customer> tq = em.createQuery(strQuery, Customer.class);
		List<Customer> custs;
		try {
			// Get matching customer object and output
			custs = tq.getResultList();
			custs.forEach(new Consumer<Customer>() {
				public void accept(Customer cust) {
					System.out.println(cust.getfName() + " " + cust.getlName());
				}
			});
		} catch (NoResultException ex) {
			ex.printStackTrace();
		} finally {
			em.close();
		}
	}

	public static void changeFName(int id, String fname) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;

		Customer cust = null;

		try {
			// Get transaction and start
			et = em.getTransaction();
			et.begin();

			// Find customer and make changes
			cust = em.find(Customer.class, id);
			cust.setfName(fname);

			// Save the customer object
			em.persist(cust);
			et.commit();
		} catch (Exception ex) {
			// If there is an exception rollback changes
			if (et != null) {
				et.rollback();
			}
			ex.printStackTrace();
		} finally {
			// Close EntityManager
			em.close();
		}
	}

	public static void deleteCustomer(int id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		Customer cust = null;

		try {
			et = em.getTransaction();
			et.begin();
			cust = em.find(Customer.class, id);
			em.remove(cust);
			et.commit();
		} catch (Exception ex) {
			// If there is an exception rollback changes
			if (et != null) {
				et.rollback();
			}
			ex.printStackTrace();
		} finally {
			// Close EntityManager
			em.close();
		}
	}
}
