/**Cette classe renseigne sur l'etat actuel de l'ovale et permet de l'alt�rer */
public class Etat { //les variables/donn�es utiles
    public Affichage affichage;
    

    public final int SAUT = 60; //taille saut
    public final int GRAVITE = 3; //chute
    public int posY = 200; //ordonn�e

    public final int TAILLEIMAGE = 100;
    public final int SIZE = 1000; //taille de l'�cran

    public Etat(){
    	
    }

    /**jump
     * met à jour la hauteur de flabby
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
