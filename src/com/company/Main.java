package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner appScanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("How many do you want to introduce?");
        int users = appScanner.nextInt();

        for (int i = 0; i < users; i++){
            User newUser = new User();

            System.out.println("What's your first name?");
            String fname = appScanner.next();
            System.out.println("What's your last name?");
            String lname = appScanner.next();
            System.out.println("What's your email address?");
            String emailAdd = appScanner.next();
            System.out.println("What's your contact number?");
            int contactNum  = appScanner.nextInt();

            newUser.setFirstName(fname);
            newUser.setLastName(lname);
            newUser.setEmail(emailAdd);
            newUser.setContactNumber(contactNum);
            newUser.setId(System.currentTimeMillis());

            newUser.introduce();
            newUser.provideContact();
            System.out.println(newUser.getId());
        }
    }
}
