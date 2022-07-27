package com.mycompany.bundleproject;

import java.util.Scanner;

public class BundleProject {
    public static void main(String[] args) {
        int num_1,num_2,num_3;
        TestDrive bundles = new TestDrive();
        Scanner scan = new Scanner(System.in);
  
        bundles.displayMainMenu();
        num_1 = scan.nextInt();
        while (num_1 != 1){
            System.out.println("**Please enter the number given on the menu**");
            bundles.displayMainMenu();
            num_1 = scan.nextInt();
            
        }
        switch(num_1){
            case 1:
                bundles.displayDataDeals();
                num_2 = scan.nextInt();
                switch(num_2){
                    case 1:
                        bundles.setDataDeal(num_2);
                        bundles.displayTypeOfPayment();
                        num_3 = scan.nextInt();
                        switch(num_3){
                            case 1:
                                bundles.displayConfirmation();
                                break;
                        }
                        break;
                    case 2:
                        bundles.setDataDeal(num_2);
                        bundles.displayTypeOfPayment();
                        num_3 = scan.nextInt();
                        switch(num_3){
                            case 1:
                                bundles.displayConfirmation();
                                break;
                        }
                        break;
                    case 3:
                        bundles.setDataDeal(num_2);
                        bundles.displayTypeOfPayment();
                        num_3 = scan.nextInt();
                        switch(num_3){
                            case 1:
                                bundles.displayConfirmation();
                                break;
                        }
                        break;
                    case 4:
                        bundles.setDataDeal(num_2);
                        bundles.displayTypeOfPayment();
                        num_3 = scan.nextInt();
                        switch(num_3){
                            case 1:
                                bundles.displayConfirmation();
                                break;
                        }
                        break;
                    case 5:
                        bundles.setDataDeal(num_2);
                        bundles.displayTypeOfPayment();
                        num_3 = scan.nextInt();
                        switch(num_3){
                            case 1:
                                bundles.displayConfirmation();
                                break;
                        }
                        break;
                    case 6:
                        bundles.setDataDeal(num_2);
                        bundles.displayTypeOfPayment();
                        num_3 = scan.nextInt();
                        switch(num_3){
                            case 1:
                                bundles.displayConfirmation();
                                break;
                        }
                        break;
                }
                break;       
        }    
    }
}
