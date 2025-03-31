public class Board {

    private char[][] board;

    public Board() {
        this.newGame();
    }

    private static final int[][] winningCombinations = {
            {0, 0, 0, 1, 0, 2}, // Linha 1 board[0][0] board[0][1] board[0][2]
            {1, 0, 1, 1, 1, 2}, // Linha 2 board[1][0] board[1][1] board[1][2]
            {2, 0, 2, 1, 2, 2}, // Linha 3 board[2][0] board[2][1] board[2][2]
            {0, 0, 1, 0, 2, 0}, // Coluna 1 board[0][0] board[1][0] board[2][0]
            {0, 1, 1, 1, 2, 1}, // Coluna 2 board[0][1] board[1][1] board[2][1]
            {0, 2, 1, 2, 2, 2}, // Coluna 3 board[0][2] board[1][2] board[2][2]
            {0, 0, 1, 1, 2, 2}, // Diagonal principal board[0][0] board[1][1] board[2][2]
            {0, 2, 1, 1, 2, 0}  // Diagonal secundária board[0][2] board[1][1] board[2][0]
    };

    public void getBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {
                System.out.println("---|---|---");
            }
        }
    }

    public void setNewSymbol(int row,int column,char symbol) {
        this.board[row][column] = symbol;
    }

    public boolean play(int row, int column, char symbol) {
        row -= 1;
        column -= 1;
        try {
            if(row >= 0 && row < 3 && column >= 0 && column < 3 && board[row][column] == ' ') {
                this.setNewSymbol(row, column, symbol);
                return true;
            } else {
                throw new ExceptionCustom("Posição invalida Tente novamente");
            }
        } catch (ExceptionCustom e) {
            System.out.println(e.getMessage());
        } catch (ExceptionInput e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public void newGame() {
        board = new char[][] {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
    }

    public boolean checkDraw() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWinner(char symbol) {
        for(int[] win : winningCombinations) {
            if(board[win[0]][win[1]] == symbol && board[win[2]][win[3]] == symbol && board[win[4]][win[5]] == symbol) {
                return true;
            }
        }
        return false;
    }
}