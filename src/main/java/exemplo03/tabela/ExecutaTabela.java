package exemplo03.tabela;

import java.awt.EventQueue;

import javax.swing.JFrame;

/**
 * By: Jhonatan Mattana
 * 2 de jun de 2017 - 07:55:15 
 */
public class ExecutaTabela extends ExecutaTabelaBase{

	
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
