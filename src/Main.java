
public class Main {
    public static void main(String[] args) {
        int[] weight1 = new int[12];
        weight1[0] = 1;
        weight1[1] = 2;
        weight1[2] = 3;

        double [] weight2 = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
        weight2[0] = 1.57;
        weight2[1] = 7.654;
        weight2[2] = 9.986;

        int [] weight3 = {90, 91, 93, 92, 85, 87, 84, 83, 11, 42, 3, 4};

        for (int index = 0; index < weight1.length; index++) {
            if (index == weight1.length - 1) {
                System.out.println(weight1[index]);
                break;
            }
            System.out.print(weight1[index] + " ");
        }
        for (int index = 0; index < weight2.length; index++) {
            if (index == weight2.length - 1) {
                System.out.println(weight2[index]);
                break;
            }
            System.out.print(weight2[index] + " ");
        }
        for (int index = 0; index < weight3.length; index++) {
            if (index == weight3.length - 1) {
                System.out.println(weight3[index]);
                break;
            }
            System.out.print(weight3[index] + " ");
        }
        for (int index =  weight1.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(weight1[index]);
                break;
            }
            System.out.print(weight1[index] + " ");
        }
        for (int index =  weight2.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(weight2[index]);
                break;
            }
            System.out.print(weight2[index] + " ");
        }
        for (int index =  weight3.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(weight3[index]);
                break;
            }
            System.out.print(weight3[index] + " ");
        }
        for (int index = 0; index < weight1.length; index++) {
            if (weight1[index] % 2 != 0) {
                weight1[index] += 1;
            }
                if (index == weight1.length - 1) {
                    System.out.println(weight1[index]);
                    break;
            }
            System.out.print(weight1[index] + " ");
        }
    }
}