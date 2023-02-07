public abstract class Beverage {
    public enum Size { SMALL,MEDIUM,LARGE }
    Size size = Size.SMALL;
    String description = "Unknown Beverage";
    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size s) {
        size = s;
    }

    public abstract double cost();
}
