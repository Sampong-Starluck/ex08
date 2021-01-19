public class segment {
    point p1, p2;

    public segment() {
        
    }

    public segment(point p1, point p2) {
        this .p1 = p1;
        this.p2 = p2;
    }

    public double length(point p1, point p2) {
        return p1.distance(p2);
    }

}
