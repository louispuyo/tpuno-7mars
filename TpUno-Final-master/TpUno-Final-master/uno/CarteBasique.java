package uno;

/**
 * classe des cartes non speciales, basiques du jeu chiffre et couleur
 * @author louispuyo
 *
 */
public class CarteBasique extends Carte {

	/**
	 * la valeur de la carte, doit etre un entier entre 0 et 9
	 */
	private int valeur;
	
	/**
	 * constructeur
	 * @param couleur : la couleur de la carte
	 * @param valeur : la valeur de la carte
	 */
	public CarteBasique(Couleur couleur, int valeur) {
		super(couleur);
		this.valeur = valeur;
	}
	
	/**
	 * permet de retourner une chaene contenant la representation de l'objet courant
	 */
	@Override
	public String toString() {
		return super.toString() + " " + valeur;
	}

	@Override
	public int getValeur()
	{
		return this.valeur;
	}

	/**
	 * @return true : verifie la compatibilte et si la carte est jouable
	 * @return false : sinon
	 */
	@Override
	public boolean compatible(Carte carte) {
		if (carte instanceof CarteBasique) {	//	CarteChiffre
			// meme couleur ou meme valeur ?
			return ( carte.couleur == couleur ) || ( ((CarteBasique) carte).valeur == valeur );	// meme couleur ou meme valeur
		} else {	// CarteSpecial
			// meme couleur ?
			return carte.couleur == couleur;	// meme couleur
		}
	}

}
