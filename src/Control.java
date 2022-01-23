import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*Cette classe implemente tous les �l�ments interractifs du jeu, ici la d�t�ction du clic de la souris*/
public class Control extends JPanel implements MouseListener { //les action alistener, l'input utilisateur
    public Etat etat; //contient les donn�es du jeu
    public Affichage affichage; //affichage à mettre à jour

    public Control(Etat etat, Affichage affichage){
        this.etat = etat;
        this.affichage = affichage;
        affichage.addMouseListener(this);
    }

    /**mouseClicked
     * Actions � r�aliser lors d'un clic souris
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
