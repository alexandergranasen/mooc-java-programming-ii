
import java.util.ArrayList;

/*
 * Copyright (C) 2024 Alexander Granåsen at https://github.com/alexandergranasen
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Alexander Granåsen at https://github.com/alexandergranasen
 */
public class Box implements Packable {
    
    private double maximumCapacity;
    private ArrayList<Packable> items;
    
    public Box(double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        items = new ArrayList<>();
    }
    
	public void add(Packable item) {
            if (this.maximumCapacity >= item.weight()) {
                    items.add(item);
                    this.maximumCapacity -= item.weight();
            }
	}
    
    @Override
    public double weight() {
        double weight = 0;
        
        for(Packable item : items) {
            weight += item.weight();
        }
        
        return weight;
    }
    
    public int numberOfItems() {
        return this.items.size();
    }
    
    @Override
    public String toString() {
        return "Box: " +this.numberOfItems()+" items, total weight "+this.weight()+" kg";
    }
    
}
