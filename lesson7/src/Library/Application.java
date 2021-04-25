package Library;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Application {


    public void start() {

        Library library = new Library();

        while (true) {
            System.out.println("Нажмите клавишу, что бы выбрать действие: \n" +
                    "'1' ---> Вывод всех книг;\n" +
                    "'2' ---> Добавить книгу;\n" +
                    "'3' ---> Удалить книгу;\n" +
                    "'4' ---> Редактировать книгу;\n" +
                    "'q' ---> Выход.");
            String str = choice();
            try {
                int choiceMenu = Integer.parseInt(str);
                if (choiceMenu == 1) {
                    sortOutput(library);
                } else if (choiceMenu == 2) {
                    library.addBook(makeBook());
                } else if (choiceMenu == 3) {
                    System.out.println("Введите id книги, которую хотите удалить: ");
                    while (library.removeBook(makeId())) ;
                } else if (choiceMenu == 4) {
                    System.out.println("Введите id книги, которую хотите редактировать: ");
                    while (searchBook(library, makeId())) ;
                } else {
                    System.out.println("Ввод неверный, попробуйте еще раз: ");
                }

            } catch (NumberFormatException e) {
                if (str.equals("q") || str.equals("Q")) {
                    System.out.println("Спасибо за использование нашей библиотеки, до свидания!");
                    return;
                } else {
                    System.out.println("Ввод неверный, попробуйте еще раз: ");
                }
            }
        }
    }

    private String choice() {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        return choice;
    }

    private void increaseSort(Library library) {
        Collections.sort(library.getBookList(), new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getTitle().compareTo(book2.getTitle());
            }
        });
        if (library.getBookList().size() == 0){
            System.out.println("В библиотеке нет книг.");
        } else {
            System.out.println(library);
        }
    }

    private void waningSort(Library library) {
        Collections.sort(library.getBookList(), new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getTitle().compareTo(book2.getTitle()) * -1;
            }
        });
        if (library.getBookList().size() == 0){
            System.out.println("В библиотеке нет книг.");
        } else {
            System.out.println(library);
        }
    }

    private void timeAddSort(Library library) {
        library.getBookSet();
        if (library.getBookList().size() == 0){
            System.out.println("В библиотеке нет книг.");
        } else {
            System.out.println(library);
        }
    }

    private void sortOutput(Library library) {

        System.out.println("Нажмите клавишу для выбора сортировки вывода книг: +\n" +
                "'1' ---> По алфавиту (убывание)\n" +
                "'2' ---> По алфавиту (возрастание)\n" +
                "'3' ---> По добавлению (сначала новые)\n");
        while (true) {
            String str = choice();
            try {
                int choiceMenu = Integer.parseInt(str);
                if (choiceMenu == 1) {
                    waningSort(library);
                    return;
                } else if (choiceMenu == 2) {
                    increaseSort(library);
                    return;
                } else if (choiceMenu == 3) {
                    timeAddSort(library);
                    return;
                } else {
                    System.out.println("Ввод неверный, попробуйте еще раз: ");
                }

            } catch (NumberFormatException e) {
                System.out.println("Ввод неверный, попробуйте еще раз: ");
            }
        }
    }

    private Book makeBook() {

        System.out.println("Введите название книги: ");
        String name = choice();

        System.out.println("Нажмите клавишу: \n" +
                "\'1\', что бы выбрать жанр Фэнтези\n" +
                "\'2\', что бы выбрать жанр Мистика\n" +
                "\'3\', что бы выбрать жанр Триллер\n" +
                "\'4\', что бы выбрать жанр Роман\n" +
                "\'5\', что бы выбрать жанр Вестерн\n" +
                "\'6\', что бы выбрать жанр Антиутопия\n" +
                "\'7\', что бы выбрать жанр Современные");
        while (true) {
            try {
                switch (Integer.parseInt(choice())) {
                    case 1:
                        Book book1 = new Book(name, Book.Genre.Fantasy);
                        return book1;
                    case 2:
                        Book book2 = new Book(name, Book.Genre.Mystery);

                        return book2;
                    case 3:
                        Book book3 = new Book(name, Book.Genre.Thriller);
                        return book3;
                    case 4:
                        Book book4 = new Book(name, Book.Genre.Romance);
                        return book4;
                    case 5:
                        Book book5 = new Book(name, Book.Genre.Westerns);
                        return book5;
                    case 6:
                        Book book6 = new Book(name, Book.Genre.Dystopian);
                        return book6;
                    case 7:
                        Book book7 = new Book(name, Book.Genre.Contemporary);
                        return book7;
                }
            } catch (Exception e) {
                System.out.println("Неверный выбор, попробуйте еще раз: ");
            }
        }
    }

    private int makeId() {
        while (true) {
            try {
                int i = Integer.parseInt(choice());
                return i;
            } catch (Exception e) {
                System.out.println("Неверный формат, попробуйте еще раз: ");
            }
        }
    }

    private boolean searchBook(Library library, int id) {

        for (int i = 0; i < library.getBookList().size(); i++) {
            if (library.getBookList().get(i).getId() == id) {
                library.editBook(library.getBookList().get(i));
                return false;
            }
        }
        System.out.println("Книга с таким id не найдена в списке, введите id еще раз: ");
        return true;
    }
}
