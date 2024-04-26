package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
// 1.
        Employee worker1 = new Employee("Иванов Иван Иванович", "директор", "1@mail.ru",
                "79000000000", 200000, 40);
        worker1.printInfoEmployee();
        System.out.println();

// 2.
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Петров Петр Петрович", "инженер", "2@mail.ru",
                "79000000001", 40000, 25);
        employeesArray[1] = new Employee("Карпов Карп Карпович", "инженер", "3@mail.ru",
                "79000000002", 40000, 30);
        employeesArray[2] = new Employee("Иванов Виктор Викторович", "главный инженер",
                "4@mail.ru","79000000003", 70000, 31);
        employeesArray[3] = new Employee("Дмитриева Нина Петровна", "бухгалтер", "5@mail.ru",
                "79000000004", 30000, 33);
        employeesArray[4] = new Employee("Орехова Дария Олеговна", "инженер", "6@mail.ru",
                "79000000005", 50000, 25);

        for (int i = 0; i < employeesArray.length; i++) {
            employeesArray[i].printInfoEmployee();
            System.out.println();
        }

// 3.
        Park parkGorkogo = new Park("Парк Горького", "8:00 - 18:00");
        Park.Attraction attr1ParkGorkogo = parkGorkogo.new Attraction("Колесо обзора", 150,
                "8:00 - 17:00");
        Park.Attraction attr2ParkGorkogo = parkGorkogo.new Attraction("Ракета", 200,
                "10:00 - 18:00");

    }
}

