public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("small lake", 3, 3, false);
        b.printState();
        System.out.println(b.name());
        b.setName("small lake1");
        System.out.println(b.name());
        BodyOfWater b1 = new BodyOfWater("small lake2", -3, -3, true);
        b1.printState();
        System.out.println(b1.name());
        b1.setName("small lake3");
        System.out.println(b1.name());
    }
}
