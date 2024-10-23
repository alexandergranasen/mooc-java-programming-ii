
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
public class ShoppingCart {
    private Map<String, Item> sc = new HashMap<String, Item>();
    
    public ShoppingCart() {}
    
    public void add(String product, int price) {
        if(this.sc.containsKey(product)) {
            this.sc.get(product).increaseQuantity();
        } else {
            this.sc.put(product, new Item(product, 1, price));
        }
    }
    
    public int price() {
        int sum = 0;
        
        for(Item i : this.sc.values()) {
            sum += i.price();
        }
        return sum;
    }
    
    public void print() {
        for(Item i : sc.values()) {
            System.out.println(i);
        }
    }
}
