import javafx.scene.paint.Color;

/**
 * Created by Arnaud Labourel on 04/10/2018.
 * Interface correspondant à une couleur de gris.
 */
public interface GrayColor extends Comparable<GrayColor> {
    int getGrayLevel();
    void setGrayLevel(int grayLevel);
    Color getColor();
    int getMaximumGrayLevel();
}
