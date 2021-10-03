import java.util.Locale;

public class Film extends Item{
    private int duration;

    public Film(String title, String genre, String director, int duration) {
        super(title, genre, director);
        this.duration = duration;
    }
    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void print() {

        System.out.println(getTitle() + " ("+getGenre()+") " +  getDuration() +" min");

    }
}
