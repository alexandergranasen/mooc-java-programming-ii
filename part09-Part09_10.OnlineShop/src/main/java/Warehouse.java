
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
public class Warehouse {
    
    private Map<String, Integer> store = new HashMap();
    private Map<String, Integer> store_stock = new HashMap();
    
    public void addProduct(String product, int price, int stock) {      
        this.store.put(product, price);
        this.store_stock.put(product, stock);
    }
    
    public int price(String product) {
        if(this.store.containsKey(product)) {
            return this.store.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product) {
        
        if(this.store_stock.containsKey(product)) {
            return this.store_stock.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product) {
        if (this.store_stock.containsKey(product) && this.store_stock.get(product) > 0) {
            this.store_stock.put(product, this.store_stock.get(product) - 1);
            return true;
        }

        return false;
    }
    
    public Set<String> products() {
        Set<String> keys = this.store_stock.keySet();
        
        return keys;
    }
}
