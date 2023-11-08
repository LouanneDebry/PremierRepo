 

/* Cours de POO - �l�ments de correction
 * GIRARD PATRICK
 * Date : 10 sept. 2005
 *
 * Ici, on a choisi d'impl�menter les couleurs par une cha�ne et de mettre une valeur par d�faut
 * � noir ; on met �galement les couleurs en majuscules, en contr�lant leurs valeurs. Si la valeur
 * est incorrecte, la tortue �crit en noir.
 */
public class TortueCouleur {

// Attributs
	// Couleurs
	private static final String lesCouleurs[] = { "NOIR", "ROUGE", "BLEU", "VERT", "JAUNE" };
	private String couleur = "NOIR";
	// Abscisse de la tortue
	private int position_x;
	// Ordonn�e de la tortue
	private int position_y;
	// Orientation de la tortue
	private int orientation;
	// Dessin ou pas 
	private boolean trace = true;
	
	// Constructeur
	public TortueCouleur() {
		orientation=3;
	}

	// Constructeur avec couleur
	public TortueCouleur(String coul) {
	//	this();
		couleur = rendCouleur(coul);
	}
	public void setCouleur(String coul){
		couleur = rendCouleur(coul);
	}
	public String getCouleur() {
		return couleur;
	}
	
	// Toutes les primitives issues de la mod�lisation UML

	public void tourner() {
		orientation = (orientation + 1) % 4;
		this.afficheInformation();
	}
	public void avancer() {
		switch(orientation) {
			case 0 : this.position_x++ ; break;
			case 1 : this.position_y++ ; break;
			case 2 : this.position_x-- ; break;
			case 3 : this.position_y-- ; break;
			default : break;
		}
		this.afficheInformation();
	}
	public void tracer() {
		trace = true;
	}	
	public void nePasTracer() {
		trace = false;
	}
	public boolean enTrace() {
		return trace;
	}
	
	// Quelques primitives suppl�mentaires

	private String rendCouleur(String coul) {
		for (int i=0; i<lesCouleurs.length; i++)
			if (coul.equalsIgnoreCase(lesCouleurs[i]))
			  return coul.toUpperCase();
		return "NOIR";
	}
	private void afficheInformation() {
		if (trace) {
			System.out.println("Je suis en " + "x:" + position_x + " y:" + position_y);
			System.out.println("J'avance vers " + orientation);
			System.out.println("En ecrivant avec cette couleur " + couleur);
		}
	}
	public int getPositionX() {
		return position_x;
	}
	public int getPositionY() {
		return position_y;
	}

}