package br.com.raphael.cm;

import br.com.raphael.cm.modelo.Tabuleiro;
import br.com.raphael.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);

		new TabuleiroConsole(tabuleiro);

	}

}
