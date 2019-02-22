import java.util.Scanner;


public class Driver {      //this is the driver class with main to called the class Contact and Addressbook 

    public static void main(String[] args) {       //the main class 

        Contact one = new Contact("A", "A", "A", "A");   // I give it some contact information first.
        Contact two = new Contact("Bob", "Bob", "A", "A");

        Scanner scan = new Scanner(System.in);

        AddressBook book = new AddressBook();
        book.addNewContact(one);
        book.addNewContact(two);

        System.out.println("give me name? ");  //ask for name


        String name = scan.nextLine();  //take the input from the user and store is as as first name 
        System.out.println("Last name?");
        String lname = scan.nextLine();

        book.addNewContact(new Contact(name, lname, "123", "123")); /

        book.displayAllContacts(); //this method call displayAllContact is to display all it have from the address book
//       System.out.println("Who are you change name for  give me (first name) ");
//       String firstname = scan.nextLine();
//
//       int i = book.getIndexByName(firstname);
//        System.out.println("I found " + firstname +   " at " + i);
//
//        System.out.println("What do you want to change their name into?");
//        String newName = scan.nextLine();
//
//        book.updateName(i, newName);
    }
}
