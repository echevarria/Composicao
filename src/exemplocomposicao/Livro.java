/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplocomposicao;

/**
 *
 * @author Avell B155 MAX
 */
public class Livro {
    
    private String titulo;
    private String isbn;
    private Autor autor;
    private Capitulo capitulos[];
    private int totalCapitulos;
    
    Livro(String titulo, String isbn, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.capitulos = new Capitulo[100];
        this.totalCapitulos = 0;
    }
    
    public void addCapitulo(String titulo, String corpo) {
        Capitulo capitulo = new Capitulo(titulo, corpo);
        this.capitulos[this.totalCapitulos] = capitulo;
        this.totalCapitulos++;
    }
    
    
}
