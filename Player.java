import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        char player = 'X';
        while(true) {
            boolean playerValid = false;
            while(!playerValid) {
                try {
                    board.getBoard();
                    System.out.println();
                    System.out.println("Jogador " + player + " faça sua jogada (informe uma LINHA de 1-3): ");
                    if(!scanner.hasNextInt()) {
                        throw new ExceptionInput("Você precisa digitar um número.");
                    }
                    int row = scanner.nextInt();
                    System.out.println("Jogador " + player + " faça sua jogada(informe uma COLUNA de 1-3): ");
                    int column = scanner.nextInt();
                    System.out.println();

                    playerValid = board.play(row, column, player);

                } catch (ExceptionInput e) {
                    System.out.println(e.getMessage());
                    scanner.nextLine();
                } catch (ExceptionCustom e) {
                    System.out.println(e.getMessage());
                }
            }

            if(board.checkWinner(player) || board.checkDraw()) {
                board.getBoard();
                System.out.println();
                System.out.println("O jogador " + player + " ganhou o jogo.");
                System.out.println("Fim do jogo.");
                System.out.println("Novo jogo? (y, n): ");
                scanner.nextLine();
                char choice = scanner.nextLine().charAt(0);
                if(choice == 'y') {
                    board.newGame();
                } else {
                    break;
                }
            }
            player = (player == 'X') ? 'O' : 'X';

        }
    }
}
