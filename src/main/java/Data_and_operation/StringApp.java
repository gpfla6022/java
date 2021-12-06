package Data_and_operation;

public class StringApp {

    public static void main(StringApp[] args) {

        // Character VS String
        System.out.println("Hello World"); // String : charater의 모임
        System.out.println('H'); // Character : 한 글자를 표현하는 데이터타입
        System.out.println("H");

        System.out.println("Hello "
                + "World");

        // new line
        System.out.println("Hello \nWorld");

        // escape
        System.out.println("Hello \"World\"");// Hello "World"

        // String Operation
        System.out.println("Hello World".length()); // 11
        System.out.println("Hello, [[[name]]] ... bye. ".replace("[[[name]]]", "duru"));
    }

}

