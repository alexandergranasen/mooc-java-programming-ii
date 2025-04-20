
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander Granåsen at https://github.com/alexandergranasen
 */
public class Herd implements Movable {
    
    private List<Movable> herd = new ArrayList<>();
    
    //Returns a string representation of the positions of the members of the herd, each on its own line.
    public String toString() {
        String herd = "";
        
        for(int i = 0; i < this.herd.size(); i++) {
            if(i == this.herd.size()-1) {
                herd += this.herd.get(i).toString();
            } else {
                herd += this.herd.get(i).toString()+"\n";
            }
        }
        return herd;
    }

    //Adds an object that implements the Movable interface to the herd.
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }
    
    //Moves the herd with by the amount specified by the parameters. Notice that here you have to move each member of the herd.
    @Override
    public void move(int dx, int dy) {
        for(int i = 0; i < this.herd.size(); i++) {
            this.herd.get(i).move(dx, dy);
        }
    }
    

}
