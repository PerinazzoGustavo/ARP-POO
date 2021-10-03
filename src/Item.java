public abstract class Item {
    protected String title;
    protected String genre;
    protected String director;


    public Item(String title, String genre, String director) {
        this.title = title;
        this.genre = genre;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    abstract public int getDuration();
    abstract public void print();

}
