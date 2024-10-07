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
public class Teacher extends Person {
    private int salary;
    
    public Teacher(String name, String adress, int salary) {
        super(name, adress);
        this.salary = salary;
    }
    
    public String salary() {
        return "salary " + this.salary;
    }
    
    @Override
    public String toString() {
        return super.getName() + "\n  " + super.getAdress() + "\n  " + this.salary() + " euro/month";
    }
}
