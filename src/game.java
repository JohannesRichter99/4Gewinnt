
public class game {
    String namePlayer1;
    String namePlayer2;

    public game(String namePlayer1, String namePlayer2){
        this.namePlayer1 = namePlayer1;
        this.namePlayer2 = namePlayer2;
    }

    public char[][] placeChip(char[][] spielfeld, int colum, char playerSymbol) {

        if(playerSymbol == '1'){
            for (int i = spielfeld.length - 1; i >= 0; i--) {
                if (spielfeld[i][colum] == 'o' || spielfeld[i][colum] == playerSymbol) {
                    spielfeld[i][colum] = playerSymbol;
                    break;
                }
            }
        }
        if(playerSymbol == '2'){
            for (int i = spielfeld.length - 1; i >= 0; i--) {
                if (spielfeld[i][colum] == 'o' || spielfeld[i][colum] == playerSymbol) {
                    spielfeld[i][colum] = playerSymbol;
                    break;
                }
            }
        }


        return spielfeld;
    }

    public void render(char[][] spielfeld){
        for(int i = 0; i < spielfeld.length; i++){
            for(int j = 0; j < 10; j++){
                if(j == 9){
                    System.out.print(spielfeld[i][j] + "\n");
                }
                else{
                    System.out.print(spielfeld[i][j] + "  ");

                }

            }
        }
    }
    //public String getCurrentPlayer(){

    //}
    //public boolean checkWinCondition(){

    //}
}


