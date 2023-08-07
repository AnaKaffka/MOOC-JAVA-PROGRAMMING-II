/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ana_k
 */
import java.util.Scanner;
public class UserInterface {
    
    public UserInterface(){
        
    }
    public void start(){
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        
        while (true) {
            System.out.println("First: "+ first.toString());
            System.out.println("Second: "+ second.toString());
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")){
                first.add(amount);
            }
            if (command.equals("move")){
                if(amount>0){
                    if(first.contains()<=amount){
                        int resto = first.contains();
                        first.remove(amount);
                        
                        if(second.contains()+amount>100){
                            second.add(amount);
                        }
                        if(second.contains()+amount<=100){
                            second.add(resto);
                        }
                        
                    }    
                    if(first.contains()>amount){
                         first.remove(amount);
                        if(second.contains()+amount>100){
                            second.add(amount);
                           
                        }
                        if(second.contains()+amount<=100){
                            second.add(amount);
                        }
                        
                    }
                }
            }    
            if(command.equals("remove")){
                second.remove(amount);
            }
            
            
 
        }
    }
}
