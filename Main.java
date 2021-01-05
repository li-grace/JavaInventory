//inventory tracker application
import java.util.Scanner;
import java.util.ArrayList;
class Main {
  public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		List inventoryList = new List();
		//ArrayList<Data> inventoryList = new ArrayList<Data>();
		String blah, newname, newbrand;
		int newnum;

		System.out.println("Welcome to the inventory tracker. Select:");
		System.out.println("1. Add new entry");
		System.out.println("2. View all entries");
		System.out.println("3. Delete an entry");
		System.out.println("4. Exit");

		int userOption = in.nextInt();
		while (userOption != 5) {
			switch (userOption) {
			case (1):
				System.out.print("Enter the item name: ");
				blah = in.nextLine();
				newname = in.nextLine();

				System.out.printf("Enter the item brand: ");
				//blah = in.nextLine();
				newbrand = in.nextLine();

				System.out.printf("Enter the item quantity: ");
				newnum = in.nextInt();

				Data newEntry = new Data(newname, newbrand, newnum);
				inventoryList.append(newEntry);
				break;

			case (2):
				//int total = inventoryList.size();
				/*System.out.printf("Displaying all %d items:\n",inventoryList.getSize());
				for (int i = 0; i < total; i++) {
					System.out.printf("%d. ",i+1);
					inventoryList.get(i).print();
				}*/
				inventoryList.print();
				break;
			case (3):
				System.out.print("Enter the number of the entry you wish to delete: ");
				newnum = in.nextInt();
				newnum--;
				System.out.printf("Are you sure you want to delete ");
				inventoryList.getData(newnum).print();
				System.out.printf("? y or n: \n");
				blah = in.nextLine();
				newname = in.nextLine();
				if (newname.equals("y")){
					/*if (newnum < inventoryList.size() && newnum >= 0) {
						inventoryList.remove(newnum);
						System.out.println("It has been removed.");
					}
					else {
						System.out.println("Sorry! This item doesn't exist.");
					}*/
					inventoryList.delete(newnum);
				}
				break;
			case (4):
				System.out.println("Thanks for using the inventory tracker! :)");
				userOption = 5;
				return;
			}
			System.out.println();
			System.out.println("1. Add new entry");
			System.out.println("2. View all entries");
			System.out.println("3. Delete an entry");
			System.out.println("4. Exit");

			userOption = in.nextInt();
		}






  }
}