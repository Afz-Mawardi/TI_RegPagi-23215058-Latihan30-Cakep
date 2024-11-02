package Tugas_Latihan;
/**
 *
 * @author user
 * NAMA     : Afsani Wahyu Mawardi
 * KELAS    : TI RegPagi
 * NIM      : 23215058
 * Deskripsi 
 * Progam   : Program ini untuk menampilkan Kejujuran Mahasiswa Dengan While, If-Else
 *            Cakep
 */
import java.util.Scanner;

public class Latihan_30 {
    
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\033[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\033[34m";
    public static final String CYAN = "\033[36m";
    public static final String PURPLE = "\033[35m";
    public static final String WHITE = "\033[37m";
    public static final String BLACK_BG = "\033[40m";
    public static final String RED_BG = "\033[41m";
    public static final String CYAN_BG = "\033[46m";
    public static final String YELLOW_BG = "\033[43m";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jawaban;

        while (true) {
            System.out.print(GREEN+"Kamu ngerjain sendiri"+PURPLE+" latihan 17 sampe 30 ini? "+BLACK+YELLOW_BG+"Jawab "+CYAN_BG+BLACK+"(Yoi/Gak): "+RESET);
            jawaban = scanner.nextLine();
            System.out.println("");

            if (jawaban.equalsIgnoreCase("Yoi")) {
                System.out.println(CYAN+BLACK_BG+"Cakep Bener. Good Job. Excellent"+RESET);
                break;
            } else if (jawaban.equalsIgnoreCase("Gak")) {
                System.out.println(GREEN+"Tetep cakep sih"+RESET); 
                System.out.println(RED+"Sing penting paham konsep nya yee"+RESET);
                System.out.println(BLUE+"Keep the code work dude"+RESET);
                break;
            } else {
                System.out.println("_-_-_-_-_-"+RED_BG+YELLOW+"Oii, Salah ketik Mang. Ketik Yoi atau Gak !"+RESET+"-_-_-_-_-_");
                System.out.println("");
            }
        }

        scanner.close();
    }
}
