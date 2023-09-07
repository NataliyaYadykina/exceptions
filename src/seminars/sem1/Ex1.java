package seminars.sem1;

public class Ex1 {

    public static void main(String[] args) {

        int[] nums = new int[4];

        try {
            System.out.println("Before exception.");
            nums[7] = 10;
            System.out.println("After exception");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Index out of bounds.");
        }

        System.out.println("After the catch.");

    }

}
