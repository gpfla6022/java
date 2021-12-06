package MyApp;

public class MethodApp {

    // 전역변수
    public  static double valueOfSupply;
    public static double vatRate;
    public static double expenseRate;


    public static void main(String[] args) {

        valueOfSupply = 10000.0;
        vatRate = 0.1;
        expenseRate = 0.3;

        //double vat = getVAT(valueOfSupply, vatRate);
        double vat = getVAT();
        double total = getTotal();
        double expense = getExpense();
        double income = getIncome();
        double dividend1 = getDividend1();
        double dividend2 = getDividend2();
        double dividend3 = getDividend3();

        print();

        //System.out.println("Value of supply : " + valueOfSupply);
        //System.out.println("VAT : " + vat);
        //System.out.println("Total : " + total);
        //System.out.println("Expense : " + expense);
        //System.out.println("Income : " + income);
        //System.out.println("Dividend 1 : " + dividend1);
        //System.out.println("Dividend 2 : " + dividend2);
        //System.out.println("Dividend 3 : " + dividend3);


        // 입력값 받기
        // double valueOfSupply = Double.parseDouble(args[0]);
    }

    private static void print() {
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("Dividend 1 : " + getDividend1());
        System.out.println("Dividend 2 : " + getDividend2());
        System.out.println("Dividend 3 : " + getDividend3());
    }

    private static double getDividend1() {
        return getIncome() * 0.5;
    }

    private static double getDividend2() {
        return getIncome() * 0.3;
    }

    private static double getDividend3() {
        return getIncome() * 0.2;
    }

    private static double getIncome() {
        return valueOfSupply - getExpense();
    }

    private static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    private static double getTotal() {
        return valueOfSupply + getVAT();
    }

    private static double getVAT() {
        return valueOfSupply * vatRate;
    }

}
