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
    private String description;

    @NotBlank
    private int amount;

    //Getter and Setter
    public int getId() {return id;}
    public void setId(int id) {}
    public LocalDate getExpenseDate() {return expenseDate;}
    public void setExpenseDate(LocalDate expenseDate) {}
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public int getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }

}
