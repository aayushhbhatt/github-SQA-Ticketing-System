/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package event;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramesh
 */
class BuySellUser implements SemiPrivilegedTransactions {

    public String buy(String title, int numOfTickets, String sellername, String myname) {

       
        
            //Requirements
            //--  // 1. should ask for eventtitle, seller username and number of tickets
            //--// 2. should display cost per ticket, and total cost to the user and ask for confirmation YES or NO
            // 3. should subtract the number of tickets from the sellers inventory
            // 4. should save this information in daily constraints file
            //Constraints
            // Semi-privileged transaction - only accepted when logged in any type of account except standard-sel
            // event title must be a current title with enough tickets available from the specified seller
            // at most 4 tickets can be purchased in one buy transaction
            
            /*
            * Semi-privileged transaction - only accepted when logged in any type of account except standard-sel
            * Intention: updates the sellers credit
            */
//        try {
//          //  File initialFile = new File("details.txt");
//            //File changedfile1 = new File("details.txt");
//            File userFile = new File("CurrentUserFile.txt");
//            checkAvailableTickets(sellername, numOfTickets);
//            
//         //   BufferedReader reader2 = new BufferedReader(new FileReader(initialFile));
//            BufferedReader reader3 = new BufferedReader(new FileReader(sellersFile));
//
//            File tempFile = new File("tempFile.txt");
//            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
//            String line, line2 = null;
//            double eachTicket;
//            boolean exists = false;
//            int availableTickets;
//            double totalCharge = 0;
//            int finalTickets;
//            double currCredit, finCredit;
//            while ((line = reader2.readLine()) != null) {
//
//                String[] split = line.split(" ");
//                if (sellername.equals(split[0])) {
//                    exists = true;
//                    eachTicket = Double.parseDouble(split[4]);
//                    System.out.println("Price of each ticket: " + eachTicket);
//                    totalCharge = totalCost(numOfTickets, eachTicket);
//                    System.out.println("Total Cost would be:" + totalCharge);
//
//                    //             System.out.println("Would you like to proceed with the transaction? Type yes or no");
////            Scanner scanYN = new Scanner(System.in);
////                        String yn = scanYN.nextLine();
////                        if(yn=="yes")
////                        {
////                            result = "tickets bought succesfully";
////                        }
////                        else if(yn =="no")
////                        {
////                         result = "transaction aborted";
////                        }
//                    availableTickets = Integer.parseInt(split[2]);
//                    currCredit = Double.parseDouble(split[3]);
//                    //String availTickets = new Integer(availableTickets).toString();
//                    finalTickets = remainingTickets(availableTickets, numOfTickets);
//
//                    // String currCredit = new Integer(currentCredit).toString();
//                    finCredit = currCredit + totalCharge;
//
//                    line = line.trim();
//
//                    line2 = split[0] + " " + split[1] + " " + finalTickets + " " + finCredit + " " + split[4];
//
//                } else {
//                    //System.out.println("User doesnt existe");
//                    writer.write(line);
//                    writer.newLine();
//                }
//
//            }
//
//            if (exists == false) {
//                System.out.println("Seller doesnt exists");
//
//            }  else {
//                writer.write(line2);
//            }
//            writer.write(line2);
//            writer.close();
//            reader2.close();
//            initialFile.delete();
//            boolean success = tempFile.renameTo(changedfile1);
//            System.out.println(success);
//            UpdateBuyer(myname, totalCharge, numOfTickets);
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(BuySellUser.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(BuySellUser.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return "Transaction succesfull";

BufferedReader reader = null;
 BufferedWriter writer = null;
boolean exists = false;
int availableTickets,finalTickets;
String line2 = null;
Double eachTicket, totalCharge = null;
sellername = sellername;
myname = myname;

            try {
                File availticketsfile = new File("AvailableTicketsFile.txt");
                reader = new BufferedReader(new FileReader(availticketsfile));
                File tempFile = new File("tempFile.txt");
            writer = new BufferedWriter(new FileWriter(tempFile));
                String line = null;
                
                while ((line = reader.readLine()) != null)
                {
                    String[] split = line.split(" ");
                    if((title.equals(split[0]))&& (sellername.equals(split[1]))&& (numOfTickets < Integer.parseInt(split[2])))
                    {
                        exists = true;
                        availableTickets = Integer.parseInt(split[2]);
                        finalTickets = remainingTickets(availableTickets, numOfTickets);
                        eachTicket = Double.parseDouble(split[3]);
                         totalCharge = totalCost(numOfTickets, eachTicket);
                        
                    
                        line2 = split[0] + " " + split[1] + " " + finalTickets + " " + split[3];
                     //   writer.write(line);
                        // writer.write(line2);
                        
                    }
                    else
                    {
                      //  exists = false;
                        writer.write(line);
                        writer.newLine();
                    }
                    
                }
//                if(exists = false)
//                {
//                    System.out.println("Seller doesnt have enough tickets");
//                    writer.close();
//                    reader.close();
//                    availticketsfile.delete();
//                    boolean success = tempFile.renameTo(availticketsfile);
//                    System.out.println(success);
//                    
//                    
//                }
//                else
               // {
                  
//                    writer.write(line2);
                   
                   
                   
                   
                  
                    writer.write(line2);
                    writer.close();
                    reader.close();
                    
                    availticketsfile.delete();
                    boolean success = tempFile.renameTo(availticketsfile);
                    System.out.println(success);
                   
                  UpdateUserFile(sellername, myname, totalCharge);
                    
           //     }
                
            }
            
          
            
        catch (Exception ex) {
}

//        } finally {
//            try {
//                writer.close();
//            } 
//            catch (Exception e) {
//
//        }
//        }
        
    return "Success";
    }
    
//    public boolean checkAvailableTickets(String sName, int nTickets) throws IOException
//    {
//        BufferedReader reader = null;
//        boolean exists = false;
//        int availableTickets,finalTickets;
//        String line2 = null;
//        File tempFile = new File("tempFile.txt");
//            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
//        try {
//            File availticketsfile = new File("AvailableTiketsFile.txt");
//            reader = new BufferedReader(new FileReader(availticketsfile));
//            String line = null;
//            
//             while ((line = reader.readLine()) != "END")
//             {
//                String[] split = line.split(" ");
//                if((sName.equals(split[1]))&& (nTickets > Integer.parseInt(split[2])))
//                {
//                 exists = true; 
//                  availableTickets = Integer.parseInt(split[2]);
//                  finalTickets = remainingTickets(availableTickets, nTickets);
//                  line2 = split[0] + " " + split[1] + " " + finalTickets + " " + split[3];
//                   writer.write(line);
//                    
//                  
//                }
//                else
//                {
//                    exists = false;
//                    writer.write(line);
//                    writer.newLine();
//                   }
//                
//                 }
//             if(exists = false)
//             {
//                 System.out.println("Seller doesnt have enough tickets");
//                  writer.close();
//            reader.close();
//            availticketsfile.delete();
//            boolean success = tempFile.renameTo(availticketsfile);
//            System.out.println(success);
//               
//
//             }
//             else
//             {
//                 writer.write(line2);
//                 writer.close();
//            reader.close();
//            availticketsfile.delete();
//            boolean success = tempFile.renameTo(availticketsfile);
//            System.out.println(success);
//            UpdateUserFile(, totalCharge, numOfTickets);
//             }
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(BuySellUser.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException ex) {
//                Logger.getLogger(BuySellUser.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//        return exists;
//        
//    }

    public String UpdateUserFile(String sName, String bName, double totalCost) {
        /*
        * 
        * Intention: updates the buyers credit
        *            adds the number of tickets to the buyers inventory
         */
        try {
            File initialFile = new File("CurrentUserFile.txt");
           // File changedfile3 = new File("details.txt");
            BufferedReader reader2 = new BufferedReader(new FileReader(initialFile));

            File tempFile4 = new File("tempFile4.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile4));
            String line, line2 = null, line3 = null;
            double currCredit, finCredit;
            while ((line = reader2.readLine()) != null) {

                String[] split = line.split(" ");
                if (bName.equals(split[0])) {
                    currCredit = Double.parseDouble(split[2]);
                    finCredit = currCredit - totalCost;
                    line2 = split[0] + " " + split[1] + " " + finCredit;

                }
                else if(sName.equals(split[0]))
                {
                 currCredit = Double.parseDouble(split[2]);
                    finCredit = currCredit + totalCost;
                    line3 = split[0] + " " + split[1] + " " + finCredit;   
                }
                else {
                    writer.write(line);
                    writer.newLine();
                }

            }
       
            writer.write(line2);
            writer.newLine();
            writer.write(line3);
            writer.close();
            reader2.close();
            initialFile.delete();
            boolean success = tempFile4.renameTo(initialFile);
            System.out.println(success);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(BuySellUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BuySellUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception e) {

        }

        return "Transaction succesfull";
    }

    public double totalCost(int quantity, double price) {
        /*
        * Intention: Calculate the total cost
         */
        return (quantity * price);
    }

    public int remainingTickets(int initialTickets, int requiredTickets) {
        /*
        * Intention: subtract the number of tickets from the sellers inventory
         */
        return initialTickets - requiredTickets;
    }

    public String sell(String title, double price, int numOfTickets, String sellerName) {

        BufferedReader reader3 = null;
        try {
            //Requirements
            // 1. should ask for the event title (as a text line
            // 2. should ask for a sale price for the tickets in dollars
            // 3. should ask for the number of tickets for sale
            // 4. should save this information to the daily transaction file

            //Constraints
            // 1. Semi-privileged transaction - only accepted when logged in any type of account except standard-buy.
            // 2. the maximum price for a ticket sale is 999.99
            // 3. the maximum length of an event title is 25 characters
            // 4. the maximum number of tickets for sale is 100
            // 5. no further transactions should be accepted on a new tickets for sale until the next session
            // String result = null;
            /*
        * 
        * Intention: adds the number of tickets to the buyers inventory
             */
            File initialFile = new File("AvailableTicketsFile.txt");
        //    File changedfile = new File("details.txt");
            reader3 = new BufferedReader(new FileReader(initialFile));
            File tempFile3 = new File("tempFile2.txt");
            BufferedWriter writer3 = new BufferedWriter(new FileWriter(tempFile3));
            File tempFile4 = new File("tempFile4.txt");
            BufferedWriter writer4 = new BufferedWriter(new FileWriter(tempFile4));
            String line, line2 = null;
            int initialTickets;
            int lastTickets, availableTickets;
            
            while ((line = reader3.readLine()) != null)
                {
                    String[] split = line.split(" ");
                    if((title.equals(split[0]))&& (sellerName.equals(split[1])))
                    {
                    //    exists = true;
                        availableTickets = Integer.parseInt(split[2]);
                        lastTickets = availableTickets + numOfTickets;
                      
                        
                    
                        line2 = split[0] + " " + split[1] + " " + lastTickets + " " + split[3];
                     //   writer.write(line);
                        // writer.write(line2);
                        
                    }
                    else
                    {
                      //  exists = false;
                        writer3.write(line);
                        writer3.newLine();
                    }
                    
                }
            writer3.write(line2);

            writer3.close();
            reader3.close();
            initialFile.delete();
            boolean success = tempFile3.renameTo(initialFile);
            System.out.println(success);

        } catch (Exception e) {

        }

        return "Tickets successfully sold";
    }

    public String addcredit(double amount, double oldcredit, String user, String usertype) {
        double newcredit = oldcredit + amount;

        try {
          
            File inputFile = new File("CurrentUserFile.txt");
            File tempFile = new File("useraccounts.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String current_user = user;
            String line;

            while ((line = reader.readLine()) != null) {
                 
                String line2 = line.trim();
                if (!line2.startsWith(current_user)) {
                    
                    writer.write(line);
                    writer.newLine();
                }

            }
            writer.close();
            reader.close();

            if (!inputFile.delete()) {
                System.out.println("Could not delete file");
            }

            tempFile.renameTo(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("CurrentUserFile.txt", true));
            if (usertype.equals("SS")) {
                writer.write(user + " " + usertype + " " + newcredit);

            } else if (usertype.equals("BS")) {
               writer.write(user + " " + usertype + " " + newcredit);

            } //  Admin or Buysellstd user
            else if (usertype.equals("AA")){
               writer.write(user + " " + usertype + " " + newcredit);
            }
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
        return "Credit successfully added";
    }

}

class BuyUser extends BuySellUser {

    @Override
    public String buy(String title, int numOfTickets, String sellername, String myname) {
        return super.buy(title, numOfTickets, sellername, myname);
    }

    public String addcredit(double amount, double oldcredit, String user, String usertype) {
        String a = super.addcredit(amount, oldcredit, user, usertype);
        return a;
    }
}

class SellUser extends BuySellUser {

    @Override
    public String sell(String title, double price, int numOfTickets, String sellerName) {
        return super.sell(title, price, numOfTickets, sellerName);
    }

    @Override
    public String addcredit(double amount, double oldcredit, String user, String usertype) {
        String a = super.addcredit(amount, oldcredit, user, usertype);
        return a;
    }
}

class Admin extends BuySellUser implements PrivilegedTransactions {

    @Override
    public String buy(String title, int numOfTickets, String sellername, String myname) {
        return super.buy(title, numOfTickets, sellername, myname);
    }

    @Override
    public String sell(String title, double price, int numOfTickets, String sellerName) {
        return super.sell(title, price, numOfTickets, sellerName);
    }

    @Override
    public String addcredit(double amount, double oldcredit, String user, String usertype) {
        String a = super.addcredit(amount, oldcredit, user, usertype);
        return a;
    }

    public String create(String username, String typeUser) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("CurrentUserFile.txt", true));
            writer.newLine();
            if (typeUser.equals("SS")) {
               
                writer.write(username + " " + typeUser +" " + 0.0);

            } else if (typeUser.equals("BS")) {
               
                writer.write(username + " " + typeUser +" " + 0.0);

            } //  Admin or Buysellstd user
            else {
                
                writer.write(username + " " + typeUser +" " + 0.0);
            }
         //   writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
        return "User account successfully created";
    }

    public String delete(String username) {

        try {

            File inputFile = new File("CurrentUserFile.txt");
            File tempFile = new File("useraccounts.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String deleteuser = username;
            String line;

            while ((line = reader.readLine()) != null) {

                String line2 = line.trim();
                if (!line2.startsWith(deleteuser)) {
                    writer.write(line);
                    writer.newLine();
                }

            }
            writer.close();
            reader.close();

            if (!inputFile.delete()) {
                System.out.println("Could not delete file");

            }
            tempFile.renameTo(inputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "User account sucessfully deleted";
    }

    public String refund(String buyername, String sellername, double credit) {
        return "Amount sucessfully transferred from seller to buyer";
    }
}

interface PrivilegedTransactions {

    public String create(String username, String typeUser);

    public String delete(String username);

    public String addcredit(double amount, double oldcredit, String user, String usertype);

    public String refund(String buyername, String sellername, double credit);
}

interface SemiPrivilegedTransactions {

    public String sell(String title, double price, int numOfTickets, String sellerName);

    public String buy(String title, int numOfTickets, String sellername, String myname);

    public String addcredit(double amount, double oldcredit, String user, String usertype);
}

public class event {

    public static void main(String[] args) throws Exception {

        System.out.println("\t\tWelcome to Event ticket seller\n");
        System.out.print("Login: ");
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        boolean exists;

        Scanner file = new Scanner(new FileReader("CurrentUserFile.txt")).useDelimiter("\\s");
        //String name = "";
        String usertype = "";
        double currentcredit = 0;
        int numbertickets = 0;
        double ticketPrice = 0;
        while (file.hasNextLine()) {
            String[] split = file.nextLine().split(" ");
            if (message.equals(split[0])) {
                usertype = split[1];
                currentcredit = Double.parseDouble(split[2]);
            //    currentcredit = Double.parseDouble(split[3]);
              //  ticketPrice = Double.parseDouble(split[4]);

                System.out.println("Type of user: " + usertype);
                System.out.println("Amount of credit: " + currentcredit);
            }
        }

        if (!file.hasNextLine()) {
            System.out.println("User does not exist.");
              // System.exit(0);
        }
        file.close();

        if (usertype.equals("BS")) {
            String function = "";
            while (!"logout".equals(function)) {
                BuyUser buyuser = new BuyUser();
                System.out.println("The following are your privileges: ");
                System.out.println("\t1)Add credit ");
                System.out.println("\t2)Buy ticket(s)");
                System.out.println("\t3)Logout");
                System.out.print("What would you like to do? ");
                Scanner scan2 = new Scanner(System.in);
                function = scan2.nextLine();
                switch (function) {
                    case "Add credit":
                        System.out.print("How much would you like to add to your account?");
                        Scanner scan3 = new Scanner(System.in);
                        double addmoney = scan3.nextDouble();
                        if(addmoney<=1000 && addmoney > 0)
                        {
                         
                            System.out.println("" + buyuser.addcredit(addmoney, currentcredit, message, usertype));
                        }
                        else
                        {
                            System.out.println("Invalid Amount");
                        }
                        
                        break;
                    case "Buy tickets":
                       System.out.print("Enter the event title name: ");
                            Scanner event_title = new Scanner(System.in);
                            String eventtitle = event_title.nextLine();
                            if(eventtitle.trim().isEmpty())
                            {
                                 System.out.println("Missing Input");
                                 System.exit(0);
                            }
                            else
                            {
                                System.out.print("Enter the number of tickets you want to purchase: ");
                            Scanner numOfTickets = new Scanner(System.in);
                            int tickets = numOfTickets.nextInt();
                            if((tickets < 5)&&(tickets >0))
                            {
                                 System.out.print("Which seller would you like to purchase from? ");
                            Scanner seller_name = new Scanner (System.in);
                            String sellername = seller_name.nextLine();
                            System.out.print("Enter your username ");
                            Scanner my_name = new Scanner (System.in);
                            String myname = my_name.nextLine();
                            System.out.println("" + buyuser.buy(eventtitle, tickets, sellername, myname));
                            }
                            else{
                                System.out.println("Number of tickets out of range");
                                System.exit(0);
                            }
                            
                         }
                        break;
                    case "Create":
                    case "Delete":
                    case "Refund":
                    case "Sell tickets":
                        System.out.println("You do not have the necessary privilege(s).");
                        break;
                    case "logout":
                        System.exit(0);
                    default:
                        break;
                }
            }

        } else if (usertype.equals("SS")) {
            while (true) {
                SellUser selluser = new SellUser();
                System.out.println("The following are your privileges: ");
                System.out.println("\t1)Add credit");
                System.out.println("\t2)Sell ticket(s)");
                System.out.println("\t3)Logout");
                System.out.print("What would you like to do? ");
                Scanner scan2 = new Scanner(System.in);
                String function = scan2.nextLine();
                if (function.equals("Add credit")) {
                    System.out.print("How much would you like to add to your account? ");
                    Scanner scan3 = new Scanner(System.in);
                    double addmoney = scan3.nextDouble();
                    if(addmoney<=1000 && addmoney > 0)
                        {
                         
                            System.out.println("" + selluser.addcredit(addmoney, currentcredit, message, usertype));
                        }
                        else
                        {
                            System.out.println("Invalid Amount");
                        }
                  //  System.out.println("" + selluser.addcredit(addmoney, currentcredit, message, usertype, numbertickets, ticketPrice));
                } else if (function.equals("Sell tickets")) {
                    System.out.print("Enter the event title name: ");
                    Scanner event_title = new Scanner(System.in);
                    String eventtitle = event_title.nextLine();
                    if(eventtitle.trim().isEmpty())
                            {
                                 System.out.println("Missing Input");
                                 System.exit(0);
                            }
                    System.out.print("Enter the price for a ticket sale: ");
                    Scanner price = new Scanner(System.in);
                    double ticketprice = price.nextDouble();
                    if (ticketprice < 999.99) {
                        System.out.print("How many tickets would you like to sell? ");
                        Scanner tickets = new Scanner(System.in);
                        int numOfTickets = tickets.nextInt();

                        if (numOfTickets < 100) {
                            System.out.println("Enter your Name");
                            Scanner seller_name = new Scanner(System.in);
                            String sellerName = seller_name.nextLine();

                            System.out.println("" + selluser.sell(eventtitle, ticketprice, numOfTickets, sellerName));
                        } else {
                            System.out.println("Invalid ticket amount entered");
                        }

                    } else {
                        System.out.println("Invalid amount");
                        System.exit(0);
                    }

                } else if ((function.equals("Create") || function.equals("Delete") || function.equals("Refund"))|| function.equals("Buy tickets")) {
                    System.out.println("You do not have the necessary privilege(s).");
                } else if (function.equals("logout")) {
                    System.exit(0);
                }
            }
        } //BUY SELL STANDARD FUNCTIONALITY
        else if (usertype.equals("FS")) {
            while (true) {
                BuySellUser buyselluser = new BuySellUser();
                System.out.println("The following are your privileges: ");
                System.out.println("\t1)Add credit");
                System.out.println("\t2)Buy ticket(s)");
                System.out.println("\t3)Sell ticket(s)");
                System.out.println("\t4)Logout");
                System.out.print("What would you like to do? ");
                Scanner scan2 = new Scanner(System.in);
                String function = scan2.nextLine();
                if (function.equals("Add credit")) {
                    System.out.print("How much would you like to add to your account?");
                    Scanner scan3 = new Scanner(System.in);
                    double addmoney = scan3.nextDouble();
                    if(addmoney<=1000 && addmoney > 0)
                        {
                         
                            System.out.println("" + buyselluser.addcredit(addmoney, currentcredit, message, usertype));
                        }
                        else
                        {
                            System.out.println("Invalid Amount");
                        }
                } //BUY TICKETS for BUYSELLSTD
                else if (function.equals("Buy tickets")) {
                    System.out.print("Enter the event title name: ");
                    Scanner event_title = new Scanner(System.in);
                    String eventtitle = event_title.nextLine();
                    System.out.print("Enter the number of tickets you want to purchase: ");
                    Scanner numOfTickets = new Scanner(System.in);
                    int tickets = numOfTickets.nextInt();
                    System.out.print("Which seller would you like to purchase from? ");
                    Scanner seller_name = new Scanner(System.in);
                    String sellername = seller_name.nextLine();
                    System.out.print("Enter your username ");
                    Scanner my_name = new Scanner(System.in);
                    String myname = my_name.nextLine();
                    System.out.println("" + buyselluser.buy(eventtitle, tickets, sellername, myname));
                } //SELL TICKETS for BUYSELLSTD
                else if (function.equals("Sell tickets")) {
                    System.out.print("Enter the event title name: ");
                    Scanner event_title = new Scanner(System.in);
                    String eventtitle = event_title.nextLine();
                    System.out.print("Enter the price for a ticket sale: ");
                    Scanner price = new Scanner(System.in);
                    double ticketprice = price.nextDouble();
                    System.out.print("How many tickets would you like to sell? ");
                    Scanner tickets = new Scanner(System.in);
                    int numOfTickets = tickets.nextInt();
                    Scanner seller_name = new Scanner(System.in);
                    String sellerName = seller_name.nextLine();
                    System.out.println("" + buyselluser.sell(eventtitle, ticketprice, numOfTickets, sellerName));
                } else if ((function.equals("Create") || function.equals("Delete") || function.equals("Refund"))) {
                    System.out.println("You do not have the necessary privilege(s).");
                } else if (function.equals("logout")) {
                    System.exit(0);
                }
            }

        } //ADMIN
        else if (usertype.equals("AA")) {
            while (true) {
                Admin adminuser = new Admin();
                System.out.println("The following are your privileges: ");
                System.out.println("\t1)Create a user");
                System.out.println("\t2)Delete a user");
                System.out.println("\t3)Sell ticket(s)");
                System.out.println("\t4)Buy ticket(s)");
                System.out.println("\t5)Refund credit");
                System.out.println("\t6)Add credit");
                System.out.println("\t7)Logout");
                System.out.print("What would you like to do? ");
                Scanner scan2 = new Scanner(System.in);
                String function = scan2.nextLine();

                if (function.equals("Create")) {
                    System.out.print("Create a username for the user account: ");
                    Scanner user_name = new Scanner(System.in);
                    String username = user_name.nextLine();
                    System.out.print("Type of user: ");
                    Scanner type_user = new Scanner(System.in);
                    String typeOfUser = type_user.nextLine();
                    System.out.println(adminuser.create(username, typeOfUser));
                } else if (function.equals("Delete")) {
                    System.out.print("Which user account would you like to delete? ");
                    Scanner user_name = new Scanner(System.in);
                    String username = user_name.nextLine();
                    System.out.println(adminuser.delete(username));
                }
                if (function.equals("Add credit")) {
                    System.out.print("Which user you would want to add credit to?");
                    Scanner scan1 = new Scanner(System.in);
                    String usernam = scan1.nextLine();

                    System.out.print("How much would you like to add?");
                    Scanner scan3 = new Scanner(System.in);
                    double addmoney = scan3.nextDouble();
                    if(addmoney<=1000 && addmoney > 0 && message != usernam)
                        {
                         
                            System.out.println("" + adminuser.addcredit(addmoney, currentcredit, usernam, usertype));
                        }
                    else if (addmoney <= 1000 && addmoney > 0 && message == usernam)
                    {
                         
                            System.out.println("" + adminuser.addcredit(addmoney, currentcredit, message, usertype));

                        
                    }
                        else
                        {
                            System.out.println("Invalid Amount");
                        }
                    Scanner file1 = new Scanner(new FileReader("CurrentUserFile.txt")).useDelimiter("\\s");
                    String usertype1 = "";
                    double currentcredit1 = 0;
                    int numbertickets1 = 0;
                    

                    while (file1.hasNextLine()) {
                        String[] split = file1.nextLine().split(" ");
                        if (usernam.equals(split[0])) {
                            usertype1 = split[1];
                            numbertickets1 = Integer.parseInt(split[2]);
                            
                        }
                    }
                    if (addmoney <= 1000.00) {
                        System.out.println("" + adminuser.addcredit(addmoney, currentcredit1, usernam, usertype1));
                    } else {
                        System.out.println("Only a maximum of 1000.00 is allowed per session.");
                    }
                } else if (function.equals("Buy tickets")) {
                    System.out.print("Enter the event title name: ");
                    Scanner event_title = new Scanner(System.in);
                    String eventtitle = event_title.nextLine();
                    System.out.print("Enter the number of tickets you want to purchase: ");
                    Scanner numOfTickets = new Scanner(System.in);
                    int tickets = numOfTickets.nextInt();
                    System.out.print("Which seller would you like to purchase from? ");
                    Scanner seller_name = new Scanner(System.in);
                    String sellername = seller_name.nextLine();
                    System.out.print("Enter your username ");
                    Scanner my_name = new Scanner(System.in);
                    String myname = my_name.nextLine();
                    System.out.println("" + adminuser.buy(eventtitle, tickets, sellername, myname));
                } else if (function.equals("Sell tickets")) {
                    System.out.print("Enter the event title name: ");
                    Scanner event_title = new Scanner(System.in);
                    String eventtitle = event_title.nextLine();
                    System.out.print("Enter the price for a ticket sale: ");
                    Scanner price = new Scanner(System.in);
                    double ticketprice = price.nextDouble();
                    System.out.print("How many tickets would you like to sell? ");
                    Scanner tickets = new Scanner(System.in);
                    int numOfTickets = tickets.nextInt();
                    Scanner seller_name = new Scanner(System.in);
                    String sellerName = seller_name.nextLine();
                    System.out.println("" + adminuser.sell(eventtitle, ticketprice, numOfTickets, sellerName));
                } else if (function.equals("logout")) {
                    System.exit(0);
                }
            }
        }
    }
}
