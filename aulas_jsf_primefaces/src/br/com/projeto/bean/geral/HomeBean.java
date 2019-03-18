package br.com.projeto.bean.geral;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="homeBean")
public class HomeBean {
	
	public String mensagem = "Seja Bem-Vindo ao JSF - Java EE";

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	

}
