package de.telran.application;

import de.telran.dao.Bank;
import de.telran.data.BankAccount;
import de.telran.data.Person;
import de.telran.data.Sex;


public class BankApp {

    public static void main(String[] args) {

        Person client1 = new Person("Markus", "Muller", 19754, "Berlin", Sex.MALE);
        Person client2 = new Person("Verona", "Blansh", 1980, "Milan", Sex.FEMALE);
        Person client3 = new Person("Marsia", "Luter", 1988, "Rio de Janeiro", Sex.MALE);
        Person client4 = new Person("Milana", "Blanco", 1983, "Barcelona", Sex.FEMALE);
        Person client5 = new Person("Beatrice", "Lozano", 1972, "Moscow", Sex.FEMALE);
        Person client6 = new Person("Ricardo", "Reis", 1978, "Singapur", Sex.MALE);
        Person client7 = new Person("Alicia", "Vikander", 1988, "Stockholm", Sex.FEMALE);


        BankAccount account1 = new BankAccount(client1, 4000);
        BankAccount account2 = new BankAccount(client2, 1000);
        BankAccount account3 = new BankAccount(client3, 800);
        BankAccount account4 = new BankAccount(client4, 10000);
        BankAccount account5 = new BankAccount(client5, 4000);
        BankAccount account6 = new BankAccount(client6, 55000);
        BankAccount account7 = new BankAccount(client7, 65000);


        Bank myBank = new Bank(100);

        myBank.addAccount(account1);
        myBank.addAccount(account2);
        myBank.addAccount(account3);
        myBank.addAccount(account4);
        myBank.addAccount(account5);
        myBank.addAccount(account6);
        myBank.addAccount(account7);

        myBank.displayAccounts();

        myBank.transferMoney(10100001, 10100002, 800);

        myBank.transferMoney(10100002, 10100001, 1000);

        myBank.getCountClientsPerSex();
        myBank.displayClientsPerSex(Sex.FEMALE);
        myBank.displayClientsPerSex(Sex.MALE);
        myBank.getClientsPerSex();

    }

}
