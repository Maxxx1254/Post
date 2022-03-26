public class Main {
    public static void main(String[] args) {
        BmiService index = new BmiService();
        int result = index.calculate( 90, 2);
        System.out.print("Ваш индекс массы тела=" + result);
    }
}
