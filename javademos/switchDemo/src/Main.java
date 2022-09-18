public class Main {
    public static void main(String[] args) {
// ctrl+shift+alt+L düzenlemek için
        //eğer aynı olmasını istiyorsak alt alta yaz, örnek :
        // case 'B':
        //case 'C':
        //System...
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Harika,Geçti");
                break;
            case 'B':
                System.out.println("Güzel,Geçti");
                break;
            case 'C':
                System.out.println("İyi,Geçti");
                break;
            case 'D':
                System.out.println("Fena Değil,Geçti");
                break;
            case 'F':
                System.out.println("Maalesef,Kaldı");
                break;
            default:
                System.out.println("Geçersiz not girildi");
        }
    }
}