public class BodyOfWater {
    private String name;
    private int widestDiameter;
    private int avgDepth;
    private boolean isSalt;

    public BodyOfWater(String n, int d, int a, boolean s) {
        name = n;
        widestDiameter = d;
        avgDepth = a;
        isSalt = s;
    }
    public BodyOfWater(String n, int a) {
        name = n;
        avgDepth = a;
    }
    public void printState() {
        System.out.println("name: "+ name);
        System.out.println("Widest Diameter: "+ widestDiameter);
        System.out.println("Average Depth: "+ avgDepth);
        System.out.println("Salty: "+ isSalt);
    }
    public String name() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

}
