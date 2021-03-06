package enumerations2;

public enum Planet {
    MERCURY(0.0553, 57.9),
    VENUS(0.815, 108.2),
    EARTH(1, 149.6),
    MARS(0.107, 227.9),
    JUPITER(317.83, 778.5),
    SATURN(95.162, 1434000),
    URANUS(14.536, 2871000),
    NEPTUNE(17.147, 4495000);


    private double mass;
    private double distance;

    private Planet(double mass, double distance){
        this.mass = mass;
        this.distance = distance;
    }

    //METHOD_OVERRIDE_FROM_OBJECT
    public String toString() {
        return "Planet mass: " + mass + ", distance: " + distance ;
    }
}