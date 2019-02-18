package tdd.expensereport;

import java.util.ArrayList;
import java.util.List;

public class ExpenseReport {
  List<Expense> expenses = new ArrayList<Expense>();
  int mealExpenses = 0;
  int total = 0;

  public ExpenseReport() {
  }

  void totalsUpExpenses() {
    for (Expense expense : expenses)
      totalUpExpense(expense);
  }

  void totalUpExpense(Expense expense) {
    if (expense.isMeal())
      mealExpenses += expense.amount;

    total += expense.amount;
  }

  public void addExpense(Expense expense) {
    expenses.add(expense);
  }
}