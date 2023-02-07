public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    @Override
    public abstract String getDescription();
    public double Cost() {
        return 0;
    }
}

