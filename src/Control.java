import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*Cette classe implemente tous les éléments interractifs du jeu, ici la détéction du clic de la souris*/
public class Control extends JPanel implements MouseListener { //les action alistener, l'input utilisateur
    public Etat etat; //contient les données du jeu
    public Affichage affichage; //affichage Ã  mettre Ã  jour

    public Control(Etat etat, Affichage affichage){
        this.etat = etat;
        this.affichage = affichage;
        affichage.addMouseListener(this);
    }

    /**mouseClicked
     * Actions à  réaliser lors d'un clic souris
     * @param e un clic souris
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        //Action on-click
    	this.etat.jump();
        affichage.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}
