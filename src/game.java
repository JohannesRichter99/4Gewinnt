

public class game {

    String namePlayer1;
    String namePlayer2;

    public game(String namePlayer1, String namePlayer2){
        this.namePlayer1 = namePlayer1;
        this.namePlayer2 = namePlayer2;
    }

    public char[][] placeChip(char[][] spielfeld, int colum){
            for(int j = 8; j >= 0; j--){
                if(j == 8){
                    spielfeld[j + 1][colum] = '=';
                    break;
                }
                if(spielfeld[j][colum] == '='){
                    spielfeld[j + 1][colum] = '=';
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


