import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Hava Kaç C° ?");
        heat = input.nextInt();
        
        if (heat<5) {
            System.out.println("Kayak Yapabilirsiniz");
        } else if (heat<25) {
            if (heat<=15) {
                System.out.println("Sineymaya Gidebilirsiniz");
            }
            if (heat >= 10) {
                System.out.println("Pikniğe gidebilirisinz.");
            }
        } else {
            System.out.println("Hava sıcaklığı denize gitmeye uygun");
        }
    }
} // Ali Eren KÖSE 22/02/2024 04:59
