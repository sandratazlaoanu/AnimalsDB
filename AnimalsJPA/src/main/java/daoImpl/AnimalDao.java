package daoImpl;

import java.util.List;
import java.util.Optional;

import javax.persistence.TypedQuery;

import dao.Dao;
import helper.DatabaseHelper;
import model.Animal;

public class AnimalDao implements Dao<Animal> {
	
	private DatabaseHelper databaseHelper;
	
	public AnimalDao(DatabaseHelper databaseHelper) {
		this.databaseHelper = databaseHelper;
	}

	@Override
	public Optional<Animal> get(int id) {
		return Optional.ofNullable(databaseHelper.getEntityManager().find(Animal.class, id));
	}

	@Override
	public List<Animal> getAll() {
		TypedQuery<Animal> query = databaseHelper.getEntityManager().createQuery("SELECT a FROM Animal a",
				Animal.class);
		return query.getResultList();
	}

	@Override
	public boolean create(Animal animal) {
		return databaseHelper.executeTransaction(entityManager -> entityManager.persist(animal));
	}

	@Override
	public boolean update(Animal old, Animal newObj) {
		old.setId(newObj.getId());
		old.setName(newObj.getName());
		old.setGender(newObj.getGender());
		old.setBirthdate(newObj.getBirthdate());
		return databaseHelper.executeTransaction(entityManager -> entityManager.merge(old));
	}

	@Override
	public boolean delete(Animal animal) {
		return databaseHelper.executeTransaction(entityManager -> entityManager.remove(animal));
	}

	@Override
	public Animal findById(int id) {
		
		Animal toFind = databaseHelper.getEntityManager().find(Animal.class, id);
		
		return toFind;
	}
	

}