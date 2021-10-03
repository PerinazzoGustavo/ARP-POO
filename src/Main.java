public class Main {
    public static void main(String[] args) {
        var filme = new Film("Bastardos Inglórios", "Aventura/Drama", "Tarantino", 153);
        var got = new Series("Game of thornes", "drama/aventura", "George Martyn", 20);
        got.adicionate(new Film("O inverno está chegando", "Drama", "Tim Van Patten", 62));
        got.adicionate(new Film("A estrada do rei", "Aventura", "Tim Van Patten", 56));
        got.adicionate(new Film("Lorde Snow", "Aventura", "Brian Kirk", 58));

        var show = new Show("Irmãos (Live)", "Samba", "Telo Borges");
        show.adicionate(new Film("A voz do morro", "Pagode", "Zé Ketti", 2));
        show.adicionate(new Film("Eu sou o samba", "Samba", "Alexandre Pires", 3));
        filme.print();
        got.print();
        show.print();


    }
}
