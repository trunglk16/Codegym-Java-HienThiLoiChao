public class helloPeople {
    public static void main(String[] args) {
        java.util.Scanner name = new java.util.Scanner(System.in);
        System.out.println("Nhap ten :  " );
        String person = name.nextLine();
        System.out.println("Hello "+person);
    }
}
