
public class Empresa {
	//Atributos
	private String nome;
	private String cidade; 
	private String UF;
	
	//Metodo get e set
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	
	//Metodo Construtor
	public Empresa(String nome, String cidade, String uF) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		UF = uF;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", cidade=" + cidade + ", UF=" + UF + "]";
	}
	
	
	
	
}
