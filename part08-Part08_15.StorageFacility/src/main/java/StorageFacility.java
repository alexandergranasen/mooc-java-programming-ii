
import java.util.ArrayList;
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
public class StorageFacility {
    HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap<String, ArrayList<String>>();
    }
    
    public void add(String storageUnit, String item) {
        // If unit is not there, we create a new arraylist for that unit.
        this.storage.putIfAbsent(storageUnit, new ArrayList<String>());
        
        // We now add the item
        this.storage.get(storageUnit).add(item);
    }
            
    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> emptyList = new ArrayList<>();
        return this.storage.getOrDefault(storageUnit, emptyList);
    }
    
    public void remove(String storageUnit, String item) {
        this.storage.get(storageUnit).remove(item);
        
        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> sUnitsKeys = new ArrayList<>();
        
        for(String e: storage.keySet()){
            sUnitsKeys.add(e);
        }
        return sUnitsKeys;
    }
}
