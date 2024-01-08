package ru.netology.daolayer.model;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;

@Data
public class Orders {
    private LocalDate date;
    private int customer_id;
    private String product_name;
    private int amount;
}
