package uno;

/**
 * cette classe est communes a toutes les cartes
 * @author louispuyo
 *
 */
public abstract class Carte {

	/**
	 * la couleur de la carte
	 * @see Couleur
	 * 
	 */
	protected Couleur couleur;
	
	/**
	 * constructeur
	 * @param couleur : la couleur de la carte
	 */
	public Carte(Couleur couleur) {
		this.couleur = couleur;
	}
	
	/**
	 * @param carte : la carte qu'on voit sur le sommet du talon
	 * @return true : Si la carte peut etre deposee sur l'objet ( carte )
	 * @return false : sinon
	 * abstraite en raison de specificite propre aux carte special
	 */
	public abstract boolean compatible(Carte carte);
	
	/**
	 * retourne une chaene descrivant l'objet courant
	 */
	public String toString() {
		return couleur.getValeur();
	}

	abstract public int getValeur();
	

	/**
	 * permet de retourner la couleur de la carte en cours
	 * @return la couleur de la carte en cours
	 */
	public Couleur getCouleur() {
		return couleur;
	}
	
}
