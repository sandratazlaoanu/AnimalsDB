package controller;

import java.util.Date;
import java.util.List;

import daoImpl.AnimalDao;
import helper.DatabaseHelper;
import model.Animal;

public class AnimalController {

	static DatabaseHelper dhDog = DatabaseHelper.getInstance("Dog");
	static DatabaseHelper dhCat = DatabaseHelper.getInstance("Cat");
	static DatabaseHelper dhParrot = DatabaseHelper.getInstance("Parrot");

	AnimalDao dogDao = new AnimalDao(dhDog);
	AnimalDao catDao = new AnimalDao(dhCat);
	AnimalDao parrotDao = new AnimalDao(dhParrot);

	/* Functions for Dog category */

	public void printDogList() {

		List<Animal> list = dogDao.getAll();

		for (Animal a : list) {
			System.out.println(a.toString());
		}
	}

	public void createDog(int id, String name, String gender, Date birthDate) {
		if (dogDao.get(id).isPresent() == true) {
			System.out.println("Already exists..");
		}
		Animal newObj = new Animal();
		newObj.setId(id);
		newObj.setName(name);
		newObj.setGender(gender);
		newObj.setBirthdate(birthDate);
		dogDao.create(newObj);
	}

	public void findDog(int id) {

		System.out.println(dogDao.findById(id));
	}

	public void updateDog(int id, String name, String gender, Date birthDate) {
		Animal toFind = dogDao.findById(id);
		Animal newObj = new Animal();
		newObj.setId(id);
		newObj.setName(name);
		newObj.setGender(gender);
		newObj.setBirthdate(birthDate);
		dogDao.create(newObj);

		dogDao.update(toFind, newObj);

	}

	public void deleteDog(int id) {

		Animal toFind = dogDao.findById(id);

		dogDao.delete(toFind);
	}

	/* Functions for Cat category */

	public void printCatList() {

		List<Animal> list = catDao.getAll();

		for (Animal a : list) {
			System.out.println(a.toString());
		}
	}

	public void createCat(int id, String name, String gender, Date birthDate) {
		if (catDao.get(id).isPresent() == true) {
			System.out.println("Already exists..");
		}
		Animal newObj = new Animal();
		newObj.setId(id);
		newObj.setName(name);
		newObj.setGender(gender);
		newObj.setBirthdate(birthDate);
		catDao.create(newObj);
	}

	public void findCat(int id) {

		System.out.println(catDao.findById(id));
	}

	public void updateCat(int id, String name, String gender, Date birthDate) {
		Animal toFind = catDao.findById(id);
		Animal newObj = new Animal();
		newObj.setId(id);
		newObj.setName(name);
		newObj.setGender(gender);
		newObj.setBirthdate(birthDate);
		catDao.create(newObj);

		catDao.update(toFind, newObj);

	}

	public void deleteCat(int id) {

		Animal toFind = catDao.findById(id);

		catDao.delete(toFind);
	}

	/* Functions for Parrot category */

	public void printParrotList() {

		List<Animal> list = parrotDao.getAll();

		for (Animal a : list) {
			System.out.println(a.toString());
		}
	}

	public void createParrot(int id, String name, String gender, Date birthDate) {
		if (parrotDao.get(id).isPresent() == true) {
			System.out.println("Already exists..");
		}
		Animal newObj = new Animal();
		newObj.setId(id);
		newObj.setName(name);
		newObj.setGender(gender);
		newObj.setBirthdate(birthDate);
		parrotDao.create(newObj);
	}

	public void findParrot(int id) {

		System.out.println(parrotDao.findById(id));
	}

	public void updateParrot(int id, String name, String gender, Date birthDate) {
		Animal toFind = parrotDao.findById(id);
		Animal newObj = new Animal();
		newObj.setId(id);
		newObj.setName(name);
		newObj.setGender(gender);
		newObj.setBirthdate(birthDate);
		parrotDao.create(newObj);

		parrotDao.update(toFind, newObj);

	}

	public void deleteParrot(int id) {

		Animal toFind = parrotDao.findById(id);

		parrotDao.delete(toFind);
	}

	public void sortDogList() {

		dogDao.sortByBirthdate();

	}

	public void sortCatList() {

		catDao.sortByBirthdate();

	}

	public void sortParrotList() {

		dogDao.sortByBirthdate();

	}
	
	public void sortDogListDesc() {

		dogDao.sortByBirthdateDesc();

	}

	public void sortCatListDesc() {

		catDao.sortByBirthdateDesc();

	}

	public void sortParrotListDesc() {

		dogDao.sortByBirthdateDesc();

	}
}
