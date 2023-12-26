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
import java.util.Scanner;

public class LiquidContainers2
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        Container containerOne = new Container();
        Container containerTwo = new Container();

        while (true) 
        {
            try
            {
                System.out.println("First: "+containerOne);
                System.out.println("Second: "+containerTwo);

                String input = scan.nextLine();
                if (input.equals("quit")) 
                {
                    break;
                }

                final String[] parts = input.split(" ");
                final String command = parts[0];
                final int amount = Integer.parseInt(parts[1]);

                if (amount < 1) 
                {
                    continue;
                }

                if (command.equalsIgnoreCase("add")) 
                {
                    containerOne.add(amount);
                }

                if (command.equalsIgnoreCase("move")) 
                {
                    // We cannot move more from the container then whats currently inside.
                    if(containerOne.contains() >= amount)
                    {
                        containerOne.remove(amount);
                        containerTwo.add(amount);
                    } else {
                        containerTwo.add(containerOne.contains()); 
                        containerOne.remove(amount); 
                    }
                }

                if (command.equalsIgnoreCase("remove")) 
                {
                    containerTwo.remove(amount);
                }
            }catch(Exception e)
            {
                System.out.println("Please enter a command like this (example):"
                        + "\nadd 10\nmove 5\nquit");
            }
        }    
    }
}
