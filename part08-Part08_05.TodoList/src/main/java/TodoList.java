/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ana_k
 */
import java.util.ArrayList;
    
public class TodoList {
    private ArrayList<String> tasks;
    
    public TodoList(){
           this.tasks = new ArrayList<String>();
    }
    public void add(String task){
        tasks.add(task);
    }
    public void print(){
        for (int i = 0; i<= tasks.size()-1;i++){
            System.out.println(i+1 + ": "+tasks.get(i));
        }
    }
    
    public void remove(int number){
        if(tasks.isEmpty()){
            System.out.println("List empty");
        } else {
        tasks.remove(number-1);
        }
        
    }
}
