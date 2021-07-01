package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    public IsoscelesTrapezoid(String name, int a, int b, int h, String color) {
        super(name, color);
        setArea((a + b) / 2 * h);
    }

    @Override
    public String toString() {
        return "Figure: " + this.getName()
                + ", area: " + this.getArea() + " sq.units, "
                + "color: " + this.getColor();
    }
}