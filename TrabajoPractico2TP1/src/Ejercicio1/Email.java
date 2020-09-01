package Ejercicio1;

public class Email {
	private String cuenta;
	private String dominio;

	public Email(String mail) {
		this.cuenta = setCuenta(mail);
		this.dominio = setDominio(mail);
	}

	public String setCuenta(String mail) {
		String[] cuenta = mail.split("@");
		this.cuenta = cuenta[0];
		return this.cuenta;
	}

	public String setDominio(String mail) {
		String[] dominio = mail.split("@");
		this.dominio = dominio[1];
		return this.dominio;
	}

	public String getValor() {
		return this.cuenta + "@" + this.dominio;
	}

}
