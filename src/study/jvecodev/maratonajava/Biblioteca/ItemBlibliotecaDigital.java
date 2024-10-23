package study.jvecodev.maratonajava.Biblioteca;

public abstract class ItemBlibliotecaDigital {
    private String titulo;
    private String autor;
    private double peso;

    public ItemBlibliotecaDigital(String autor, String titulo, double peso) {
        this.autor = autor;
        this.titulo = titulo;
        this.peso = peso;
    }

    public abstract String Descricao();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
