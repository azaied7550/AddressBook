package com.company;


import java.security.Key;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Prepare to accept user input
        Scanner Keyboard = new Scanner(System.in);

        //Create an ArrayList of Person objects
        ArrayList<Person> personList = new ArrayList<>();

        String answer ="y";
        int count=1;

        while (answer.equalsIgnoreCase("y")){

            //Creating a new Person object
            Person newPerson = new Person();

            System.out.print("Enter person " +count+ " first name: ");
            newPerson.setFirstName(Keyboard.nextLine());
            System.out.print("Enter person " +count+ " last name: ");
            newPerson.setLastName(Keyboard.nextLine());
            System.out.print("Enter person " +count+ " address ");
            newPerson.setAddress(Keyboard.nextLine());
            System.out.print("Enter person " +count+ " phone number: ");
            newPerson.setPhoneNumber(Keyboard.nextLine());
            System.out.print("Enter person " +count+ " email: ");
            newPerson.setEmail(Keyboard.nextLine());
            personList.add(newPerson);
            count++;
            System.out.print("Do you want to enter a new person? (Y/N) :");
            answer = Keyboard.nextLine();
        }

        System.out.println();

        answer="n";
       // count=0;
        do {
            System.out.print("Enter your search term: ");
            String searchTerm= Keyboard.next();
            for (Person eachPerson: personList) {
                if (eachPerson.getFirstName().equalsIgnoreCase(searchTerm) || (eachPerson.getLastName().equalsIgnoreCase(searchTerm))
                        || (eachPerson.getAddress().equalsIgnoreCase(searchTerm)) || (eachPerson.getPhoneNumber().equalsIgnoreCase(searchTerm))
                        || (eachPerson.getEmail().equalsIgnoreCase(searchTerm))) {

                    print(eachPerson);

                } else System.out.println("No record matching your search ");

            }
                Keyboard.nextLine();
                System.out.println("Do you want to continue? (Y/N)");
                answer = Keyboard.nextLine();

        } while (answer.equalsIgnoreCase("y"));
    }

        public static void  print(Person eachPerson){
            System.out.println("First Name: " +eachPerson.getFirstName());
            System.out.println("Last Name: " +eachPerson.getLastName());
            System.out.println("Address: " +eachPerson.getAddress());
            System.out.println("Phone Number: " +eachPerson.getPhoneNumber());
            System.out.println("Email: " +eachPerson.getEmail());
            System.out.println();
    }
}
