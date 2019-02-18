package tdd.expensereport;

public abstract class Expense {
  abstract boolean isOverage();

  abstract String getName();

  abstract boolean isMeal();


  public int amount;

  public Expense(int amount) {
    this.amount = amount;
  }
}
