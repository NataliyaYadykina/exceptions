package seminars.sem2.ex03;

public class DivisionByZeroException extends Exception {

    private double dividend;
    private double divisor;

    public DivisionByZeroException(String message, double dividend, double divisor) {
        super(message);
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public double getDividend() {
        return dividend;
    }

    public double getDivisor() {
        return divisor;
    }

    public String getErrorDetails() {
        return "Dividend: " + dividend + ", Divisor: " + divisor;
    }

}
