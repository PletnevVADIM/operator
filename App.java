import java.util.Scanner;

public class App {
    
    public static int checkYears (int year, int days, int sum){
         if(( year % 100 ==0) ||(year % 4 ==0 || year % 400 ==0)){
                if(days==366){
                    System.out.println("YES, it's year have 366 days");
                    sum++;
                } else{
                    System.out.println("NO, this year have 366 days");
                    System.out.println(" GAME END " + sum);
                    return -1;
                }
            } else{
                if (days == 365){
                    System.out.println("YES, this year have 365 days");
                    sum++;
                }else{
                    System.out.println("NO, this year have 365 days \n");
                    System.out.println("GAME END(( " + sum);
                    return -1;
                }
            }
            return sum;
    }
    public static void main(String[] args) throws Exception {
          Scanner scanner = new Scanner (System.in);
          int sum = 0;
       
        while (true){
            System.out.println(" Enter years ");
             int year = scanner.nextInt();
            System.out.println("Enteer days");
            int days = scanner.nextInt();
           int score = checkYears( year, days, sum);
           if (score == -1){
            break;
           }
        sum=score;
        }
        
    }
    
}
     

   

