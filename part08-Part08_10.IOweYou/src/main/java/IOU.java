
import java.util.Collection;
import java.util.HashMap;

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
public class IOU {
    private HashMap<String, Double> hashmap;
            
    public IOU() {
        hashmap = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        hashmap.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        for(String n : hashmap.keySet()) {
            if(n.equals(toWhom)) {
                double l = hashmap.get(n);
                return l;
            }
        }
        return 0.0;
    }
}
