
/**
 * Programe de test et d'exemple pour la classe  CanvasTortue
 * 
 * @author Patrick Gorard    
 * @version 9/09/2007
 */
public class TestCanvasTortue
{

    public static void main()
    {
        CanvasTortue.ecrisVertical (1,1, "black");
        CanvasTortue.ecrisHorizontal(1,1, "red");
        CanvasTortue.ecrisVertical (2,1, "yellow");
        CanvasTortue.ecrisHorizontal(1,2, "magenta");
        CanvasTortue.ecrisHorizontal(3,3, "blue");
        CanvasTortue.tortueNord(1,-2);
        CanvasTortue.ecrisVertical (1,-2, "black");
        CanvasTortue.ecrisHorizontal(-3,-3, "green");
    }
}
