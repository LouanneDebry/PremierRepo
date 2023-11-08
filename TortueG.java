
/**
* La tortue du programme LOGO. Graphique !
*
* @author PG
* @version 9/09/2007
*/
public class TortueG {
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
    public TortueG() {
        // initialise uniquement la direction et la trace
        // Par défaut, elle est en (0,0)
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
     * Méthode permettant à la tortue d'avancer dans la direction fixée
     */
    public void avancer() {
        switch(direction) {
            case 0:
                if (trace) CanvasTortue.ecrisHorizontal(x, y, "black");
                x++;
                break;
            case 1:
                if (trace) CanvasTortue.ecrisVertical(x, y, "black");
                y++;
                break;
            case 2:
                x--;
                if (trace) CanvasTortue.ecrisHorizontal(x, y, "black");
                break;
            case 3:
                y--;
                if (trace) CanvasTortue.ecrisVertical(x, y, "black");
        }
        afficherTortue();
    }

    /**
     * Méthode permettant de tourner, dans le sens des aiguilles d'une montre
     */
    public void tourner() {
        direction++;
        if(direction == 4)
            direction = 0;
        afficherTortue();
    }

    /**
     * Méthode permettant de tracer ou non
     * Remarque : cette implémentation n'est pas correcte : elle ne garantit pas
     * un appel correct des méthodes ; on peut appeler deux fois de suite
     * tracer(true) par exemple
     *
     * @param  mode   booléen représentant le mode de trace (vrai ou faux)
     */
    public void tracer(boolean mode) {
        trace = mode;
        afficherTortue();
    }

    /**
     * Affichage de la tortue
     */
    public void afficherTortue() {
        switch(direction) {
            case 0:
                CanvasTortue.tortueEst(x, y);
                break;
            case 1:
                CanvasTortue.tortueSud(x, y);
                break;
            case 2:
                CanvasTortue.tortueOuest(x, y);
                 break;
            case 3:
                CanvasTortue.tortueNord(x, y);
        }
    }

}
