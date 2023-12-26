/*
 * Copyright (C) 2023 Alexander Granåsen at https://github.com/alexandergranasen
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
public class Container {
    
    int amount = 0;
    
    public Container() {}
    
    public int contains() {
        return this.amount;
    }
    
    public void add(int amount) {
        // We only add to the container if the amount is positive.
        if(amount > 0) {
            if(this.amount+amount > 100) {
                this.amount = 100;
            } else {
                this.amount += amount;
            }
        } 
    }
    
    public void remove(int amount) {
        // We only remove from the container if the amount is negative.
        if(this.amount-amount < 0) {
            this.amount = 0;
        } else {
            this.amount -= amount;
        }
   }
    
    @Override
    public String toString() {
        return this.contains()+"/100";
    }
    
}
