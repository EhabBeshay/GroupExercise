package Project1;

/*Create a program that uses an array to store a list of temperatures for
a week, and then uses a loop to find the highest and lowest
temperature for the week.

 */
public class Task1 {
    public static void main(String[] args) {
        double[] temp = {70.3,65.4,80.5,95.0,101.8,77.0,69.7};

        double highest = 70.3;
        double lowest = 70.3;
        for (int i = 0; i < temp.length ; i++) {
            if (temp[i] > highest ){
                highest = temp[i];

            }
            if (temp[i] < lowest){
                lowest=temp[i];
            }

        }
        System.out.println("The highest temperature for the week is " + highest);
        System.out.println("The lowest temperature for the week is " + lowest);
    }
}
