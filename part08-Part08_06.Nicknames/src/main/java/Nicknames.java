
import java.util.HashMap;

public class Nicknames {
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
    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nickNames = new HashMap<>();
        nickNames.put("matthew", "matt");
        nickNames.put("michael", "mix");
        nickNames.put("arthur", "artie");
        
        System.out.println(nickNames.get("matthew"));
    }

}
