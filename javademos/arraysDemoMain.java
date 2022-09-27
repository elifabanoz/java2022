public class arraysDemoMain {
    public static void main(String[] args) {
       String ogrenci1= "Ayşenur";
       String ogrenci2= "Elif";
       String ogrenci3 = "İbrahim";

       System.out.println(ogrenci1);
       System.out.println(ogrenci2);
       System.out.println(ogrenci3);

       System.out.println("................................");

       String[] ogrenciler = new String[3];
       //sağdaki string kapalı parantez içindeki kaç elemandan oluşacağı
        // index ler 0 dan başlar.
        ogrenciler[0]="Ayşenur";
        ogrenciler[1]="Elif";
        ogrenciler[2]="İbrahim";

        for(int i=0; i<ogrenciler.length;i++) {
            //ogrenciler.length öğrencilerin eleman sayısı
            System.out.println(ogrenciler[i]);
        }
          System.out.println(".......................");

        for(String ogrenci:ogrenciler) {
            //ogrenciler dizisindeki her bir elemanı gez. ogrenci yerine herhangi bir şey yazılabilir
            System.out.println(ogrenci);
        }
    }

}
