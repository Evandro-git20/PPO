package dominio;

public class Editora {
	private String razaoSocial, email, telefone;
	private Livro[] livro;
	private int i = 0;
	
	public Editora(String razaoSocial, String email, String telefone) {
		this.razaoSocial = razaoSocial;
		this.email = email;
		this.telefone = telefone;
		livro = new Livro[10];
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Livro[] getLivro() {
		return livro;
	}
	public void setLivro(Livro[] livro) {
		this.livro = livro;
	}
	
	public void addLivro(Livro novoLivro) {
		if (i < livro.length) {
		livro[i] = novoLivro;
		i++;
		}
		else
		return;

		}
		public void removeLivro(Livro exLivro) {

		}
		}
