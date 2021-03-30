import java.util.Random;
import java.util.Scanner;

public class GameXo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int enterPosition = 1;
        String[][] gamePad = new String[3][3];
        for (int i = 2; i >= 0; i--) {
            for (int k = 0; k < gamePad.length; k++) {
                gamePad[i][k] = "" + enterPosition;
                enterPosition++;
            }
        }
        System.out.println("Нажмите 1 если хотите играть за 'X' или 2 если хотите играть за 'O' -------> (Игрок 'X' ходит первым): ");
        int choiceInt, computerStep;
        char player, computer;
        for (; ; ) {
            String choice = sc.nextLine();
            try {
                choiceInt = Integer.parseInt(choice);
                if (choiceInt == 1) {
                    computerStep = 2;
                    player = 'X';
                    computer = 'O';
                    break;
                } else if (choiceInt == 2) {
                    computerStep = 1;
                    computer = 'X';
                    player = 'O';
                    break;
                } else {
                    System.out.println("Это точно не 1 и не 2, попробуйте еще раз: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Это не похоже на 1 или 2, попробуйте еще раз: ");
            }
        }
        int playerStep, i, j;
        int countStep = 0;
        for (; ; ) {
            System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
            System.out.println("_______________________");
            System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
            System.out.println("_______________________");
            System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
            if ((gamePad[0][0].equals("X") && gamePad[0][1].equals("X") && gamePad[0][2].equals("X")) ||
                    (gamePad[1][0].equals("X") && gamePad[1][1].equals("X") && gamePad[1][2].equals("X")) ||
                    (gamePad[2][0].equals("X") && gamePad[2][1].equals("X") && gamePad[2][2].equals("X")) ||
                    (gamePad[0][0].equals("X") && gamePad[1][0].equals("X") && gamePad[2][0].equals("X")) ||
                    (gamePad[0][1].equals("X") && gamePad[1][1].equals("X") && gamePad[2][1].equals("X")) ||
                    (gamePad[0][2].equals("X") && gamePad[1][2].equals("X") && gamePad[2][2].equals("X")) ||
                    (gamePad[0][0].equals("X") && gamePad[1][1].equals("X") && gamePad[2][2].equals("X")) ||
                    (gamePad[0][2].equals("X") && gamePad[1][1].equals("X") && gamePad[2][0].equals("X"))) {
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            } else if ((gamePad[0][0].equals("O") && gamePad[0][1].equals("O") && gamePad[0][2].equals("O")) ||
                    (gamePad[1][0].equals("O") && gamePad[1][1].equals("O") && gamePad[1][2].equals("O")) ||
                    (gamePad[2][0].equals("O") && gamePad[2][1].equals("O") && gamePad[2][2].equals("O")) ||
                    (gamePad[0][0].equals("O") && gamePad[1][0].equals("O") && gamePad[2][0].equals("O")) ||
                    (gamePad[0][1].equals("O") && gamePad[1][1].equals("O") && gamePad[2][1].equals("O")) ||
                    (gamePad[0][2].equals("O") && gamePad[1][2].equals("O") && gamePad[2][2].equals("O")) ||
                    (gamePad[0][0].equals("O") && gamePad[1][1].equals("O") && gamePad[2][2].equals("O")) ||
                    (gamePad[0][2].equals("O") && gamePad[1][1].equals("O") && gamePad[2][0].equals("O"))) {
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            } else if (countStep == 9) {
                System.out.println("<^.^> *** Вы сыграли в ничью! *** <^.^>");
                break;
            }
            if (choiceInt % 2 == 0 && computerStep % 2 == 1) {
                System.out.println("Ход игрока " + computer + ":");
                for (; ; ) {
                    i = rand.nextInt(3);
                    j = rand.nextInt(3);
                    if (!gamePad[i][j].equals("X") && !gamePad[i][j].equals("O")) {
                        gamePad[i][j] = "" + computer;
                        choiceInt++;
                        computerStep++;
                        break;
                    }
                }
            } else if (choiceInt % 2 == 1 && computerStep % 2 == 0) {
                System.out.println("Ход игрока " + player + ":");
                try {
                    String playerStepStr = sc.nextLine();
                    playerStep = Integer.parseInt(playerStepStr);
                    if (playerStep > 0 && playerStep < 10) {
                        switch (playerStep) {
                            case 1:
                                if (gamePad[2][0].equals("O")) {
                                    System.out.println("Клетка занята другим игроком! ");
                                } else if (gamePad[2][0].equals("X")) {
                                    System.out.println("Вы повторились, введите еще раз! ");
                                } else {
                                    gamePad[2][0] = "" + player;
                                    choiceInt++;
                                    computerStep++;
                                }
                                break;
                            case 2:
                                if (gamePad[2][1].equals("O")) {
                                    System.out.println("Клетка занята другим игроком! ");
                                } else if (gamePad[2][1].equals("X")) {
                                    System.out.println("Вы повторились, введите еще раз! ");
                                } else {
                                    gamePad[2][1] = "" + player;
                                    choiceInt++;
                                    computerStep++;
                                }
                                break;
                            case 3:
                                if (gamePad[2][2].equals("O")) {
                                    System.out.println("Клетка занята другим игроком! ");
                                } else if (gamePad[2][2].equals("X")) {
                                    System.out.println("Вы повторились, введите еще раз! ");
                                } else {
                                    gamePad[2][2] = "" + player;
                                    choiceInt++;
                                    computerStep++;
                                }
                                break;
                            case 4:
                                if (gamePad[1][0].equals("O")) {
                                    System.out.println("Клетка занята другим игроком! ");
                                } else if (gamePad[1][0].equals("X")) {
                                    System.out.println("Вы повторились, введите еще раз! ");
                                } else {
                                    gamePad[1][0] = "" + player;
                                    choiceInt++;
                                    computerStep++;
                                }
                                break;
                            case 5:
                                if (gamePad[1][1].equals("O")) {
                                    System.out.println("Клетка занята другим игроком! ");
                                } else if (gamePad[1][1].equals("X")) {
                                    System.out.println("Вы повторились, введите еще раз! ");
                                } else {
                                    gamePad[1][1] = "" + player;
                                    choiceInt++;
                                    computerStep++;
                                }
                                break;
                            case 6:
                                if (gamePad[1][2].equals("O")) {
                                    System.out.println("Клетка занята другим игроком! ");
                                } else if (gamePad[1][2].equals("X")) {
                                    System.out.println("Вы повторились, введите еще раз! ");
                                } else {
                                    gamePad[1][2] = "" + player;
                                    choiceInt++;
                                    computerStep++;
                                }
                                break;
                            case 7:
                                if (gamePad[0][0].equals("O")) {
                                    System.out.println("Клетка занята другим игроком! ");
                                } else if (gamePad[0][0].equals("X")) {
                                    System.out.println("Вы повторились, введите еще раз! ");
                                } else {
                                    gamePad[0][0] = "" + player;
                                    choiceInt++;
                                    computerStep++;
                                }
                                break;
                            case 8:
                                if (gamePad[0][1].equals("O")) {
                                    System.out.println("Клетка занята другим игроком! ");
                                } else if (gamePad[0][1].equals("X")) {
                                    System.out.println("Вы повторились, введите еще раз! ");
                                } else {
                                    gamePad[0][1] = "" + player;
                                    choiceInt++;
                                    computerStep++;
                                }
                                break;
                            case 9:
                                if (gamePad[0][2].equals("O")) {
                                    System.out.println("Клетка занята другим игроком! ");
                                } else if (gamePad[0][2].equals("X")) {
                                    System.out.println("Вы повторились, введите еще раз! ");
                                } else {
                                    gamePad[0][2] = "" + player;
                                    choiceInt++;
                                    computerStep++;
                                }
                                break;
                        }
                    } else {
                        System.out.println("Это не похоже на цифры от 1 до 9, попробуйте ввести еще раз: ");
                        countStep--;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Это не похоже на цифры, попробуйте ввести еще раз: ");
                    countStep--;
                }
            }
            countStep++;
        }
    }
}

