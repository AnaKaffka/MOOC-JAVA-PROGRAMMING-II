/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ana_k
 */
import java.util.HashMap;
public class Abbreviations {
    private HashMap<String, String> listOfAbbre;
    
    public Abbreviations(){
        this.listOfAbbre = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation){
        if(this.listOfAbbre.containsKey(abbreviation)){
            System.out.println("Has abbreviation");
        } else {
            listOfAbbre.put(abbreviation, explanation);
        }
        
    }
    public boolean hasAbbreviation(String abbreviation){
        boolean hasAbb = false;
        if(this.listOfAbbre.containsKey(abbreviation)){
            hasAbb=true;
        } 
        return hasAbb;
    }
    public String findExplanationFor(String abbreviation){
        if (abbreviation == null) {
            return null;
        }
        return this.listOfAbbre.get(abbreviation);
    }
    public static String sanitizaString(String in){
        if(in ==null){
            return"";
        }
        in=in.toLowerCase();
        return in.trim();
    }
}
