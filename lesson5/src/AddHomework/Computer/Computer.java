/*
Создать класс компьютер.
Поля:
- процессор
- оперативка
- жесткий диск
- ресурс полных циклов работы (включений/выключений)

Методы:
- метод описание(вывод всех полей)
- метод включить, при включении может произойти сбой, при вызове метода рандом загадывает число (0 либо 1),
  вы вводите число с клавиатуры, если угадали комп включается, если нет сгорает.
  Если комп сгорел, при попытке включить нужно выдать сообщение что ему конец
- выключить (аналогично включению)
- при превышении лимита ресурса комп сгорает
*/

package AddHomework.Computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    private String processor;
    private String randomAccessMemory;
    private String hardDisk;
    private int resourse;
    private boolean death = false;
    private boolean live = true;

    public Computer(String processor, String randomAccessMemory, String hardDisk, int resourse) {
        this.processor = processor;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDisk = hardDisk;
        this.resourse = resourse - 1;
    }

    public void printComputerParams () {
        System.out.println("CPU: " + processor + "; " + " " +
                "RАM: " + randomAccessMemory + "; " + "HDD: " + hardDisk + "; " + "resourse on/off: " + resourse);
    }

    public boolean live () {
        return live;
    }

    public void on() {
        if (death) {
            System.out.println("Кажется пора нести компьютер в ремонт,он не включается, ему конец. :( ");
            return;
        }
        System.out.println("Введите число 0 или 1, что бы включить компьютер : ");
        int enterRand = rand.nextInt(2);
        System.out.println(enterRand);
        if (checkEnter() == enterRand && resourse > 0) {
            System.out.println("Отлично, компьютер включился. :) ");
            this.resourse--;
        } else if (resourse <= 0){
            System.out.println("Очень жаль, ресурс работы компьютера исчерпан, компьютер сгорел. :( ");
            this.death = true;
            this.live = false;
        } else {
            System.out.println("Очень жаль, компьютер сгорел. :( ");
            this.death = true;
            this.live = false;
        }
    }

    public void off() {
        if (death) {
            System.out.println("Кажется пора нести компьютер в ремонт,он не выключается, ему конец. :( ");
            return;
        }
        System.out.println("Введите число 0 или 1, что бы выключить компьютер : ");
        int enterRand = rand.nextInt(2);
        System.out.println(enterRand);
        if (checkEnter() == enterRand && resourse > 0) {
            System.out.println("Компьютер выключился. :) ");
            this.resourse--;
        } else if (resourse <= 0) {
            System.out.println("Очень жаль, ресурс работы компьютера исчерпан, компьютер сгорел. :( ");
            this.death = true;
            this.live = false;
        } else {
            System.out.println("Очень жаль, компьютер сгорел. :( ");
            this.death = true;
            this.live = false;
        }
    }

    private int checkEnter() {
        for (; ; ) {
            String enter = sc.nextLine();
            try {
                int enterInt = Integer.parseInt(enter);
                if (enterInt == 0 || enterInt == 1) {
                    return enterInt;
                } else {
                    System.out.println("Вы не попали по кнопке включения, нужно ввести 0 или 1! ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Вы не попали по кнопке включения, нужно ввести 0 или 1! ");
            }
        }
    }
}
