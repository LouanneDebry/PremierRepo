 

/*
 * @author GIRARD Patrick
 * Date : 10 sept. 2005
 */
public class TestTortueCouleur {
	public static void main(String[] args) {
		TortueCouleur ma_tortue = new TortueCouleur("rouge");
		ma_tortue.avancer();
		ma_tortue.avancer();
		ma_tortue.tourner();
		ma_tortue.tourner();
		ma_tortue.tourner();
		ma_tortue.avancer();
		ma_tortue.nePasTracer();
		ma_tortue.avancer();
		System.out.println("La tortue trace : " + ma_tortue.enTrace());
		ma_tortue.avancer();
		ma_tortue.tracer();
		ma_tortue.avancer();
		System.out.println("La tortue trace : " + ma_tortue.enTrace());
		System.out.println("La tortue est finalement en " 
			+ ma_tortue.getPositionX() + ", " 
			+ ma_tortue.getPositionY()  ) ;
		ma_tortue.setCouleur("blanc");
		System.out.println("Couleur : " + ma_tortue.getCouleur());
		ma_tortue.setCouleur("jaune");
		System.out.println("Couleur : " + ma_tortue.getCouleur());
	}
}

/* RŽsultat du test (benchmark) :
Je suis en x:0 y:-1
J'avance vers 3
En ecrivant avec cette couleur ROUGE
Je suis en x:0 y:-2
J'avance vers 3
En ecrivant avec cette couleur ROUGE
Je suis en x:0 y:-2
J'avance vers 0
En ecrivant avec cette couleur ROUGE
Je suis en x:0 y:-2
J'avance vers 1
En ecrivant avec cette couleur ROUGE
Je suis en x:0 y:-2
J'avance vers 2
En ecrivant avec cette couleur ROUGE
Je suis en x:-1 y:-2
J'avance vers 2
En ecrivant avec cette couleur ROUGE
La tortue trace : false
Je suis en x:-4 y:-2
J'avance vers 2
En ecrivant avec cette couleur ROUGE
La tortue trace : true
La tortue est finalement en -4, -2
Couleur : NOIR
Couleur : JAUNE
*/