package meurobox;
import robocode.*;
import java.awt.Color;
/**
 * william - class by (William Matos)
 */
public class WilliamRobox extends Robot {
     public void run(){
         setColors(Color.red,Color.black,Color.yellow,Color.white,Color.blue);
		while(true){
         ahead(100);		
		 turnRight(90);		 
        }
     }
	 //Tank Robo inimigo detectado
	 public void onScannedRobot(ScannedRobotEvent e) {
         String robotank = e.getName();
		 double distancia = e.getDistance();
		 System.out.println(robotank + "distância" + distancia);
         if(distancia < 135){
			 fire(3);
		 }else{
			 fire(1);
		 }
     }
	 //Colisão com a parede
	 public void onHitWall(HitWallEvent e){
		 back(50);
		 turnRight(90);
	 }
}
