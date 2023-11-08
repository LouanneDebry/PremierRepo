
/**
 * Test de la tortue LOGO
 * 
 * @author PG 
 * @version 15/08/2006
 */
public class Main
{
    public static void main ()
    {
        {
        TortueG t = new TortueG();
        t.avancer(); t.tourner();
        t.avancer(); t.tourner();
        t.avancer(); t.tourner();
        t.avancer(); t.tourner();
        
        t.tourner(); t.tourner();
        t.tracer(false);
        t.avancer();
        t.tourner();
        t.tracer(true);
        t.tourner(); t.tourner();
        t.avancer(); t.tourner();
        t.avancer(); t.tourner();
        t.avancer(); t.tourner();
        t.avancer(); 
        }
        {
        Tortue t = new Tortue();
        t.avancer(); t.tourner();
        t.avancer(); t.tourner();
        t.avancer(); t.tourner();
        t.avancer(); t.tourner();
        
        t.tourner(); t.tourner();
        t.tracer(false);
        t.avancer();
        t.tourner();
        t.tracer(true);
        t.tourner(); t.tourner();
        t.avancer(); t.tourner();
        t.avancer(); t.tourner();
        t.avancer(); t.tourner();
        t.avancer(); 
        }
    }
}
