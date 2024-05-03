package main.java;

import java.math.BigDecimal;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String numberPhone;
    private BigDecimal salary;
    private int age;

    public Employee(String fullName, String position, String email, String numberPhone, BigDecimal salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfoEmployee() {
        String descriptionAge = " лет";
        if ((age % 10 == 1) && (age % 100 != 11)) {
            descriptionAge = " год";
        }
        if ((age % 10 > 1) && (age % 10 < 5) && !((age % 100 > 11) && (age % 100 < 15))) {
            descriptionAge = " года";
        }

        System.out.println("ФИО: " + fullName);
        System.out.println("должность: " + position);
        System.out.println("возраст: " + age + descriptionAge);
        System.out.println("электронная почта: " + email);
        System.out.println("номер телефона: " + numberPhone);
        System.out.println("зарплата: " + salary + " руб.");
    }

}
