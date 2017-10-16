package br.com.fiap.challenge.bo;

public class PagamentoBO {
	private int id;
	private String tipoPagamento;
	
	
	
	public boolean efetuarPagamento(){
		 
		return false;
		}



	@Override
	public String toString() {
		return "Pagamento [id=" + id + ", tipoPagamento=" + tipoPagamento + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTipoPagamento() {
		return tipoPagamento;
	}



	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
}
