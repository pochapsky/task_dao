package ru.netology.daolayer.model;

import lombok.Data;

@Data
public class Customers {
    private String name;
    private String surname;
    private int age;
    private String phone_number;
}