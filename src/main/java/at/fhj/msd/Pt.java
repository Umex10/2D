package at.fhj.msd;

public class Pt {

    private double x;
    private double y;

    public Pt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(Pt pt) {

        double result = Math.sqrt(Math.pow((pt.x - this.x), 2) + Math.pow((pt.y - this.y), 2));

        return result;
    
    }
    
}
