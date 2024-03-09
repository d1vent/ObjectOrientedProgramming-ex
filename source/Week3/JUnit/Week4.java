package Week3.JUnit;

/**
 * cal BMI.
 */
public class Week4 {
    /**
     * Find maximum of two numbers.
     * @param a num 1
     * @param b num 2
     * @return max of two numbers
     */
    public static int max2Int(int a, int b) {
        // Tim gia tri lon nhat cua hai so nguyen
        return Math.max(a, b);
    }

    /**
     * Find the minimun of array.
     * @param array num
     * @return min number of array
     */
    public static int minArray (int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * find the bmi of the person.
     * @param weight w
     * @param height h
     * @return bmi
     */
    public static String calculateBMI(double weight, double height){
        // Tinh BMI
        double bmi = weight / (height * height);
        bmi = Math.round(bmi * 10) / 10.0;
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi >= 18.5 && bmi <= 22.9) {
            return "Bình thường";
        } else if (bmi >= 23 && bmi <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
