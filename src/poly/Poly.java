
package poly;

import java.util.ArrayList;


public class Poly {

    
    public static void main(String[] args) {
        ArrayList<Animal> myAnimals = new ArrayList<>();
        
        Fish fish1 = new Fish();
        Fish fish2 = new Fish();
        
        Bird bird1 = new Bird();
        
        myAnimals.add(bird1);
        myAnimals.add(fish1);
        myAnimals.add(fish2);
        
        for(Animal a: myAnimals){
            a.move();
        }
        
////        for(Animal a : myAnimals){
////            if(a instanceof Fish){
////                ((Fish) a).move();
////            }else if (a instanceof Bird){
////                ((Bird)a).move();
////            }
//        }
    }
    
}
