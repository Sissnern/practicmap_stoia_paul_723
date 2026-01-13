package org.example;

import org.example.controller.*;
import org.example.model.*;
import org.example.repository.*;
import org.example.service.*;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        while (true) {
            System.out.println("\n==============================");
            System.out.println("   MENIU PRINCIPAL EXAMEN");
            System.out.println("==============================");
            System.out.println("1. Task 1: read  ");
            System.out.println("2. Task 2: Filter by team and status (CRUD)");
            System.out.println("0. Ieșire");
            System.out.print("Alege Task: ");

            int taskChoice = scanner.nextInt();
            scanner.nextLine();

            if (taskChoice == 0) break;

            if (taskChoice == 1) {
                runTask1(companyController, scanner);
            } else if (taskChoice == 2) {
                runTask2(orderController, scanner);
            } else {
                System.out.println("Opțiune invalidă!");
            }
        }
    }



private static voi runTask1()

    // merge service & controller