package tdd.expensereport;

public class BreakfastExpense extends Expense {
  public BreakfastExpense(int amount) {
    super(amount);
  }

  @Override
  boolean isOverage() {
    return amount > 1000;
  }

  String getName() {
    return "Breakfast";
  }

  @Override
  boolean isMeal() {
    return true;
  }
}
