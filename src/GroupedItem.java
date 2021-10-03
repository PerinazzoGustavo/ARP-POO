import java.util.ArrayList;
import java.util.List;

public abstract class GroupedItem extends Item {
    int duration;
    private List<Film> listFilmes = new ArrayList<>();





    public GroupedItem(String title, String genre, String director) {
        super(title, genre, director);
    }

    public void adicionate(Film filmes) {
        listFilmes.add(filmes);
    }



    public List<Film> getFilmes()
    {
        return listFilmes;
    }


    @Override
    public int getDuration() {
        return duration;
    }


    @Override
    public void print()
    {
        System.out.println(this.title + " - (" + this.genre + ')');
        for (int i = 0; i < listFilmes.size(); i++)
        {
            System.out.println("  " + (i+1) + ". " + getFilmes().get(i).getTitle() + " (" + getFilmes().get(i).getGenre() + ") - " + getFilmes().get(i).getDuration() + " min.");
        }
        System.out.println("  Duração total: " + getDuration() + " min.");
    }
}
