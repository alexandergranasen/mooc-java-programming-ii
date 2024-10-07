
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
public class Main {

    public static void main(String[] args) {
        // write your test code here
        Teacher t = new Teacher("Joel Kaasinen","Haagantie 123", 980);
        System.out.println(t);
    }
    
    public static void printPersons(ArrayList<Person> persons) {
        for(Person p : persons) {
            System.out.println(p.toString());
        }
    }

}
