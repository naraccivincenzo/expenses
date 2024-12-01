package org.lessons.booleaners.expenses.repo;

import org.lessons.booleaners.expenses.model.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesRepository extends JpaRepository<Expenses, Integer> {
}
