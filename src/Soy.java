public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        System.out.println(this.size + "soy cost() method");
        double cost = beverage.cost();
        if (beverage.getSize() == Size.SMALL) {
            cost += .50;
        } else if (beverage.getSize() == Size.MEDIUM) {
            cost += .75;
        } else {
            cost += 1.00;
        }
        return cost;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
