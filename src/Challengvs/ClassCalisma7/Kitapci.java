package Challengvs.ClassCalisma7;

public class Kitapci {
    public static void main(String[] args) {
        // Book class yazınız.fields: name,publishYear,author.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.


        Book kitap1=new Book("a", 1990, "b");
        System.out.println("kitap1.name = " + kitap1.name);
        Book kitap2=new Book("c", 1990, "d");
        System.out.println("kitap2.author = " + kitap2.author);
        Book kitap3=new Book("e", 1990, "f");
        System.out.println("kitap3.publishYear = " + kitap3.publishYear);


    }
}
