import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double weight,height;
        System.out.println("Enter your weight : ");
        weight = input.nextDouble();
        System.out.println("Enter your height (in cm) : ");

        height = input.nextDouble();
        double h = height / 100;

        double BMI = weight / (h * h) ;

        System.out.println("Your BMI is : " + BMI + " kg/m2");

    }

}
