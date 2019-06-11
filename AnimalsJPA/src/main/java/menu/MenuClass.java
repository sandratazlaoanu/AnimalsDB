package menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.sql.SQLException;

import controller.AnimalController;

public class MenuClass {

	public void menu() throws NumberFormatException, IOException, SQLException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		AnimalController controller = new AnimalController();

		while (true) {

			System.out.println("---Options---");
			System.out.println("1. Print.");
			System.out.println("2. Add.");
			System.out.println("3. Update.");
			System.out.println("4. Delete.");
			System.out.println("5. Order by birthdate.");

			int option = Integer.parseInt(reader.readLine());
			switch (option) {

			case 0:
				System.exit(0);
				break;
			case 1:
				System.out.println("What do you want to see?\n");
				System.out.println("1.Print cat list.");
				System.out.println("2.Print dog list.");
				System.out.println("3.Print parrot list.");

				int optPrint = Integer.parseInt(reader.readLine());
				switch (optPrint) {

				case 0:
					break;
				case 1:
					controller.printCatList();
					break;
				case 2:
					controller.printDogList();
					break;
				case 3:
					controller.printParrotList();
					break;
				}

				break;

			case 2:
				System.out.println("---Options---\n");
				System.out.println("1.Add cat.");
				System.out.println("2.Add dog.");
				System.out.println("3.Add parrot.");

				int optAdd = Integer.parseInt(reader.readLine());
				switch (optAdd) {

				case 0:
					break;
				case 1:
					System.out.println("Id: ");
					int idCat = Integer.parseInt(reader.readLine());
					System.out.println("Name: ");
					String nameCat = reader.readLine();
					System.out.println("Gender: ");
					String genderCat = reader.readLine();
					System.out.println("Data: ");

					System.out.println("An: ");
					int year = Integer.parseInt(reader.readLine());
					System.out.println("Luna: ");
					int month = Integer.parseInt(reader.readLine());
					System.out.println("Zi: ");
					int day = Integer.parseInt(reader.readLine());

					@SuppressWarnings("deprecation")
					Date dateCat = new Date(year, month, day);
					controller.createCat(idCat, nameCat, genderCat, dateCat);
					break;
				case 2:
					System.out.println("Id: ");
					int idDog = Integer.parseInt(reader.readLine());
					System.out.println("Name: ");
					String nameDog = reader.readLine();
					System.out.println("Gender: ");
					String genderDog = reader.readLine();
					System.out.println("Data: ");

					System.out.println("An: ");
					int yearDog = Integer.parseInt(reader.readLine());
					System.out.println("Luna: ");
					int monthDog = Integer.parseInt(reader.readLine());
					System.out.println("Zi: ");
					int dayDog = Integer.parseInt(reader.readLine());

					@SuppressWarnings("deprecation")
					Date dateDog = new Date(yearDog, monthDog, dayDog);
					controller.createDog(idDog, nameDog, genderDog, dateDog);
					break;
				case 3:
					System.out.println("Id: ");
					int idParrot = Integer.parseInt(reader.readLine());
					System.out.println("Name: ");
					String nameParrot = reader.readLine();
					System.out.println("Gender: ");
					String genderParrot = reader.readLine();
					System.out.println("Data: ");

					System.out.println("An: ");
					int yearParrot = Integer.parseInt(reader.readLine());
					System.out.println("Luna: ");
					int monthParrot = Integer.parseInt(reader.readLine());
					System.out.println("Zi: ");
					int dayParrot = Integer.parseInt(reader.readLine());

					@SuppressWarnings("deprecation")
					Date dateParrot = new Date(yearParrot, monthParrot, dayParrot);
					controller.createParrot(idParrot, nameParrot, genderParrot, dateParrot);
					break;
				}
				break;

			case 3:
				System.out.println("---Options---\n");
				System.out.println("1.Update cat.");
				System.out.println("2.Update dog.");
				System.out.println("3.Update parrot.");

				int optUpdate = Integer.parseInt(reader.readLine());
				switch (optUpdate) {

				case 0:
					break;
				case 1:
					System.out.println("Id: ");
					int idCat = Integer.parseInt(reader.readLine());
					System.out.println("Name: ");
					String nameCat = reader.readLine();
					System.out.println("Gender: ");
					String genderCat = reader.readLine();
					System.out.println("Data: ");

					System.out.println("An: ");
					int year = Integer.parseInt(reader.readLine());
					System.out.println("Luna: ");
					int month = Integer.parseInt(reader.readLine());
					System.out.println("Zi: ");
					int day = Integer.parseInt(reader.readLine());

					@SuppressWarnings("deprecation")
					Date dateCat = new Date(year, month, day);
					controller.updateCat(idCat, nameCat, genderCat, dateCat);
					break;
				case 2:
					System.out.println("Id: ");
					int idDog = Integer.parseInt(reader.readLine());
					System.out.println("Name: ");
					String nameDog = reader.readLine();
					System.out.println("Gender: ");
					String genderDog = reader.readLine();
					System.out.println("Data: ");

					System.out.println("An: ");
					int yearDog = Integer.parseInt(reader.readLine());
					System.out.println("Luna: ");
					int monthDog = Integer.parseInt(reader.readLine());
					System.out.println("Zi: ");
					int dayDog = Integer.parseInt(reader.readLine());

					@SuppressWarnings("deprecation")
					Date dateDog = new Date(yearDog, monthDog, dayDog);
					controller.updateDog(idDog, nameDog, genderDog, dateDog);
					break;
				case 3:
					System.out.println("Id: ");
					int idParrot = Integer.parseInt(reader.readLine());
					System.out.println("Name: ");
					String nameParrot = reader.readLine();
					System.out.println("Gender: ");
					String genderParrot = reader.readLine();
					System.out.println("Data: ");

					System.out.println("An: ");
					int yearParrot = Integer.parseInt(reader.readLine());
					System.out.println("Luna: ");
					int monthParrot = Integer.parseInt(reader.readLine());
					System.out.println("Zi: ");
					int dayParrot = Integer.parseInt(reader.readLine());

					@SuppressWarnings("deprecation")
					Date dateParrot = new Date(yearParrot, monthParrot, dayParrot);
					controller.updateParrot(idParrot, nameParrot, genderParrot, dateParrot);
					break;
				}
				break;

			case 4:
				System.out.println("---Options---\n");
				System.out.println("1.Delete cat.");
				System.out.println("2.Delete dog.");
				System.out.println("3.Delete parrot.");

				int optDelete = Integer.parseInt(reader.readLine());
				switch (optDelete) {

				case 0:
					break;
				case 1:
					System.out.println("Datele: ");
					System.out.println("Id: ");
					int catToDelete = Integer.parseInt(reader.readLine());
					controller.deleteCat(catToDelete);
					break;
				case 2:
					System.out.println("Datele: ");
					System.out.println("Id: ");
					int dogToDelete = Integer.parseInt(reader.readLine());
					controller.deleteDog(dogToDelete);
					break;
				case 3:
					System.out.println("Datele: ");
					System.out.println("Id: ");
					int parrotToDelete = Integer.parseInt(reader.readLine());
					controller.deleteParrot(parrotToDelete);
					break;
				}
				break;
			}
		}

	}
}
