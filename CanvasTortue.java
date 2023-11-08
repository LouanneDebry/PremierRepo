import java.awt.*;
import java.awt.geom.*;

/**
 * Fonctions graphiques pour la tortur Logo
 * Ensemble de fonctions permettant d'afficher une tortue dans les 4 directions
 * et de tracer des traits horizontaux et verticaux. Adaptée à la tortue LOGO
 * dans un espace de 12x12 cases (0,0 au milieu)
 * 
 * @author Patrick Girard 
 * @version August 2012
 */
public class CanvasTortue
{
    static private int n = 0;
    static private int lo = 40;
    static private int la = 30;
    static private int plo = 8;
    static private int pla = 5;
    static private int tlo = 16;
    static private int tla = 9;
    static private int qla = 3;
    static private int milieu = 240;
    static private String couleurTete = "red";
    static private String couleurCorps = "green";
    static private String couleurPattes = "blue";
    static private String corps = "Corps";
    static private String patteAG = "Patte Avant Gauche";
    static private String patteAD = "Patte Avant Droite";
    static private String patteRG = "Patte Arriere Gauche";
    static private String patteRD = "Patte Arriere Droite";
    static private String tete = "Tete";
    static private String queue = "Queue";
    
    static private int timeout = 500;
    
    /**
     * Dessine une tortue orientée vers le nord
     *
     * @param  x,y  position de la tortue
     */
    public static void tortueNord(int x, int y)
    {
        int xp = x*50 + milieu + 5;
        int yp = y*50 + milieu;
        Canvas canvas = Canvas.getCanvas(); 
        canvas.draw(patteAG, couleurPattes, new Ellipse2D.Double(xp, yp+15, 
                                     plo, pla));
        canvas.draw(patteAD, couleurPattes, new Ellipse2D.Double(xp+la+2, yp+15, 
                                     plo, pla));
        canvas.draw(patteRG, couleurPattes, new Ellipse2D.Double(xp+2, yp+35, 
                                     plo, pla));
        canvas.draw(patteRD, couleurPattes, new Ellipse2D.Double(xp+la+1, yp+35, 
                                     plo, pla));
        canvas.draw(tete, couleurTete, new Ellipse2D.Double(xp+15, yp-5, 
                                     tla, tlo));
        canvas.draw(queue, couleurPattes, new Ellipse2D.Double(xp+19, yp+lo, 
                                     qla, tlo));
        canvas.draw(corps, couleurCorps, new Ellipse2D.Double(xp+5, yp+5, 
                                     la, lo));
        canvas.wait(timeout);                                 
    }
    /**
     * Dessine une tortue orientée vers le sud
     *
     * @param  x,y  position de la tortue
     */
    public static void tortueSud(int x, int y)
    {
        int xp = x*50 + milieu + 5;
        int yp = y*50 + milieu;
        Canvas canvas = Canvas.getCanvas(); 
        canvas.draw(patteAG, couleurPattes, new Ellipse2D.Double(xp, yp+15, 
                                     plo, pla));
        canvas.draw(patteAD, couleurPattes, new Ellipse2D.Double(xp+la+2, yp+15, 
                                     plo, pla));
        canvas.draw(patteRG, couleurPattes, new Ellipse2D.Double(xp+2, yp+35, 
                                     plo, pla));
        canvas.draw(patteRD, couleurPattes, new Ellipse2D.Double(xp+la+1, yp+35, 
                                     plo, pla));
        canvas.draw(tete, couleurTete, new Ellipse2D.Double(xp+15, yp+lo, 
                                     tla, tlo));
        canvas.draw(queue, couleurPattes, new Ellipse2D.Double(xp+19, yp-6, 
                                     qla, tlo));
        canvas.draw(corps, couleurCorps, new Ellipse2D.Double(xp+5, yp+5, 
                                     la, lo));
        canvas.wait(timeout);                                 
    }
    
    /**
     * Dessine une tortue orientée vers l'est
     *
     * @param  x,y  position de la tortue
     */
    public static void tortueEst(int x, int y)
    {
        int xp = x*50 + milieu;
        int yp = y*50 + milieu + 5;
        Canvas canvas = Canvas.getCanvas(); 
        canvas.draw(patteAG, couleurPattes, new Ellipse2D.Double(xp+10, yp+3, 
                                     pla, plo));
        canvas.draw(patteAD, couleurPattes, new Ellipse2D.Double(xp+10, yp+la, 
                                     pla, plo));
        canvas.draw(patteRG, couleurPattes, new Ellipse2D.Double(xp+30, yp+1, 
                                     pla, plo));
        canvas.draw(patteRD, couleurPattes, new Ellipse2D.Double(xp+30, yp+la+2, 
                                     pla, plo));
        canvas.draw(tete, couleurTete, new Ellipse2D.Double(xp+lo, yp+15, 
                                     tlo, tla));
        canvas.draw(queue, couleurPattes, new Ellipse2D.Double(xp-6, yp+19, 
                                     tlo, qla));
        canvas.draw(corps, couleurCorps, new Ellipse2D.Double(xp+5, yp+5, 
                                     lo, la));
        canvas.wait(timeout);                                 
    }
    
    /**
     * Dessine une tortue orientée vers l'ouest
     *
     * @param  x,y  position de la tortue
     */
    public static void tortueOuest(int x, int y)
    {
        int xp = x*50 + milieu;
        int yp = y*50 + milieu + 5;
        Canvas canvas = Canvas.getCanvas(); 
        canvas.draw(patteAG, couleurPattes, new Ellipse2D.Double(xp+10, yp+3, 
                                     pla, plo));
        canvas.draw(patteAD, couleurPattes, new Ellipse2D.Double(xp+10, yp+la, 
                                     pla, plo));
        canvas.draw(patteRG, couleurPattes, new Ellipse2D.Double(xp+30, yp+1, 
                                     pla, plo));
        canvas.draw(patteRD, couleurPattes, new Ellipse2D.Double(xp+30, yp+la+2, 
                                     pla, plo));
        canvas.draw(tete, couleurTete, new Ellipse2D.Double(xp-5, yp+15, 
                                     tlo, tla));
        canvas.draw(queue, couleurPattes, new Ellipse2D.Double(xp+lo, yp+19, 
                                     tlo, qla));
        canvas.draw(corps, couleurCorps, new Ellipse2D.Double(xp+5, yp+5, 
                                     lo, la));
        canvas.wait(timeout);                                 
    }

    /**
     * Trace un trait noir vers le sud
     *
     * @param  x1,y1   position du point de départ, en cases
     */
    public static void ecrisVertical(int x1, int y1, String color)
    {
        String trait = new String("Trait" + n++);
        Canvas canvas = Canvas.getCanvas(); 
        int xPosition = x1*50 + milieu + 23;
        int yPosition = y1*50 + milieu + 23;
        int la = 5;
        int lo = 55;
        canvas.draw(trait, color,
                        new Rectangle(xPosition, yPosition, la, lo));
    }

    /**
     * Trace un trait noir vers l'est
     *
     * @param  x1,y1   position du point de départ, en cases
     */
    public static void ecrisHorizontal(int x1, int y1, String color)
    {
        String trait = new String("Trait" + n++);
        Canvas canvas = Canvas.getCanvas(); 
        int xPosition = x1*50 + milieu + 23;
        int yPosition = y1*50 + milieu + 23;
        int la = 5;
        int lo = 55;
        canvas.draw(trait, color,
                        new Rectangle(xPosition, yPosition, lo, la));
    }
   
}
