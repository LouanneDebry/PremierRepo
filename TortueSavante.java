
/**
* Write a description of class TortueSavante here.
*
* @author (your name)
* @version (a version number or a date)
*/
public class TortueSavante
{
    // Position de la tortue
    private int x;
    private int y;

    // Direction de la tortue
    private int direction;

    // Mode de la tortue
    private boolean trace;

    /**
    * Constructor for objects of class Tortue
    */
    public TortueSavante()
    {
        // initialise uniquement la direction et la trace
        direction = 3;
        trace = true;
    }

    /**
     * M?hode permettant ?la tortue d'avancer dans la direction fix?
     */
    public void avancer()
    {
        int ox, oy;
        ox = x;
        oy = y;
        switch(direction)
        {
            case 0:
                x++;
                break;
            case 1:
                y++;
                break;
            case 2:
                x--;
                break;
            case 3:
                y--;
        }
        afficherEtat();
        if(trace)
            afficherSegment(ox, oy, x, y);
    }

    /**
     * M?hode permettant de tourner, dans le sens des aiguilles d'une montre
     */
    public void tourner()
    {
        direction++;
        if(direction == 4)
            direction = 0;
        afficherEtat();
    }

    /**
     * Affichage de l'?at de la tortue
     */
    public void afficherEtat()
    {
        System.out.println("La tortue est en x:" + x + ", y:" + y + ", et en direction : " + direction);
        if(trace)
            System.out.println("La tortue trace");
        else
            System.out.println("La tortue ne trace pas");
    }

    /**
     * M?hode utilitaire d'affichage de segment
     *
     * @param  ox oy   coordonn?s initiales du segment
     * @param  x y   coordonn?s finales du segment
     */
    public void afficherSegment(int ox, int oy, int x, int y)
    {
        System.out.println("segment (" + ox + "," + oy + "),(" + x + "," + y + ")");
    }

    /**
     * M?hode permettant de tracer ou non
     * Remarque : cette impl?entation n'est pas correcte : elle ne garantit pas
     * un appel correct des m?hodes ; on peut appeler deux fois de suite
     * tracer(true) par exemple
     *
     * @param  mode   bool?n repr?entant le mode de trace (vrai ou faux)
     */
    public void tracer(boolean mode)
    {
        trace = mode;
        afficherEtat();
    }

    /**
     * Pour parler
     *
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public void parler(String s)
    {
        System.out.println(s);
    }

}
