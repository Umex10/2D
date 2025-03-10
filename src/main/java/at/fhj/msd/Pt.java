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

    public double distance(Pt Pt) {

        double distanceX = Pt.x - this.x;
        double distanceY = Pt.y - this.y;

        return 0.0;
    
    }
    
}
