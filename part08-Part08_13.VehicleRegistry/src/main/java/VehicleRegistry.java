
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
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> hashmap;
    
    public VehicleRegistry() {
        this.hashmap = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
       for(LicensePlate l : hashmap.keySet()) {
           if(l.equals(licensePlate)) {
           return false;
        }
       }
       hashmap.put(licensePlate, owner);
       
       return true;
    }
    
    public String get(LicensePlate licensePlate) {
            return hashmap.getOrDefault(licensePlate , null);
        }
    
    public boolean remove(LicensePlate licensePlate) {
        
        if(!hashmap.containsKey(licensePlate)) {
            return false;
        }
        
        hashmap.remove(licensePlate);
        
        return true;
    }
    
        public void printLicensePlates() {

        for (LicensePlate e : hashmap.keySet()) {
            System.out.println(e);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (String position : hashmap.values()) {

            if (!owners.contains(position)) {

                owners.add(position);
            }
        }
        for (String position : owners) {
            System.out.println(position);
        }
    }
}

