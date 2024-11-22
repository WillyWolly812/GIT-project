package org.example;
import org.example.klassen.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Anzahl: ");
        int anzahl = scanner2.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Table: ");
        String table = scanner.nextLine();
        DatabaseConnection dC = new DatabaseConnection(table);
    }
}