package Library;

import java.util.*;

public class Library {

    private List<Book> bookList = new ArrayList<>();

    private Set<Book> bookSet = new LinkedHashSet<>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void getBookSet() {
        bookList.removeAll(bookList);
        for (Book book : bookSet) {
            int i = 0;
            bookList.add(i, book);
            i++;
        }
    }

    public void addBook(Book book) {
        if (bookList.size() == 0) {
            bookList.add(book);
            bookSet.add(book);
            System.out.println("Книга " + book.getTitle() + "(ID книги: " + book.getId() + ")" + " успешно добавлена в список книг.");
        } else {
            for (Book bookId : bookList) {
                if (bookId.getId() == book.getId()) {
                    System.out.println("Книга с таким id ужеесть в списке.");
                    return;
                }
            }
            bookList.add(book);
            bookSet.add(book);
            System.out.println("Книга " + book.getTitle() + "(ID книги: " + book.getId() + ")" + " успешно добавлена в список книг.");
        }
    }

    public boolean removeBook(int id) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId() == id) {
                bookList.remove(i);
                System.out.println("Книга удалена успешно.");
                return false;
            }
        }
        System.out.println("Книга с таким id не найдена в списке, введите id еще раз: ");
        return true;
    }

    public void editBook(Book book) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите новое название книги: ");
        String name = scanner.nextLine();
        book.setTitle(name);
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
                switch (Integer.parseInt(scanner.nextLine())) {
                    case 1:
                        book.setGenreId(Book.Genre.Fantasy);
                        book.setId(name, Book.Genre.Fantasy);
                        return;
                    case 2:
                        book.setGenreId(Book.Genre.Mystery);
                        book.setId(name, Book.Genre.Mystery);
                        return;
                    case 3:
                        book.setGenreId(Book.Genre.Thriller);
                        book.setId(name, Book.Genre.Thriller);
                        return;
                    case 4:
                        book.setGenreId(Book.Genre.Romance);
                        book.setId(name, Book.Genre.Romance);
                        return;
                    case 5:
                        book.setGenreId(Book.Genre.Westerns);
                        book.setId(name, Book.Genre.Westerns);
                        return;
                    case 6:
                        book.setGenreId(Book.Genre.Dystopian);
                        book.setId(name, Book.Genre.Dystopian);
                        return;
                    case 7:
                        book.setGenreId(Book.Genre.Contemporary);
                        book.setId(name, Book.Genre.Contemporary);
                        return;
                }
            } catch (Exception e) {
                System.out.println("Неверный выбор, попробуйте еще раз: ");
            }
        }
    }

    @Override
    public String toString() {
        String str = "";
        int i = 1;
        for (Book book : bookList) {
            str += i + ". " + book + "\n";
            i++;
        }
        return str;
    }
}
