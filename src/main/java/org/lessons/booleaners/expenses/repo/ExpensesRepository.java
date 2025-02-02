package org.lessons.booleaners.expenses.repo;

import org.lessons.booleaners.expenses.model.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExpensesRepository extends JpaRepository<Expenses, Integer> {
    @Query("SELECT e.category, SUM(e.amount) FROM Expenses e GROUP BY e.category")
    List<Object[]> getExpenseSummaryByCategory();
}
