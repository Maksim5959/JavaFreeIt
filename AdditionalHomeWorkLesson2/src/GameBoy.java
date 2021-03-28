import java.util.Scanner;

public class GameBoy {

    public static void main(String[] args) {
        int enterPosition = 1;
        String[][] gamePad = new String[3][3];
        for (int i = 2; i >= 0; i--) {
            for (int k = 0; k < gamePad.length; k++) {
                gamePad[i][k] = "" + enterPosition;
                enterPosition++;
            }
        }
        Scanner sc = new Scanner(System.in);
        int playersStep = 1;
        char player;
        int playerPosition;
        for (;;) {
            System.out.println("       |       |       ");
            System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
            System.out.println("       |       |       ");
            System.out.println("_______________________");
            System.out.println("       |       |       ");
            System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
            System.out.println("       |       |       ");
            System.out.println("_______________________");
            System.out.println("       |       |       ");
            System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
            System.out.println("       |       |       ");
            if (playersStep % 2 != 0) {
                player = 'X';
                System.out.println("Ход игрока " + player + ":");

            } else {
                player = 'O';
                System.out.println("Ход игрока " + player + ":");
            }
            boolean stop = true;
            if (player == 'X') {
                for (;stop;) {
                    String playerPositionStr = sc.nextLine();
                    try {
                        playerPosition = Integer.parseInt(playerPositionStr);
                        if (playerPosition > 0 && playerPosition < 10) {
                            switch (playerPosition) {
                                case 1:
                                    if (gamePad [2] [0].equals("O")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [2] [0].equals("X")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[2][0] = "" + player;
                                        stop = false;
                                        playersStep++;
                                    }
                                    break;
                                case 2:
                                    if (gamePad [2] [1].equals("O")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [2] [1].equals("X")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[2][1] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                                case 3:
                                    if (gamePad [2] [2].equals("O")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [2] [2].equals("X")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[2][2] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                                case 4:
                                    if (gamePad [1] [0].equals("O")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [1] [0].equals("X")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[1][0] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                                case 5:
                                    if (gamePad [1] [1].equals("O")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [1] [1].equals("X")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[1][1] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                                case 6:
                                    if (gamePad [1] [2].equals("O")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [1] [2].equals("X")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[1][2] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                                case 7:
                                    if (gamePad [0] [0].equals("O")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [0] [0].equals("X")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[0][0] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                                case 8:
                                    if (gamePad [0] [1].equals("O")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [0] [1].equals("X")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[0][1] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                                case 9:
                                    if (gamePad [0] [2].equals("O")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [0] [2].equals("X")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[0][2] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                            }
                        } else {
                            System.out.println("Вы ввели неверное число, попробуйте еще раз!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный формат! Попробуйте еще раз! ");
                    }
                }
            }
            if (player == 'O') {
                for (;stop;) {
                    String playerPositionStr = sc.nextLine();
                    try {
                        playerPosition = Integer.parseInt(playerPositionStr);
                        if (playerPosition > 0 && playerPosition < 10) {
                            switch (playerPosition) {
                                case 1:
                                    if (gamePad [2] [0].equals("X")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [2] [0].equals("O")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[2][0] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                                case 2:
                                    if (gamePad [2] [1].equals("X")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [2] [1].equals("O")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[2][1] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                                case 3:
                                    if (gamePad [2] [2].equals("X")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [2] [2].equals("O")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[2][2] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                                case 4:
                                    if (gamePad [1] [0].equals("X")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [1] [0].equals("O")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[1][0] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                                case 5:
                                    if (gamePad [1] [1].equals("X")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [1] [1].equals("O")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[1][1] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                                case 6:
                                    if (gamePad [1] [2].equals("X")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [1] [2].equals("O")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[1][2] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                                case 7:
                                    if (gamePad [0] [0].equals("X")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [0] [0].equals("O")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[0][0] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                                case 8:
                                    if (gamePad [0] [1].equals("X")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [0] [1].equals("O")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[0][1] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                                case 9:
                                    if (gamePad [0] [2].equals("X")){
                                        System.out.println("Клетка Занята другим игроком! ");
                                    } else if (gamePad [0] [2].equals("O")){
                                        System.out.println("Вы повторились, введите еще раз! ");
                                    } else {
                                        gamePad[0][2] = "" + player;
                                        playersStep++;
                                        stop = false;
                                    }
                                    break;
                            }
                        } else {
                            System.out.println("Вы ввели неверное число, попробуйте еще раз!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный формат! Попробуйте еще раз! ");
                    }
                }
            }
            if (gamePad [0] [0].equals("X") && gamePad [0] [1].equals("X") && gamePad [0] [2].equals("X")){
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad [1] [0].equals("X") && gamePad [1] [1].equals("X") && gamePad [1] [2].equals("X")) {
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad [2] [0].equals("X") && gamePad [2] [1].equals("X") && gamePad [2] [2].equals("X")){
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad [0] [0].equals("X") && gamePad [1] [0].equals("X") && gamePad [2] [0].equals("X")) {
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad [0] [1].equals("X") && gamePad [1] [1].equals("X") && gamePad [2] [1].equals("X")) {
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad [0] [2].equals("X") && gamePad [1] [2].equals("X") && gamePad [2] [2].equals("X")) {
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad [0] [0].equals("X") && gamePad [1] [1].equals("X") && gamePad [2] [2].equals("X")) {
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            } else  if (gamePad [0] [2].equals("X") && gamePad [1] [1].equals("X") && gamePad [2] [0].equals("X")) {
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            }
            if (gamePad [0] [0].equals("O") && gamePad [0] [1].equals("O") && gamePad [0] [2].equals("O")){
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad [1] [0].equals("O") && gamePad [1] [1].equals("O") && gamePad [1] [2].equals("O")) {
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad [2] [0].equals("O") && gamePad [2] [1].equals("O") && gamePad [2] [2].equals("O")){
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad [0] [0].equals("O") && gamePad [1] [0].equals("O") && gamePad [2] [0].equals("O")) {
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad [0] [1].equals("O") && gamePad [1] [1].equals("O") && gamePad [2] [1].equals("O")) {
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad [0] [2].equals("O") && gamePad [1] [2].equals("O") && gamePad [2] [2].equals("O")) {
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad [0] [0].equals("O") && gamePad [1] [1].equals("O") && gamePad [2] [2].equals("O")) {
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            } else  if (gamePad [0] [2].equals("O") && gamePad [1] [1].equals("O") && gamePad [2] [0].equals("O")) {
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            }
            int countFull;
            int i;
            for (i = 0, countFull = 0;i < gamePad.length;i++){
                for (int k = 0;k < gamePad.length;k++){
                    if (gamePad [i] [k].equals("1")){
                        countFull++;
                    } else if (gamePad [i] [k].equals("2")){
                        countFull++;
                    } else if (gamePad [i] [k].equals("3")){
                        countFull++;
                    } else if (gamePad [i] [k].equals("4")){
                        countFull++;
                    } else if (gamePad [i] [k].equals("5")){
                        countFull++;
                    } else if (gamePad [i] [k].equals("6")){
                        countFull++;
                    } else if (gamePad [i] [k].equals("7")){
                        countFull++;
                    } else if (gamePad [i] [k].equals("8")){
                        countFull++;
                    } else if (gamePad [i] [k].equals("9")){
                        countFull++;
                    }
                }
            }
            if (countFull == 0){
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[0][0] + "   |" + "   " + gamePad[0][1] + "   |" + "   " + gamePad[0][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[1][0] + "   |" + "   " + gamePad[1][1] + "   |" + "   " + gamePad[1][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("_______________________");
                System.out.println("       |       |       ");
                System.out.println("   " + gamePad[2][0] + "   |" + "   " + gamePad[2][1] + "   |" + "   " + gamePad[2][2] + "   ");
                System.out.println("       |       |       ");
                System.out.println("<^.^> *** Вы сыграли в ничью! *** <^.^>");
                break;
            }
        }
    }
}
