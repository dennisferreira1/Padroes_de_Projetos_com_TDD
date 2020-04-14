import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nome;
	private List<String> permissoes;
	
	public Usuario(String nome) {
		this.nome = nome;
		permissoes = new ArrayList<String>();
	}

	public String getNome() {
		return nome;
	}

	public void autorizaAcesso(String classe, String metodo) {
		permissoes.add(classe + ":" + metodo);
		
	}

	public boolean isAutorizadoPara(String classe, String metodo) {
		return permissoes.contains(classe + ":" + metodo);
	}
	
	

}
