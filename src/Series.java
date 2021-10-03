public class Series extends GroupedItem {
    int temps;



    public Series(String title, String genre, String director, int temps) {
        super(title, genre, director);
        this.temps = temps;
    }



    public int getTemps() {
        return temps;
    }


    @Override
    public void print() {
        super.print() ;{
            System.out.printf("- Temporadas: %s\n ", getTemps());
        }
    }
}
