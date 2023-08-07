
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first =0;
        int second = 0;

        while (true) {
            
            System.out.println("First: "+first+"/100");
            System.out.println("Second: "+second+"/100");
            
            
            String input = scan.nextLine();
           
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int valor = Integer.valueOf(parts[1]);
          
            if(valor>0){
                if(command.equals("add")){
                
                    if(first+valor>=100){
                        first=100;
                    }
                    if(first+valor<100){
                        first=first+valor;
                    }
                
                }
                if(command.equals("move")){
                    if(first-valor<=0){
                        if(second+first>=100){
                            second=100;
                            first=0;
                        }
                        if(second+first<100){
                            second=second+first;
                            first=0;
                        } 
                    }
                    if(first-valor>0){
                        if(second+valor>=100){
                            first=first-valor;
                            second=100;
                        }
                        if(second+valor<100){
                            first=first-valor;
                            second=second+valor;
                        }
                    }
                }
                if(command.equals("remove")){
                    if(second-valor<=0){
                        second=0;
                    }
                    
                    if(second-valor>0){
                        second=second-valor;
                    }
                    
                }
            }
        }
    }

}
