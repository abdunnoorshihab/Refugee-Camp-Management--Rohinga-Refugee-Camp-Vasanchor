
package mainpakage;

/**
 *
 * @author USER
 */
public class Loan {
    private String TypesOfLoan;
    private int amount;

    @Override
    public String toString() {
        return "Loan{" + "TypesOfLoan=" + TypesOfLoan + ", amount=" + amount + '}';
    }

    public String getTypesOfLoan() {
        return TypesOfLoan;
    }

    public void setTypesOfLoan(String TypesOfLoan) {
        this.TypesOfLoan = TypesOfLoan;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
}
