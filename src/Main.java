import java.util.Scanner;

public class Main {
    static String[] startGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------4-GEWINNT---------");
        System.out.println("1. Spiel starten");
        System.out.println("2. Spiel beenden");
        System.out.println("Bitte gib die enstprechende Nummer ein: ");
        int input = sc.nextInt();
        sc.nextLine();
        String[] namen = new String[2];
        switch (input){
            case 1:
                System.out.println("----Herzlich Willkommen zum Spiel 4 Gewinnt !-----");
                System.out.println("Bitte gib den Namen des 1. Spielers ein:  ");
                String name1 = sc.nextLine();
                System.out.println("Hi " + name1 + "! Bitte gib nun den Namen deines Gegners ein! ");
                String name2 = sc.nextLine();

                namen[0] = name1;
                namen[1] = name2;
                break;
            case 2:
                System.out.println("Spiel beendet");
                System.exit(0);
            default:
                System.out.println("Bitte gib ein gültiges Zeichen ein!");
        }
        return namen;
    }

    public static void main(String[] args) {
        boolean endOfGame = false;
        char playerSymbol1 = '1';
        char playerSombol2 = '2';

        //Spielfeld erstellen
        char[][] spielfeld = new char[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                spielfeld[i][j] = 'o';
            }
        }
        //Spiel initialisiern
        String[] namen = startGame();
        game game = new game(namen[0],namen[1]);
        Scanner scanner = new Scanner(System.in);

        while(!endOfGame){
            //erster Spieler
            System.out.println("Hey " + namen[0] + ", in welche Spalte soll dein Chip? ");
            int input = scanner.nextInt();
            spielfeld = game.placeChip(spielfeld,input, playerSymbol1);
            game.render(spielfeld);
            //checkWin()
            //zweiter Spieler
            System.out.println("Hey " + namen[1] + ", in welche Spalte soll dein Chip? ");
            int input1 = scanner.nextInt();
            spielfeld = game.placeChip(spielfeld,input1,playerSombol2);
            game.render(spielfeld);
            //checkWin()


        }





    }
}