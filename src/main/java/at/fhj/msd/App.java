package at.fhj.msd;

public class App {
    public static void main(String[] args) {
        
        var p1 = new Pt(1.0, 3.0);
        var p2 = new Pt(0.0, 0.0);
        var p3 = new Pt(1.2, 2.8);
    
        System.out.printf("distance p1 --> p2: %.2f\n", p1.distance(p2));
        System.out.printf("distance p1->p3: %.2f\n", p1.distance(p3));
        System.out.printf("distance p2->p3: %.2f\n", p2.distance(p3));
    
    }
}
