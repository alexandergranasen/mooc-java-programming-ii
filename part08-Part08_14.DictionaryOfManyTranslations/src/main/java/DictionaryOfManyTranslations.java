
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;
            
    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<String, ArrayList<String>>();
    }

    public void add(String word, String translation) {
        // If word is not there, we create a new arraylist for that word.
        this.translations.putIfAbsent(word, new ArrayList<String>());
        
        // We now add the translation
        this.translations.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        ArrayList<String> emptyList = new ArrayList<>();
        return this.translations.getOrDefault(word, emptyList);
    }
    
    public void remove(String word) {
        this.translations.remove(word);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DictionaryOfManyTranslations other = (DictionaryOfManyTranslations) obj;
        if (!Objects.equals(this.translations, other.translations)) {
            return false;
        }
        return true;
    }
    
    
}
