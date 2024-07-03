class Rectangle {
    protected double largeur;
    protected double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return "Rectangle :\nlargeur = " + largeur + " hauteur = " + hauteur;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.largeur, largeur) == 0 &&
               Double.compare(rectangle.hauteur, hauteur) == 0;
    }
}

class RectangleColore extends Rectangle {
    private String couleur;

    public RectangleColore(double largeur, double hauteur, String couleur) {
        super(largeur, hauteur);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncouleur = " + couleur;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        RectangleColore that = (RectangleColore) obj;
        return couleur != null ? couleur.equals(that.couleur) : that.couleur == null;
    }
}

public class ToStringEq {
    public static void main(String[] args) {
        System.out.println("Test 1 :");
        Rectangle rect = new Rectangle(12.5, 4.0);
        System.out.println(rect);
        System.out.println();

        System.out.println("Test 2 :");
        RectangleColore rectl = new RectangleColore(12.5, 4.0, "rouge");
        System.out.println(rectl);
        System.out.println();

        System.out.println("Test 3 :");
        Rectangle rect2 = new RectangleColore(25.0 / 2, 8.0 / 2, new String("rouge"));
        System.out.println(rect2);

        System.out.println(rectl.equals(rect2)); // 1
        System.out.println(rect2.equals(rectl)); // 2
        System.out.println(rect.equals(null)); // 3
        System.out.println(rect.equals(rectl)); // 4
        System.out.println(rectl.equals(rect)); // 5
    }
}
