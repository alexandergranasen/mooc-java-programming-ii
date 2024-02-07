
import java.util.HashMap;

/*
 * Copyright (C) 2024 Alexander Granåsen at https://github.com/alexandergranasen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

/**
 *
 * @author Alexander Granåsen at https://github.com/alexandergranasen
 */
public class Abbreviations {
    private HashMap<String, String> abbreviation = new HashMap<>();
    
    public Abbreviations() {}
    
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviation.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if(this.abbreviation.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String findExplanationFor(String abbreviation) {
        if(!hasAbbreviation(abbreviation)) {
            return null;
        }
        
        return this.abbreviation.get(abbreviation);
    }
}
