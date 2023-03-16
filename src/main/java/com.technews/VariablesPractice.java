public class VariablesPractice {
    public static void main(String[] args) {

        int a = 5;
        double b = 1.9;

        String c = "bananas";

        //create sum;
        double sum = a + b;

        //concat string with int
        String concat = a + c;

        // value of sum should be 6.9
        System.out.println(sum);

        // value of concat should be 5bananas
        System.out.println(concat);
    }

}
