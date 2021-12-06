package Data_and_operation;

public class Casting {

    public static void main(String[] args) {

        double a = 1.1;
        double b = 1; // 1은 int이지만 double에 가면 1.0으로 converting된다.
        double b2 = (double) 1;

        System.out.println(b);

        // int c = 1.1;
        double d = 1.1;
        int e = (int) 1.1;
        System.out.println(e);

        // 1 to String
        String f = Integer.toString(1);
        System.out.println(f.getClass());
    }

}
