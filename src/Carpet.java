public class Carpet {
    public enum PaintColor {
        RED, GREY, BLACK,
    }
    private int width;
    private int height;
    private PaintColor color;
    public Carpet(int width, int height, PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public void lying() {
        System.out.println("Carper is lying on bedroom floor.");
    }
}
