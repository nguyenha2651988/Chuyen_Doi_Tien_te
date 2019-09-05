import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so usd muon doi");
        int usd = scanner.nextInt();
        double tiGiaVnd = 23000;
        System.out.println("VND : " + usd * tiGiaVnd);
    }
}
