package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args){
        Scanner customerScanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = customerScanner.nextLine().trim();

        int spaceIndex = name.indexOf(" ");
        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex + 1);

        System.out.print("Please enter date of arrival(MM-DD-YYYY): ");
        String userInput = customerScanner.nextLine().trim();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate userDate = LocalDate.parse(userInput, formatter);

        System.out.print("And how many tickets? ");
        int tickets = customerScanner.nextInt();
        System.out.println("==============================");

        System.out.println(tickets +" tickets reserve for "+ userDate +" under "+ lastName +", "+ firstName);

        customerScanner.close();




    }
}
