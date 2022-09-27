public class variablesMain {
    public static void main(String[] args) {

       /* Systm.out.ptrintln("Öğrenci Sayım: 30");
        Systm.out.ptrintln("Öğrenci Sayım: 30");
        Systm.out.ptrintln("Öğrenci Sayım: 30");
        Systm.out.ptrintln("Öğrenci Sayım: 30"); */
        //herhangi bir değişimde veritabanından sürekli değiştirmek yerine değişkenlerden yararlanılır.

        int ogrenciSayisi = 32;
        String mesaj = "Öğrenci sayım :" ;
        System.out.println(mesaj + ogrenciSayisi);
        //camel casing. ilk kelime küçük harfle, sonraki büyük.
        System.out.println("Öğrenci Sayım: " + ogrenciSayisi);
        System.out.println("Öğrenci Sayım: " + ogrenciSayisi);
        System.out.println("Öğrenci Sayım: " + ogrenciSayisi);
        /* metinsel ve sayısal ifadeler. println ' e özel bir durum: değişkenlerden biri sayı biri string olduğu zaman
        diğerini de string kabul edip metinsel toplama yapar. sayısal olsaydı sayısal yapardı.  */
        //değişkenler çalıştığımız blokta tekrar tekrar kullanılabilmek ve bellekten tasarruf yapmak için.



    }
}
