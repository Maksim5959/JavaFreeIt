package Library;

public class Book {

    public enum Genre {

        Fantasy("Фэнтези"),

        Mystery("Мистика"),

        Thriller("Триллер"),

        Romance("Роман"),

        Westerns("Вестерн"),

        Dystopian("Антиутопия"),

        Contemporary("Современные");


        private String genre;

        private int id;

        Genre(String genre) {
            this.id = Math.abs(genre.hashCode());
            this.genre = genre;
        }

        @Override
        public String toString() {
            return "Жанр: " + "'" + genre + "', " + "ID жанра: " + "'" + id + "';";
        }
    }

    private int id;
    private String title;
    private Genre genreId;

    public Book(String title, Genre genreId) {
        this.id = Math.abs(title.hashCode() + genreId.hashCode());
        this.title = title;
        this.genreId = genreId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenreId(Genre genreId) {
        this.genreId = genreId;
    }

    public void setId (String name, Genre genre ) {
        this.id = name.hashCode() + genre.hashCode();
    }

    @Override
    public String toString() {
        return "Название книги: " + "'" + title + "'; " + genreId.toString() + " ID книги: " + "'" + id + "';";
    }
}
