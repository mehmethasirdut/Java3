package Gun37.Odevleri.Soru2;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        TxtFile dosyatipi1=new TxtFile();
        PowerPointFile dosyatipi2=new PowerPointFile();
        DMGFile dosyatipi3=new DMGFile();
        ExeFile dosyatipi4=new ExeFile();

        ArrayList<IReadFile> dosyalama=new ArrayList<>();
        dosyalama.add(dosyatipi1);
        dosyalama.add(dosyatipi2);
        dosyalama.add(dosyatipi3);
        dosyalama.add(dosyatipi4);

        for (IReadFile dosya:dosyalama ) {
            System.out.println(dosya.getClass().getSimpleName());
            System.out.println("dosya.read() = " + dosya.read());
            System.out.println("dosya.close() = " + dosya.close());
            System.out.println("dosya.open() = " + dosya.open());
            System.out.println("dosya.save() = " + dosya.save());
            System.out.println("-----------------------");
            System.out.println();

        }
    }
}
