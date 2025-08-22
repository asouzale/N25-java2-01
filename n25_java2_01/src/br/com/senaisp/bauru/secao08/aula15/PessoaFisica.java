package br.com.senaisp.bauru.secao08.aula15;

public class PessoaFisica extends Pessoa {
	public PessoaFisica() {
		super(); //usando o conturctor da classe pai
		setTipoPessoa('F');
	}
	//consructor
	public PessoaFisica (String nom, String doc, String ende, String dtNas) throws Exception{
		super (nom, doc, ende, dtNas);
		setTipoPessoa('F'); //usando constructor da classe pai
	}
	@Override
	protected boolean isDocumentoValido(String documento2) {
		return documento2.length()==14 || documento2.length()==11;
	
	}

}
