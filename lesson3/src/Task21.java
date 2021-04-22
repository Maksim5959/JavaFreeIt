/*
* Напишите три цикла выполняющих многократное сложение строк, один с
* помощью оператора сложения и String, другой с помощью StringBuilder и метода
* append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
*/
public class Task21 {

    public static void main(String[] args) {
        String str = "String ";
        String sumStr = "";
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            sumStr += str;
        }
        long stop = System.currentTimeMillis();
        System.out.println("Скорость выполнения (Оператор сложения) = " + (stop - start));

        StringBuilder strBuild = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++){
            strBuild.append(str);
        }
        stop = System.currentTimeMillis();
        System.out.println("Скорость выполнения (StringBuilder) = " + (stop - start));

        StringBuffer strBuff = new StringBuffer();
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++){
            strBuff.append(str);
        }
        stop =  System.currentTimeMillis();
        System.out.println("Скорость выполнения (StringBuffer) = " + (stop - start));
    }
}
