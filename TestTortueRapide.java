 

/*
 * @author GIRARD Patrick
 * Date : 10 sept. 2005
 */
public class TestTortueRapide {
	public static void main(String[] args) {
		TortueRapide ma_tortue = new TortueRapide();
		ma_tortue.avancer();
		ma_tortue.accelerer();
		ma_tortue.accelerer();
		ma_tortue.avancer();
		ma_tortue.tourner();
		ma_tortue.ralentir();
		ma_tortue.avancer();
		ma_tortue.tourner();
		ma_tortue.avancer();
		ma_tortue.tracer(false);
		ma_tortue.avancer();
		ma_tortue.avancer();
		ma_tortue.tracer(true);
		ma_tortue.avancer();
	}
}

/* RŽsultat du test (benchmark) :
Je suis en x:0 y:-1
J'avance vers 3
Je suis en x:0 y:-3
J'avance vers 3
Je suis en x:0 y:-4
J'avance vers 3
Je suis en x:0 y:-4
J'avance vers 0
Je suis en x:0 y:-4
J'avance vers 1
Je suis en x:0 y:-4
J'avance vers 2
Je suis en x:-1 y:-4
J'avance vers 2
La tortue trace : false
Je suis en x:-4 y:-4
J'avance vers 2
La tortue trace : true
La tortue est finalement en -4, -4
*/