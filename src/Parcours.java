

import java.awt.*;
import java.util.ArrayList;

public class Parcours  extends Thread {
    public ArrayList<Point> points = new ArrayList<>();
    public Etat etat;
    public int lastpoint = 200;
    public final int AVANCE = 5;
    public final int RATIOPENTE;  //doit dependre d'AVANCE et de GRAVITE
    
    public Parcours(Etat etat){
        this.etat = etat;
        this.RATIOPENTE = AVANCE/etat.GRAVITE;
        points.add(new Point(lastpoint, (etat.SIZE)/2));
        lastpoint += 200 ;
        points.add(new Point(lastpoint, (etat.SIZE)/2));
        do{
            /*coordonnee en x*/
        	lastpoint +=(int) (50 + Math.random()*(200 - 50)); 
            /*recuperation des coordonnees du ernier point */
            int lastIdx = points.size() - 1;
            Point lastPt = points.get(lastIdx);
            int ry;
            int ecartPt = (lastpoint - lastPt.x) * RATIOPENTE  ; /* calcul de la pente maximale possible */
            /* separation des cas en prevision des sorties d'ecran */
            if(lastPt.y-ecartPt<0){
                ry = (int) ((0)+Math.random()*((lastPt.y+ecartPt)-(0)));
            }
            else if (lastPt.y+ecartPt>etat.SIZE){
                ry = (int) ((lastPt.y-ecartPt)+Math.random()*((etat.SIZE)-(lastPt.y-ecartPt)));
            }
            else{
                ry = (int) ((lastPt.y-ecartPt)+Math.random()*((lastPt.y+ecartPt)-(lastPt.y-ecartPt)));
            }
            points.add(new Point(lastpoint, ry)); 
        }while(lastpoint < (etat.SIZE));
        
    }

    /** Renvoie un tableau des points encore dans l'image*/
    public ArrayList<Point> getPoints(){
        ArrayList<Point> res = new ArrayList<>(); 
        for (Point point : this.points) { 
            int absolu = point.x - lastpoint; //test si le point est dans l'ecran
            if (absolu >= 0) {
                res.add(point);
            }
        }
        return res;
    }

    public int getScore(){
        return this.lastpoint;
    }

    public void setScore(int n){
        this.lastpoint = n;
    }
    
    public void majParcours() {
    	ArrayList<Point> res = new ArrayList<Point>();
    	for(Point p : this.points) {
    		p.x -= AVANCE;
    		if(p.x >= -200 /*l'ecart max avec les voisins*/) {
    			res.add(p);
    		}
    	}
    	this.lastpoint -= AVANCE;
    	
    	if(points.get(points.size()-1).x < etat.SIZE) {
    		/*coordonnee en x*/
        	lastpoint +=(int) (50 + Math.random()*(200 - 50)); 
            /*recuperation des coordonnees du ernier point */ 
            int lastIdx = points.size() - 1;
            Point lastPt = points.get(lastIdx);
            int ry;
            int ecartPt = (lastpoint - lastPt.x) * RATIOPENTE ;/* calcul de la pente maximale possible */
            /* separation des cas en prevision des sorties d'ecran */
            if(lastPt.y-ecartPt<0){
                ry = (int) ((0)+Math.random()*((lastPt.y+ecartPt)-(0)));
            }
            else if (lastPt.y+ecartPt>etat.SIZE){
                ry = (int) ((lastPt.y-ecartPt)+Math.random()*((etat.SIZE)-(lastPt.y-ecartPt)));
            }
            else{
                ry = (int) ((lastPt.y-ecartPt)+Math.random()*((lastPt.y+ecartPt)-(lastPt.y-ecartPt)));
            }
            res.add(new Point(lastpoint, ry)); 
    	}
    	this.points = res;
    }
}
