import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**Cette classe regroupe toute les informations et fonctions nessescaire a l'affichage du jeu*/

public class Affichage extends JPanel{
	public Parcours parcours;
	public Etat e; //contient les données du jeu

	/**Dimensions de l'ovale*/
    public static final int largeurOval = 75;
    public static final int hauteurOval = 150;
    
	public Affichage(Etat etat, Parcours parcours) {
		setPreferredSize(new Dimension(etat.SIZE, etat.SIZE));
		this.parcours = parcours;
		this.e = etat;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paintComponent(g);
		 g.drawOval(100,e.posY,largeurOval,hauteurOval);
	    
		ArrayList<Point> l = parcours.points;
		
		for(int i = 0; i < l.size()-1; i++){ //pb here
			g.drawLine(l.get(i).x, l.get(i).y, l.get(i+1).x, l.get(i+1).y);
		}
	}
}
