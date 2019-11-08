package controller;

import model.Pessoa;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="telaPrincipal")
public class TelaPrincipal {

	private Pessoa p = new Pessoa();

	public Pessoa getP() {
		return p;
	}

	public void setP(Pessoa p) {
		this.p = p;
	}

	public TelaPrincipal(Pessoa p) {
		super();
		this.p = p;
	}
	public TelaPrincipal() {
		super();
		this.p = new Pessoa();
	}

}
