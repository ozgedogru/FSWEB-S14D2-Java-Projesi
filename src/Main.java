public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(Ceiling.PaintColor.WHITE, 300);
        Bed bed = new Bed("Modern", 2, 100, 1, 1);
        Lamp lamp = new Lamp(Lamp.LampType.TABLE_LAMP, true, 5);
        Wardrobe wardrobe = new Wardrobe(150, 200, 50.5);
        Carpet carpet = new Carpet(200, 300, Carpet.PaintColor.RED);
        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        System.out.println("Bedroom Name: " + bedroom.getName());
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());
        System.out.println("Bed Style: " + bedroom.getBed().getSheets());

    }
}