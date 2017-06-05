package exemplo05.tabela;

import java.awt.EventQueue;

/**
 * By: Jhonatan Mattana
 * 5 de jun de 2017 - 04:44:02 
 */
public class ExecutaTabela extends ExecutaTabelaBase{

	public ExecutaTabela() {
		super();
		configuraBotoes();
	}
	
	private void configuraBotoes() {
		
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
 