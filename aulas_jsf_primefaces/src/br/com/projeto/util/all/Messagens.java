package br.com.projeto.util.all;

import java.io.Serializable;
import javax.faces.context.FacesContext;

public abstract class Messagens extends FacesContext implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Messagens() {
	}
	
	public static FacesContext getFacesContext(){
		return FacesContext.getCurrentInstance();		
	}
	
}
