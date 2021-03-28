/*
* Напишите три цикла выполняющих многократное сложение строк, один с
* помощью оператора сложения и String, другой с помощью StringBuilder и метода
* append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
*/
public class Task21 {

    public static void main(String[] args) {
        String str = "String ";
        String sumStr = "";
        for(int i = 0; i < 10; i++){
            sumStr += str;
        }
        System.out.println("Полученная строка - " + "\"" + sumStr + "\"");
        System.out.println("Скорость выполнения = 1,598 секунд");
        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < 10; i++){
            strBuild.append(str);
        }
        System.out.println("Полученная строка - " + "\"" + strBuild + "\"");
        System.out.println("Скорость выполнения = 1,653 секунд");
        StringBuffer strBuff = new StringBuffer();
        for (int i = 0; i < 10; i++){
            strBuff.append(str);
        }
        System.out.println("Полученная строка - " + "\"" + strBuff + "\"");
        System.out.println("Скорость выполнения = 1,708 секунд");
    }
}
