
import static java.lang.Math.round;
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
public class ChangeHistory {
    
    private ArrayList<Double> changeHistory;
    
    public ChangeHistory() {
        changeHistory = new ArrayList<Double>();
    }
    
    public void add(double status) {
        changeHistory.add(status);
    }
    
    public void clear() {
        changeHistory.clear();
    }
    
    public double maxValue() {
        double max = changeHistory.get(0);
        
        for(Double d : changeHistory) {
            if(d.doubleValue() > max) {
                max = d.doubleValue();
            }
        }
        
        return max;
    }
    
    public double minValue() {
        double min = changeHistory.get(0);
        
        for(Double d : changeHistory) {
            if(d.doubleValue() < min) {
                min = d.doubleValue();
            }
        }
        
        return min;
    }
    
    public double average() {
        int count = 0;
        double sum = 0.0;
        
        for(Double d : changeHistory) {
            sum += d.doubleValue();
            count++;
        }
        
        double average = sum/count;
        
        return average;
    }
    
    @Override
    public String toString() {
        return changeHistory.toString();
    }
}
