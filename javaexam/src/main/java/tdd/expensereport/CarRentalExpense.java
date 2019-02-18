package tdd.expensereport;

public class CarRentalExpense extends Expense {
  public CarRentalExpense(int amount) {
    super(amount);
  }

  @Override
  boolean isOverage() {
    return false;
  }

  String getName() {
    return "Car Rental";
  }

  @Override
  boolean isMeal() {
    return false;
  }
}
