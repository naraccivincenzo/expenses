package org.lessons.booleaners.expenses.service;

import org.lessons.booleaners.expenses.model.Expenses;
import org.lessons.booleaners.expenses.repo.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Map<String, Double> getExpenseSummaryByCategory() {
        List<Object[]> results = expensesRepository.getExpenseSummaryByCategory();
        Map<String, Double> summary = new HashMap<>();

        for (Object[] result : results) {
            String category = (String) result[0]; // Categoria
            Double total = (Double) result[1];   // Totale per categoria
            summary.put(category, total);
        }

        return summary;
    }
}
