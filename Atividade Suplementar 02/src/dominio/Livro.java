package dominio;

public class Livro{
	private String isbn, titulo;
	private Editora editora;
	
	public Livro(String razaoSocial, String email, String telefone, String isbn, String titulo) {
		this.isbn = isbn;
		this.titulo = titulo;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
}
