package tdd.expensereport;

public class DinnerExpense extends Expense {
  public DinnerExpense(int amount) {
    super(amount);
  }

  @Override
  boolean isOverage() {
    return  amount > 5000;
  }

  String getName() {
    return "Dinner";
  }

  @Override
  boolean isMeal() {
    return true;
  }
}
