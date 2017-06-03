package exemplo04.tabela;

import java.awt.EventQueue;

/**
 * By: Jhonatan Mattana
 * 3 de jun de 2017 - 07:58:30 
 */
public class ExecutaTabela extends ExecutaTabelaBase{
	
	public ExecutaTabela() {
		super();
		configurarBotoes();
	}
	
	private void configurarBotoes() {
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExecutaTabela frame = new ExecutaTabela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
