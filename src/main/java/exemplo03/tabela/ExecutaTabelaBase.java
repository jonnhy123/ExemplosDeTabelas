package exemplo03.tabela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * By: Jhonatan Mattana
 * 2 de jun de 2017 - 07:56:03 
 */
public class ExecutaTabelaBase extends JFrame {

	private JPanel contentPane;
	private JTable tabela;

	/**
	 * Create the frame.
	 */
	public ExecutaTabelaBase() {
		setTitle("Tabela Exemplo03");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panelBotao = new JPanel();
		GridBagConstraints gbc_panelBotao = new GridBagConstraints();
		gbc_panelBotao.insets = new Insets(0, 0, 5, 0);
		gbc_panelBotao.fill = GridBagConstraints.BOTH;
		gbc_panelBotao.gridx = 0;
		gbc_panelBotao.gridy = 0;
		contentPane.add(panelBotao, gbc_panelBotao);
		GridBagLayout gbl_panelBotao = new GridBagLayout();
		gbl_panelBotao.columnWidths = new int[]{0, 0};
		gbl_panelBotao.rowHeights = new int[]{0, 0};
		gbl_panelBotao.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelBotao.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelBotao.setLayout(gbl_panelBotao);
		
		JButton btnIniciarTabela = new JButton("Iniciar Tabela");
		GridBagConstraints gbc_btnIniciarTabela = new GridBagConstraints();
		gbc_btnIniciarTabela.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnIniciarTabela.gridx = 0;
		gbc_btnIniciarTabela.gridy = 0;
		panelBotao.add(btnIniciarTabela, gbc_btnIniciarTabela);
		
		JPanel panelTabela = new JPanel();
		GridBagConstraints gbc_panelTabela = new GridBagConstraints();
		gbc_panelTabela.fill = GridBagConstraints.BOTH;
		gbc_panelTabela.gridx = 0;
		gbc_panelTabela.gridy = 1;
		contentPane.add(panelTabela, gbc_panelTabela);
		GridBagLayout gbl_panelTabela = new GridBagLayout();
		gbl_panelTabela.columnWidths = new int[]{0, 0};
		gbl_panelTabela.rowHeights = new int[]{0, 0};
		gbl_panelTabela.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelTabela.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelTabela.setLayout(gbl_panelTabela);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panelTabela.add(scrollPane, gbc_scrollPane);
		
		tabela = new JTable();
		scrollPane.setViewportView(tabela);
	}

}
