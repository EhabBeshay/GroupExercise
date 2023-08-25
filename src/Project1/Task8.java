package Project1;
//Maximum and minimum number in the array?
public class Task8 {
    public static void main(String[] args) {
        int [] num = {50,60,70,80,90,100,110, 120, 13, 40, 30, 20, 140};

        int max = 50;
        int min = 50;
        for (int i = 0; i < num.length ; i++) {
            if (num[i] > max ){
                max = num[i];

            }
            if (num[i] < min){
                min=num[i];
            }

        }
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number " + min);
    }
}
