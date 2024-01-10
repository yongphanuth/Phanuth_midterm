/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convert;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Convert {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();
        
        int year = Integer.parseInt(shortDate.substring(0, 4));
        int month = Integer.parseInt(shortDate.substring(5, 7));
        int day = Integer.parseInt(shortDate.substring(8));

        String monthName = getMonthName(month);

        System.out.println("Full Date: " + monthName + " " + day + ", " + year);

        scanner.close();
    }

    private static String getMonthName(int m) {
        String[] month = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return month [m - 1];
    }
}


