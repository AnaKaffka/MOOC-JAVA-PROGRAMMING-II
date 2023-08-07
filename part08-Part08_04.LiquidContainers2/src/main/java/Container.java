/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ana_k
 */
public class Container {
    private int container;
    
    public Container(){
        this.container=container;
    }
    public int contains(){
        return this.container;
    }
    public void add(int amount){
        if(amount>0){
            
            if(container+amount>=100){
                this.container=100;
            }
            
            if(container+amount<100){
                this.container=this.container+amount;
            }
            
        }
    }
    public void remove(int amount){
        if(container-amount<=0){
            container=0;
        }
        if(container-amount>0){
            container=container-amount;
        }
    }
    public String toString(){
        return this.container+"/100";
    }
    
    
}
