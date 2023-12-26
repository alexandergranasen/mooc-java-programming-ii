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

public class LiquidContainers 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int containerOne = 0;
        int containerTwo = 0;

        while (true) 
        {
            try
            {
                System.out.println("First: " + containerOne + "/" + "100");
                System.out.println("Second: " + containerTwo + "/" + "100");

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
                    if (containerOne + amount <= 100) 
                    {
                        containerOne += amount;
                    } else 
                    {
                        containerOne = 100;
                    }
                }

                if (command.equalsIgnoreCase("move")) 
                {
                    if (amount > containerOne) 
                    {
                        containerTwo += containerOne;
                    } else 
                    {
                        containerTwo += amount;
                        containerOne -= amount;
                    }
                }

                if (command.equalsIgnoreCase("remove")) 
                {
                    if (containerTwo - amount >= 0) 
                    {
                        containerTwo -= amount;
                    }
                }

                if (containerTwo > 100) 
                {
                    containerTwo = 100;
                }
            }catch(Exception e)
            {
                System.out.println("Please enter a command like this (example):"
                        + "\nadd 10\nmove 5\nquit");
            }
        }    
    }
}
