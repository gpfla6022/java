package MyApp;

public class AccountingArrayLoopApp {

    public static void main(String[] args) {

        // 배열
        double valueOfSupply = 10000.0;
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;

        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);

        //double rate1 = 0.5;
        //double rate2 = 0.3;
        //double rate3 = 0.2;

        double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        double dividend1 = income * dividendRates[0];
        double dividend2 = income * dividendRates[1];
        double dividend3 = income * dividendRates[2];

        // 반복문 (만일 동업자가 많아 배당을 더 해줘야 한다면??)
        //System.out.println("Dividend 1 : " + dividend1);
        //System.out.println("Dividend 2 : " + dividend2);
        //System.out.println("Dividend 3 : " + dividend3);

        int i = 0;
        while(i < dividendRates.length){
            System.out.println("Dividend : " + (income + dividendRates[i]));
            i = i + 1;
        }


        // 입력값 받기
        // double valueOfSupply = Double.parseDouble(args[0]);
    }

}
