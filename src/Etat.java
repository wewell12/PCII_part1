/**Cette classe renseigne sur l'etat actuel de l'ovale et permet de l'altérer */
public class Etat { //les variables/données utiles
    public Affichage affichage;
    

    public final int SAUT = 60; //taille saut
    public final int GRAVITE = 3; //chute
    public int posY = 200; //ordonnée

    public final int TAILLEIMAGE = 100;
    public final int SIZE = 1000; //taille de l'écran

    public Etat(){
    	
    }

    /**jump
     * met Ã  jour la hauteur de flabby
     */
    public void jump(){
    	if(this.posY > -SAUT) {
    		posY -= SAUT;
    	}
    }

    public void moveDown(){
        if (posY <= SIZE - GRAVITE){
        	posY += GRAVITE;
        }
        
    }
    
    public int getHauteur() {
    	return this.posY;
    }
}
