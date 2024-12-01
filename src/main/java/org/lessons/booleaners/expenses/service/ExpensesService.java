package org.lessons.booleaners.expenses.service;

import org.lessons.booleaners.expenses.model.Expenses;
import org.lessons.booleaners.expenses.repo.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpensesService {

    @Autowired
    private ExpensesRepository expensesRepository;

    //Find all the expenses
    public List<Expenses> getAllExpenses() {
        return expensesRepository.findAll();
    }

    //Create a new expense
    public Expenses createExpenses(Expenses expenses) {
        return expensesRepository.save(expenses);
    }

    //Update the existing selected expense
    public Expenses updateExpenses(Expenses expenses) {
        return expensesRepository.save(expenses);
    }

    //Delete the existing selected expense
    public void deleteExpenses(Expenses expenses) {
        expensesRepository.delete(expenses);
    }

    //Delete all the expenses
    public void deleteAllExpenses() {
        expensesRepository.deleteAll();
    }

    //Delete the expense with the selected id
    public void deleteById(int id) {
        expensesRepository.deleteById(id);
    }
}
