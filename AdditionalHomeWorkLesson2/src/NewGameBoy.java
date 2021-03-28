import java.util.Random;
import java.util.Scanner;

public class NewGameBoy {

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
        int choiceInt;
        int computerStep;
        char player;
        char computer;
        int intelligence;
        for (; ; ) {
            String choice = sc.nextLine();
            try {
                choiceInt = Integer.parseInt(choice);
                if (choiceInt == 1) {
                    computerStep = 2;
                    intelligence = 2;
                    player = 'X';
                    computer = 'O';
                    break;
                } else if (choiceInt == 2) {
                    computerStep = 1;
                    intelligence = 1;
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
        int playerStep = 0;
        int i = 0;
        int j = 0;
        int countStep = 0;
        for (; ; ) {
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
            if (gamePad[0][0].equals("X") && gamePad[0][1].equals("X") && gamePad[0][2].equals("X")) {
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad[1][0].equals("X") && gamePad[1][1].equals("X") && gamePad[1][2].equals("X")) {
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad[2][0].equals("X") && gamePad[2][1].equals("X") && gamePad[2][2].equals("X")) {
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad[0][0].equals("X") && gamePad[1][0].equals("X") && gamePad[2][0].equals("X")) {
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad[0][1].equals("X") && gamePad[1][1].equals("X") && gamePad[2][1].equals("X")) {
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad[0][2].equals("X") && gamePad[1][2].equals("X") && gamePad[2][2].equals("X")) {
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad[0][0].equals("X") && gamePad[1][1].equals("X") && gamePad[2][2].equals("X")) {
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad[0][2].equals("X") && gamePad[1][1].equals("X") && gamePad[2][0].equals("X")) {
                System.out.println(">(^.^)< *** PLAYER 'X' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad[0][0].equals("O") && gamePad[0][1].equals("O") && gamePad[0][2].equals("O")) {
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad[1][0].equals("O") && gamePad[1][1].equals("O") && gamePad[1][2].equals("O")) {
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad[2][0].equals("O") && gamePad[2][1].equals("O") && gamePad[2][2].equals("O")) {
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad[0][0].equals("O") && gamePad[1][0].equals("O") && gamePad[2][0].equals("O")) {
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad[0][1].equals("O") && gamePad[1][1].equals("O") && gamePad[2][1].equals("O")) {
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad[0][2].equals("O") && gamePad[1][2].equals("O") && gamePad[2][2].equals("O")) {
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad[0][0].equals("O") && gamePad[1][1].equals("O") && gamePad[2][2].equals("O")) {
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            } else if (gamePad[0][2].equals("O") && gamePad[1][1].equals("O") && gamePad[2][0].equals("O")) {
                System.out.println(">(^.^)< *** PLAYER 'O' WIN!!! *** >(^.^)<");
                break;
            } else if (countStep == 9) {
                System.out.println("<^.^> *** Вы сыграли в ничью! *** <^.^>");
                break;
            }
            if (choiceInt % 2 == 0 && computerStep % 2 == 1) {
                System.out.println("Ход МЕГАМОЗГА:");
                if (intelligence == 1 && computerStep == 1) {
                    //Первый ход (компьютер ходит первым)
                    for (; ; ) {
                        i = rand.nextInt(3);
                        j = rand.nextInt(3);
                        if (i != 1 && j != 1) {
                            gamePad[i][j] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        }
                    }
                    //Второй ход (компьютер ходит первым)
                } else if (intelligence == 1 && computerStep == 3 && i == 0 && j == 0) {
                    for (; ; ) {
                        if (gamePad[0][1].equals("O") || gamePad[0][2].equals("O") || gamePad[1][2].equals("O")) {
                            gamePad[2][0] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[1][0].equals("O") || gamePad[2][0].equals("O") || gamePad[2][1].equals("O")) {
                            gamePad[0][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[2][2].equals("O")) {
                            for (; ; ) {
                                i = rand.nextInt(3);
                                j = rand.nextInt(3);
                                if (i == 2 && j == 2) {
                                    continue;
                                } else if (i == 0 && j == 0) {
                                    continue;
                                } else if (i != 1 && j != 1) {
                                    gamePad[i][j] = "" + computer;
                                    choiceInt++;
                                    computerStep++;
                                    break;
                                }
                            }
                            break;
                        } else if (gamePad[1][1].equals("O")) {
                            gamePad[2][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 3 && i == 2 && j == 0) {
                    for (; ; ) {
                        if (gamePad[0][0].equals("O") || gamePad[0][1].equals("O") || gamePad[1][0].equals("O")) {
                            gamePad[2][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[1][2].equals("O") || gamePad[2][2].equals("O") || gamePad[2][1].equals("O")) {
                            gamePad[0][0] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[0][2].equals("O")) {
                            for (; ; ) {
                                i = rand.nextInt(3);
                                j = rand.nextInt(3);
                                if (i == 0 && j == 2) {
                                    continue;
                                } else if (i == 2 && j == 0) {
                                    continue;
                                } else if (i != 1 && j != 1) {
                                    gamePad[i][j] = "" + computer;
                                    choiceInt++;
                                    computerStep++;
                                    break;
                                }
                            }
                            break;
                        } else if (gamePad[1][1].equals("O")) {
                            gamePad[0][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 3 && i == 0 && j == 2) {
                    for (; ; ) {
                        if (gamePad[0][0].equals("O") || gamePad[0][1].equals("O") || gamePad[1][0].equals("O")) {
                            gamePad[2][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[1][2].equals("O") || gamePad[2][2].equals("O") || gamePad[2][1].equals("O")) {
                            gamePad[0][0] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[2][0].equals("O")) {
                            for (; ; ) {
                                i = rand.nextInt(3);
                                j = rand.nextInt(3);
                                if (i == 0 && j == 2) {
                                    continue;
                                } else if (i == 2 && j == 0) {
                                    continue;
                                } else if (i != 1 && j != 1) {
                                    gamePad[i][j] = "" + computer;
                                    choiceInt++;
                                    computerStep++;
                                    break;
                                }
                            }
                            break;
                        } else if (gamePad[1][1].equals("O")) {
                            gamePad[2][0] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 3 && i == 2 && j == 2) {
                    for (; ; ) {
                        if (gamePad[0][1].equals("O") || gamePad[0][2].equals("O") || gamePad[1][2].equals("O")) {
                            gamePad[2][0] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[1][0].equals("O") || gamePad[2][0].equals("O") || gamePad[2][1].equals("O")) {
                            gamePad[0][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[0][0].equals("O")) {
                            for (; ; ) {
                                i = rand.nextInt(3);
                                j = rand.nextInt(3);
                                if (i == 2 && j == 2) {
                                    continue;
                                } else if (i == 0 && j == 0) {
                                    continue;
                                } else if (i != 1 && j != 1) {
                                    gamePad[i][j] = "" + computer;
                                    choiceInt++;
                                    computerStep++;
                                    break;
                                }
                            }
                            break;
                        } else if (gamePad[1][1].equals("O")) {
                            gamePad[0][0] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        }
                    }
                    // Третий ход (компьютер ходит первым)
                } else if (intelligence == 1 && computerStep == 5 && gamePad[0][0].equals("X") && gamePad[0][2].equals("X")) {
                    for (; ; ) {
                        if (gamePad[0][1].equals("8")) {
                            gamePad[0][1] = "" + computer;
                            break;
                        } else if (gamePad[0][1].equals("O") && gamePad[2][1].equals("O")) {
                            gamePad[1][1] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[0][1].equals("O") && gamePad[2][2].equals("O")) {
                            gamePad[2][0] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[0][1].equals("O") && gamePad[2][0].equals("O")) {
                            gamePad[2][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[0][1].equals("O") && gamePad[1][0].equals("O")) {
                            gamePad[1][1] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[0][1].equals("O") && gamePad[1][2].equals("O")) {
                            gamePad[1][1] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 5 && gamePad[2][0].equals("X") && gamePad[2][2].equals("X")) {
                    for (; ; ) {
                        if (gamePad[2][1].equals("2")) {
                            gamePad[2][1] = "" + computer;
                            break;
                        } else if (gamePad[2][1].equals("O") && gamePad[0][1].equals("O")) {
                            gamePad[1][1] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[2][1].equals("O") && gamePad[0][0].equals("O")) {
                            gamePad[0][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[2][1].equals("O") && gamePad[0][2].equals("O")) {
                            gamePad[0][0] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[2][1].equals("O") && gamePad[1][0].equals("O")) {
                            gamePad[1][1] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[2][1].equals("O") && gamePad[1][2].equals("O")) {
                            gamePad[1][1] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 5 && gamePad[0][2].equals("X") && gamePad[2][2].equals("X")) {
                    for (; ; ) {
                        if (gamePad[1][2].equals("6")) {
                            gamePad[1][2] = "" + computer;
                            break;
                        } else if (gamePad[1][2].equals("O") && gamePad[1][0].equals("O")) {
                            gamePad[1][1] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[1][2].equals("O") && gamePad[0][0].equals("O")) {
                            gamePad[0][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[1][2].equals("O") && gamePad[2][0].equals("O")) {
                            gamePad[0][0] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[1][2].equals("O") && gamePad[0][1].equals("O")) {
                            gamePad[1][1] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[1][2].equals("O") && gamePad[2][1].equals("O")) {
                            gamePad[1][1] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 5 && gamePad[0][0].equals("X") && gamePad[2][0].equals("X")) {
                    for (; ; ) {
                        if (gamePad[1][0].equals("4")) {
                            gamePad[1][0] = "" + computer;
                            break;
                        } else if (gamePad[1][0].equals("O") && gamePad[1][2].equals("O")) {
                            gamePad[1][1] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[1][0].equals("O") && gamePad[2][2].equals("O")) {
                            gamePad[0][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[1][0].equals("O") && gamePad[0][2].equals("O")) {
                            gamePad[2][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[1][0].equals("O") && gamePad[0][1].equals("O")) {
                            gamePad[1][1] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[1][0].equals("O") && gamePad[2][1].equals("O")) {
                            gamePad[1][1] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 5 && gamePad[0][0].equals("X") && gamePad[2][2].equals("X")) {
                    for (; ; ) {
                        if (gamePad[0][2].equals("O")) {
                            gamePad[2][0] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[2][0].equals("O")) {
                            gamePad[0][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[0][1].equals("O")) {
                            gamePad[2][1] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[2][1].equals("O")) {
                            gamePad[0][1] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[1][0].equals("O")) {
                            gamePad[1][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[1][2].equals("O")) {
                            gamePad[1][0] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 5 && gamePad[0][2].equals("X") && gamePad[2][0].equals("X")) {
                    for (; ; ) {
                        if (gamePad[0][0].equals("O")) {
                            gamePad[2][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[2][2].equals("O")) {
                            gamePad[0][0] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[0][1].equals("O")) {
                            gamePad[2][1] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[2][1].equals("O")) {
                            gamePad[0][1] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[1][0].equals("O")) {
                            gamePad[1][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[1][2].equals("O")) {
                            gamePad[1][0] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        }
                    }
                    // Четвертый ход (компьютер ходит первым)
                } else if (intelligence == 1 && computerStep == 7 && gamePad[0][0].equals("X") && gamePad[0][2].equals("X") && gamePad[1][1].equals("X")) {
                    for (; ; ) {
                        if (gamePad[2][0].equals("1")) {
                            gamePad[2][0] = "" + computer;
                            break;
                        } else if (gamePad[2][2].equals("3")) {
                            gamePad[2][2] = "" + computer;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 7 && gamePad[2][0].equals("X") && gamePad[2][2].equals("X") && gamePad[1][1].equals("X")) {
                    for (; ; ) {
                        if (gamePad[0][0].equals("7")) {
                            gamePad[0][0] = "" + computer;
                            break;
                        } else if (gamePad[0][2].equals("9")) {
                            gamePad[0][2] = "" + computer;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 7 && gamePad[0][2].equals("X") && gamePad[2][2].equals("X") && gamePad[1][1].equals("X")) {
                    for (; ; ) {
                        if (gamePad[0][0].equals("7")) {
                            gamePad[0][0] = "" + computer;
                            break;
                        } else if (gamePad[2][0].equals("1")) {
                            gamePad[2][0] = "" + computer;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 7 && gamePad[0][0].equals("X") && gamePad[2][0].equals("X") && gamePad[1][1].equals("X")) {
                    for (; ; ) {
                        if (gamePad[0][2].equals("9")) {
                            gamePad[0][2] = "" + computer;
                            break;
                        } else if (gamePad[2][2].equals("3")) {
                            gamePad[2][2] = "" + computer;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 7 && gamePad[0][0].equals("X") && gamePad[0][2].equals("X") && gamePad[2][2].equals("X")) {
                    for (; ; ) {
                        if (gamePad[0][1].equals("8")) {
                            gamePad[0][1] = "" + computer;
                            break;
                        } else if (gamePad[1][2].equals("6")) {
                            gamePad[1][2] = "" + computer;
                            break;
                        } else {
                            gamePad[1][1] = "" + computer;
                            break;
                        }
                    }

                } else if (intelligence == 1 && computerStep == 7 && gamePad[0][0].equals("X") && gamePad[0][2].equals("X") && gamePad[2][0].equals("X")) {
                    for (; ; ) {
                        if (gamePad[0][1].equals("8")) {
                            gamePad[0][1] = "" + computer;
                            break;
                        } else if (gamePad[1][0].equals("4")) {
                            gamePad[1][0] = "" + computer;
                            break;
                        } else {
                            gamePad[1][1] = "" + computer;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 7 && gamePad[0][0].equals("X") && gamePad[2][0].equals("X") && gamePad[2][2].equals("X")) {
                    for (; ; ) {
                        if (gamePad[1][0].equals("4")) {
                            gamePad[1][0] = "" + computer;
                            break;
                        } else if (gamePad[2][1].equals("2")) {
                            gamePad[2][1] = "" + computer;
                            break;
                        } else {
                            gamePad[1][1] = "" + computer;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 7 && gamePad[2][0].equals("X") && gamePad[2][2].equals("X") && gamePad[0][2].equals("X")) {
                    for (; ; ) {
                        if (gamePad[1][2].equals("6")) {
                            gamePad[1][2] = "" + computer;
                            break;
                        } else if (gamePad[2][1].equals("2")) {
                            gamePad[2][1] = "" + computer;
                            break;
                        } else {
                            gamePad[1][1] = "" + computer;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 7 && gamePad[0][1].equals("O") && gamePad[1][1].equals("O") && gamePad[2][1].equals("X")) {
                    for (; ; ) {
                        if (gamePad[2][0].equals("1")) {
                            gamePad[2][0] = "" + computer;
                        } else if (gamePad [2] [2].equals("3")){
                            gamePad [2] [2] = "" + computer;
                        }
                        else if (gamePad[0][0].equals("X")) {
                            gamePad[0][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[0][2].equals("X")) {
                            gamePad[0][0] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 7 && gamePad[2][1].equals("O") && gamePad[1][1].equals("O") && gamePad[0][1].equals("X")) {
                    for (; ; ) {
                        if (gamePad[0][0].equals("7")) {
                            gamePad[0][0] = "" + computer;
                        } else if (gamePad[0][2].equals("9")) {
                            gamePad[0][2] = "" + computer;
                        } else if (gamePad[2][0].equals("X")) {
                            gamePad[2][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[2][2].equals("X")) {
                            gamePad[2][0] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        }
                    }
                } else if (intelligence == 1 && computerStep == 7 && gamePad[1][0].equals("O") && gamePad[1][1].equals("O") && gamePad[1][2].equals("X")) {
                        for (; ; ) {
                            if (gamePad[0][2].equals("9")) {
                                gamePad[0][2] = "" + computer;
                            } else if (gamePad[2][2].equals("3")) {
                                gamePad[2][2] = "" + computer;
                            } else if (gamePad[0][0].equals("X")) {
                                gamePad[2][0] = "" + computer;
                                choiceInt++;
                                computerStep++;
                                break;
                            } else if (gamePad[2][0].equals("X")) {
                                gamePad[0][0] = "" + computer;
                                choiceInt++;
                                computerStep++;
                                break;
                            }
                        }
                }  else if (intelligence == 1 && computerStep == 7 && gamePad[1][2].equals("O") && gamePad[1][1].equals("O") && gamePad[1][0].equals("X")) {
                    for (; ; ) {
                        if (gamePad[2][0].equals("1")) {
                            gamePad[2][0] = "" + computer;
                        } else if (gamePad[0][0].equals("7")) {
                            gamePad[0][0] = "" + computer;
                        } else if (gamePad[0][2].equals("X")) {
                            gamePad[2][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        } else if (gamePad[2][2].equals("X")) {
                            gamePad[0][2] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        }
                    }
                    // 5 ход (компьютер ходит первым)
                } else if (intelligence == 1 && computerStep == 9 && gamePad[0][1].equals("8")) {
                    gamePad [0] [1] = "" + computer;
                } else if (intelligence == 1 && computerStep == 9 && gamePad[2][1].equals("2")) {
                    gamePad [2] [1] = "" + computer;
                } else if (intelligence == 1 && computerStep == 9 && gamePad[1][0].equals("4")) {
                    gamePad [1] [0] = "" + computer;
                } else if (intelligence == 1 && computerStep == 9 && gamePad[1][2].equals("6")) {
                    gamePad [1] [2] = "" + computer;
                    // Первый ход (игрок ходит первым)
                } else if (intelligence == 2 && computerStep == 3 && gamePad[1][1].equals("5")) {
                    gamePad[1][1] = "" + computer;
                    choiceInt++;
                    computerStep++;
                }  else if (intelligence == 2 && computerStep == 3 && gamePad[1][1].equals("X")) {
                    for (; ; ) {
                        i = rand.nextInt(3);
                        j = rand.nextInt(3);
                        if (i != 1 && j != 1) {
                            gamePad[i][j] = "" + computer;
                            choiceInt++;
                            computerStep++;
                            break;
                        }
                    }
                // Второй ход (игрок ходит первым)
                } else if (intelligence == 2 && computerStep == 5 && gamePad[1][1].equals("X")) {

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

