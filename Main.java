import java.util.*;

/**
 * Main Class.
 * Creates array with objects and sorts it by their fields
 *
 * @author Myroslava
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        Furniture[] piecesOfFurniture = new Furniture[]{
                new Furniture("modern", "bed", 47, 58, Material.Wood),
                new Furniture("antique", "table", 70, 80, Material.Wood),
                new Furniture("sliding", "window", 180, 90, Material.Plastic),
                new Furniture("hinged", "wardrobe", 176, 79, Material.Wood),
                new Furniture("wall", "shelf", 190, 30, Material.Plastic)
        };

        System.out.println(Arrays.toString(piecesOfFurniture));
        Arrays.sort(piecesOfFurniture, Collections.reverseOrder(Comparator.comparing(Furniture -> Furniture.getHeight())));
        System.out.println(Arrays.toString(piecesOfFurniture));
        Arrays.sort(piecesOfFurniture, Comparator.comparing(Furniture -> Furniture.getMade()));
        System.out.println(Arrays.toString(piecesOfFurniture));
    }
}