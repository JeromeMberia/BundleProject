package com.mycompany.bundleproject;

public class TestDrive {
    
    String theDeal;
    
    
    public void displayMainMenu(){
        System.out.println("Enter a number"
                + "\n  *Note the option are bellow*"
                + "\n1:My Data Deals"
                + "\n*********************************");
    }
    
    public void displayDataDeals(){
        System.out.println("*********************************"
                + "\n1:Sh20=1GB for 1hr"
                + "\n2:Sh55=650MB for 24hr"
                + "\n3:Sh500=5GB for 30 Day"
                + "\n4:Sh1000=15GB for 30 Day"
                + "\n5:Sh1500=45GB for 30 Day(1.5GB/Day)"
                + "\n6:Hot Deals(Tunukiwa)Sh1500=45GB for 30 Day"
                + "\n*********************************");
    }
    public void setDataDeal(int theDataDeal){
        switch(theDataDeal){
            case 1:
                this.theDeal = "1GB@20sh for 1hr";
            case 2:
                this.theDeal = "650MB@Sh55 for 24hr";
            case 3:
                this.theDeal = "5GB@Sh500 for 30 Day";
            case 4:
                this.theDeal = "15GB@Sh1000 for 30 Day";
            case 5:
                this.theDeal = "45GB@Sh1500 for 30 Day(1.5GB/Day)";
            case 6:
                this.theDeal = "45GB@Sh1500 for 30 Day";
        }
    }
    public void displayTypeOfPayment(){
        System.out.println("*********************************"
                + "\nConfirm purchase of"
                + "\n "+theDeal
                + "\nPay with:"
                + "\n1:Airtime"
                + "\n*********************************");
    }
    
    public void displayConfirmation(){
        System.out.println("*********************************"
                + "\nYou have successfully"
                + "\npurchase "+theDeal
                + "\n*********************************");
    }
}
