package at.fhj.msd;

public class Pt {

    private double x;
    private double y;

    public Pt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Pt() {
        this(0,0);
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(Pt pt) {

        double result = Math.sqrt(Math.pow(pt.getX() - this.getX(), 2) + Math.pow(pt.getY() - this.getY(), 2));

        return result;

    }

    public double distanceFromZero() {

        return this.distance(new Pt());
    }

}
