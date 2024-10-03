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
import java.util.HashMap;

public class Program {
    
    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    public static void printKeys(HashMap<String,String> hashmap) {

        // Prints the keys from the hashmap
        for(String i : hashmap.keySet()) {
            System.out.println(i);
        }
    }
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {

        // Checks if input matches key and prints it out if found
        for(String i : hashmap.keySet()) {
            if(i.contains(text)) {
                System.out.println(i);
            }
        }
    }
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        // Prints the values from the hashmap
        for(String i : hashmap.keySet()) {
            if(i.contains(text)) {
                String key = i;
                System.out.println(hashmap.get(key));
            }
        }
    }
}
