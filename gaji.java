import java.util.Scanner;

public class gaji {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Awakmu kerjo pirang jam?");
            int jamKerja =  scanner.nextInt();

            System.out.println("awakmu tarif per jam piro?");
            int tarifPerJam = scanner.nextInt();

            int gajiBruto = jamKerja * tarifPerJam;

            double potongPajak = gajiBruto * 0.10;
            
            double gajiResik = gajiBruto - potongPajak;

            System.out.println("Gaji Bruto : " + gajiBruto);
            System.out.println("Potongan Pajak" + potongPajak);
            System.out.println("Gaji bersih " + gajiResik);
        }
    }
}
