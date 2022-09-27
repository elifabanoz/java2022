public class loopDemoMain {
    public static void main(String[] args) {
        //for
        // i=i+1
        //i+=2
        //sayaç,şart,sayacın kaçar kaçar artacağı
        for(int i=1;i<10;i++) {
            System.out.println(i);

            }
            System.out.println("For Döngüsü Bitti");

        //While
        int i=1;
        while (i<10) {
            System.out.println(i);
         //eğer bir şey belirlenmezse döngü sonsuza kadar devam eder. sayacın artışını belirle.
            i++;
            //tek sayılar için i+=2
        }
          System.out.println("While Döngüsü Bitti");

        //Do-While
        int j=20;
        if(j<10) {
            do{
                System.out.println("Loglandı.");

                System.out.println(j);
                j+=2;
            }while(j<10);
        }

        System.out.println("Do-While Döngüsü Bitti");
        //do-while döngüsünde şart sağlanmasa bile ilk belirlenen int değeri yazılır
        //while döngüsünde ise şart sağlanmazsa çalışmaz
        }


    }
