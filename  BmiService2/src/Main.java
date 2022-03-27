public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int result = service.calculate( 2, 90);
        System.out.println("Индекс массы вашего тела=" + result);
    }
}
