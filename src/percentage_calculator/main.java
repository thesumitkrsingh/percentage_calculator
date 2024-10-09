package percentage_calculator;
import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner get=new Scanner(System.in);
        System.out.println("enter your obtained marks");
        double take=get.nextDouble();
        System.out.println("enter your total marks");
        double fetch=get.nextDouble();
        double percentage= (take / fetch)*100;
        System.out.println("percentage is:"+percentage+"%");






    }
}
