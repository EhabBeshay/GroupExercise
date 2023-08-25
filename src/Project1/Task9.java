package Project1;
//Write a java program to find the second largest number in the array?
public class Task9 {
    public static void main(String[] args) {
        int [] num = {200 ,150,50,60,70,80,90,100,110, 120, 13, 40, 30, 20, 140,180,0,-1,210};

        int secondlargest = 0;
        int largest = 0;
        for (int i = 0; i < num.length ; i++) {
            if (largest < num[i]){
                secondlargest = largest;
                largest = num[i];
            } else if (num[i] > secondlargest) {
                secondlargest = num[i];


            }
        }
        System.out.println("The second Largest number is: " + secondlargest);

    }

}
