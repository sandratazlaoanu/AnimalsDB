package helper;

import java.util.function.Consumer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DatabaseHelper {

	private DatabaseHelper() {

	}

	/* An instance for every category */
	
	private static DatabaseHelper dogInstance;
	private static DatabaseHelper catInstance;
	private static DatabaseHelper parrotInstance;

	public static DatabaseHelper getInstance(String instanceName) {

		switch (instanceName) {
		case "Dog": {
			if (dogInstance == null) {
				dogInstance = new DatabaseHelper();
				dogInstance.init("AnimalDog");
			}
			return dogInstance;
		}
		case "Cat": {
			if (catInstance == null) {
				catInstance = new DatabaseHelper();
				catInstance.init("AnimalCat");
			}
			return catInstance;
		}
		case "Parrot": {
			if (parrotInstance == null) {
				parrotInstance = new DatabaseHelper();
				parrotInstance.init("AnimalParrot");
			}
			return parrotInstance;
		}
		}
		return null;
	}

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public boolean executeTransaction(Consumer<EntityManager> action) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			action.accept(entityManager);
			entityTransaction.commit();
		} catch (RuntimeException e) {
			System.err.println("Transaction error: " + e.getLocalizedMessage());
			entityTransaction.rollback();
			return false;
		}

		return true;
	}

	private boolean init(String dbString) {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory(dbString);
			entityManager = entityManagerFactory.createEntityManager();
		} catch (Exception e) {
			System.err.println("Error at initialing DatabaseManager: " + e.getMessage().toString());
			return false;
		}

		return true;
	}
}
