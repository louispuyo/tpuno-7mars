package uno;

/**
 * cette class Lanceur sert uniquement a lancer le jeu
 * @author louispuyo
 */



public class Lanceur extends Decorateur {

    /**
     * 
     * @param args
     * @return 
     */    
    public static void main(String[] args) {
        
        Decorateur decorateur = new Decorateur();
        decorateur.printLogo();
        
        
        Jeu jeu = new Jeu();
        jeu.lancer();
        
    }
    

    
    

    
}
