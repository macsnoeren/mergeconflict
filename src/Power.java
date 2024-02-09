public class Power implements CalculationInterface {
    @Override
    public int calculate(int a, int b) {
        return(int) Math.pow(a, b);
    }

    @Override
    public String symbol() {
        return "^";
    }
}
