package MyApp;

public class AccountingIfUnder10000App {

    public static void main(String[] args) {

        System.out.println("Value of supply : " + 10000.0 );
        System.out.println("VAT : " + (10000.0*0.1));
        System.out.println("Total : " + (10000.0 + 10000.0*0.1));
        System.out.println("Expense : " + (10000.0*0.3));
        System.out.println("Income : " + (10000.0 - 10000.0*0.3)); // 이익(번돈)
        System.out.println("Dividend : " + (10000.0 - 10000.0*0.3) * 0.5);

        // 변수도입
        double valueOfSupply = 10000.0;
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        double dividend1 = income * 1;
        double dividend2 = income * 0;
        double dividend3 = income * 0;

        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        System.out.println("Dividend 1 : " + dividend1);
        System.out.println("Dividend 2 : " + dividend2);
        System.out.println("Dividend 3 : " + dividend3);


        // 입력값 받기
        // double valueOfSupply = Double.parseDouble(args[0]);
    }

}
