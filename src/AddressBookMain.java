import java.util.LinkedList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();
        AddressBook addressBook = new AddressBook();
        //Person person;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Address Book !");
        int temp = 0;
        while (temp == 0) {
            System.out.print("\n1. Add Person." +
                    "\n2. View Address Book." +
                    "\n3. Edit details."+
                    "\n4. Delete person."+
                    "\n5. Sort by name." +
                    "\n6. Exit." +
                    "\n Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    addressBook.addPerson(addressBook);
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Address Book is Empty.");
                    } else {
                        for (Person details : list) {
                            System.out.println(details.toString());
                        }
                    }
                    break;

                case 3:
                    if (list.isEmpty()){
                        System.out.println("Address Book Empty.");
                    } else {
                        list = addressBook.editPerson(list);
                    }
                    break;

                case 4:
                    if (list.isEmpty()) {
                        System.out.println("Address Book Empty.");
                    } else {
                        list = addressBook.deletePerson(list);
                    }
                    break;

                case 5:
                    if (list.isEmpty()) {
                        System.out.println("Address Book Empty.");
                    } else {
                        addressBook.sortByName(list);
                    }
                    break;

                case 6:
                    temp = 1;
                    System.out.println("Exit.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
                    break;
            }
        }
    }
}
