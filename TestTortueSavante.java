 

/*
 * @author GIRARD Patrick
 * Date : 10 sept. 2005
 */
public class TestTortueSavante {
	public static void main(String[] args) {
		TortueSavante ma_tortue = new TortueSavante();
		ma_tortue.parler("Je suis une tortue savante, je sais parler !");
		ma_tortue.avancer();
		ma_tortue.avancer();
		ma_tortue.tourner();
		ma_tortue.tourner();
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
La tortue savante sait parler : Je suis une tortue savante, je sais parler !
Je suis en x:0 y:-1
J'avance vers 3
Je suis en x:0 y:-2
J'avance vers 3
Je suis en x:0 y:-2
J'avance vers 0
Je suis en x:0 y:-2
J'avance vers 1
Je suis en x:0 y:-2
J'avance vers 2
Je suis en x:-1 y:-2
J'avance vers 2
La tortue trace : false
Je suis en x:-4 y:-2
J'avance vers 2
La tortue trace : true
La tortue est finalement en -4, -2
*/