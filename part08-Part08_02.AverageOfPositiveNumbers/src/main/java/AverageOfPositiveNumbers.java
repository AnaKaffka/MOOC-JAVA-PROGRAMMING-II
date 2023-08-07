
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int i = 0;
        while(true){
            int number = scanner.nextInt();
            
            if(number!=0){
                if(number>0){
                    sum=number+sum;
                    i++;
                }
            }
            if(number==0){
                if(sum>0){
                    System.out.println((sum*1.0)/i);
                    break;
                }
                if(sum<=0){
                    System.out.println("Cannot calculate the average");
                    break;
                }
            }
            
        }
    }
}
