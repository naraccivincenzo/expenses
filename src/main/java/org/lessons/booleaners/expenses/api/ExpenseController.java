package org.lessons.booleaners.expenses.api;

import org.lessons.booleaners.expenses.service.ExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpensesService expenseService;

    @GetMapping("/summary")
    public ResponseEntity<Map<String, Double>> getExpenseSummary() {
        Map<String, Double> summary = expenseService.getExpenseSummaryByCategory();
        return ResponseEntity.ok(summary);
    }
}