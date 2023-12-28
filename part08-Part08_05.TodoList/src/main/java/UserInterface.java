
import java.util.ArrayList;
import java.util.Scanner;

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
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        
        boolean shouldLoop = true;
        
        while(shouldLoop) {
            System.out.print("Command: ");
            String command = scanner.nextLine();        
            
            switch(command) {
                case "add":
                    System.out.print("To add: ");
                    todoList.add(scanner.nextLine());
                    break;
                case "list":
                    todoList.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed?");
                    try {
                        int numberToRemove = Integer.parseInt(scanner.nextLine());
                        todoList.remove(numberToRemove);
                    } catch(Exception e) {
                        System.out.println("You have to enter an integer.");
                    }
                    break;
                case "stop":
                    shouldLoop = false;
            }
        }
    }
}
