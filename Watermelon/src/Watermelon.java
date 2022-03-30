import java.util.Scanner;

public class Watermelon {

    /****** GET WATERMELON WEIGHT ******/
    Scanner scan = new Scanner(System.in);
    int melonWeight = scan.nextInt();

    String isWeightDivisible(int weight) {
        if(weight >= 1 && weight <= 100){
            /****** WEIGHT IS WITHIN RANGE ******/
            if (weight % 2 == 0 && weight != 2)
            /****** WEIGHT ISN'T DIVISIBLE ******/
                return "YES";
            else
            /****** WEIGHT IS DIVISIBLE RANGE ******/
                return "NO";
        }else
        /****** WEIGHT IS OUT OF RANGE ******/
            throw new IllegalArgumentException("Invalid Input");
    }
    /****** MAIN ******/
     public static void main(String[] args) {
        Watermelon melon = new Watermelon();
       int weight = melon.melonWeight;
        System.out.println(melon.isWeightDivisible(weight));
    }
}
