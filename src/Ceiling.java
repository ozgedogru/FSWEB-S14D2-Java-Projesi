public class Ceiling {
    public enum PaintColor {
        WHITE, BEIGE, CHAMPAGNE,
    }
    private int height;
    private PaintColor paintedColor;
    public Ceiling(PaintColor color, int height) {
        this.paintedColor = color;
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public PaintColor getPaintedColor() {
        return paintedColor;
    }
    public void create() {
        System.out.println("Yukseklik: " + height + " Renk: " + paintedColor);
    }
}
