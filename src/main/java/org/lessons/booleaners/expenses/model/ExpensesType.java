package org.lessons.booleaners.expenses.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "expensestype")
public class ExpensesType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String description;

    @NotBlank
    private boolean type;

    //Getter and Setter
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public boolean isType() {return type;}
    public void setType(boolean type) {this.type = type;}
}
