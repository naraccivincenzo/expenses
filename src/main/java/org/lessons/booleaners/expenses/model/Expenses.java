package org.lessons.booleaners.expenses.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

@Entity
@Table(name = "expenses")
public class Expenses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private LocalDate expenseDate;

    @NotBlank
    private String category;

    @NotBlank
    private double amount;

    //Getter and Setter
    public int getId() {return id;}
    public void setId(int id) {}
    public LocalDate getExpenseDate() {return expenseDate;}
    public void setExpenseDate(LocalDate expenseDate) {}
    public String getCategory() { return category; }
    public void setCategory(String description) { this.category = category; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

}
