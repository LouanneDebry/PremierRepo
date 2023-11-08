
/**
* La tortue du programme LOGO. Dans cet exemple, il n'y a pas les accesseurs des attributs.
* On peut visualiser l'?tat, mais pas le reste.
*
* @author PG
* @version 15/08/2006
*/
public class Tortue {
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
    public Tortue() {
        // initialise uniquement la direction et la trace
        direction = 3;
        trace = true;
    }

    /**
     * Accesseur de la direction
     *
     * @return     la valeur de la direction
     */
    public int getDirection() {
        return direction;
    }

    /**
     * M?thode permettant ? la tortue d'avancer dans la direction fix?e
     */
    public void avancer() {
        int ox, oy;
        ox = x;
        oy = y;
        switch(direction) {
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
     * M?thode permettant de tourner, dans le sens des aiguilles d'une montre
     */
    public void tourner() {
        direction++;
        if(direction == 4)
            direction = 0;
        afficherEtat();
    }

    /**
     * Affichage de l'Žtat de la tortue
     */
    public void afficherEtat() {
        System.out.println("La tortue est en x:" + x + ", y:" + y + ", et en direction : " + direction);
        if(trace)
            System.out.println("La tortue trace");
        else
            System.out.println("La tortue ne trace pas");
    }

    /**
     * MŽthode utilitaire d'affichage de segment
     *
     * @param  ox oy   coordonn?es initiales du segment
     * @param  x y   coordonn?es finales du segment
     */
    private void afficherSegment(int ox, int oy, int x, int y) {
        System.out.println("segment (" + ox + "," + oy + "),(" + x + "," + y + ")");
    }

    /**
     * MŽthode permettant de tracer ou non
     * Remarque : cette impl?mentation n'est pas correcte : elle ne garantit pas
     * un appel correct des m?thodes ; on peut appeler deux fois de suite
     * tracer(true) par exemple
     *
     * @param  mode   bool?en repr?sentant le mode de trace (vrai ou faux)
     */
    public void tracer(boolean mode) {
        trace = mode;
        afficherEtat();
    }

}
