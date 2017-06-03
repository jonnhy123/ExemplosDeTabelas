package exemplo04.tabela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * By: Jhonatan Mattana
 * 2 de jun de 2017 - 21:19:50 
 */
public class ExecutaTabelaBase extends JFrame {

	private JPanel contentPane;
	protected JTextField txtId;
	protected JTextField txtIdade;
	protected JTextField txtPais;
	protected JTextField txtEstado;
	protected JTextField txtCidade;
	protected JTable tabela;
	protected JTextField txtNome;
	protected JButton btnExcluir;
	protected JButton btnSalvar;
	protected JButton btnNovo;

	/**
	 * Create the frame.
	 */
	public ExecutaTabelaBase() {
		setTitle("Exemplo04 de tabelas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panelTxts = new JPanel();
		GridBagConstraints gbc_panelTxts = new GridBagConstraints();
		gbc_panelTxts.insets = new Insets(0, 0, 5, 0);
		gbc_panelTxts.fill = GridBagConstraints.BOTH;
		gbc_panelTxts.gridx = 0;
		gbc_panelTxts.gridy = 0;
		contentPane.add(panelTxts, gbc_panelTxts);
		GridBagLayout gbl_panelTxts = new GridBagLayout();
		gbl_panelTxts.columnWidths = new int[]{43, 83, 57, 111, 31, 103, 0};
		gbl_panelTxts.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelTxts.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelTxts.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelTxts.setLayout(gbl_panelTxts);
		
		JLabel lblId = new JLabel("ID:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		panelTxts.add(lblId, gbc_lblId);
		
		txtId = new JTextField();
		GridBagConstraints gbc_txtId = new GridBagConstraints();
		gbc_txtId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtId.insets = new Insets(0, 0, 5, 5);
		gbc_txtId.gridx = 1;
		gbc_txtId.gridy = 0;
		panelTxts.add(txtId, gbc_txtId);
		txtId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Idade:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 0;
		panelTxts.add(lblNewLabel, gbc_lblNewLabel);
		
		txtIdade = new JTextField();
		GridBagConstraints gbc_txtIdade = new GridBagConstraints();
		gbc_txtIdade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIdade.insets = new Insets(0, 0, 5, 5);
		gbc_txtIdade.anchor = GridBagConstraints.NORTH;
		gbc_txtIdade.gridx = 3;
		gbc_txtIdade.gridy = 0;
		panelTxts.add(txtIdade, gbc_txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 1;
		panelTxts.add(lblNome, gbc_lblNome);
		
		txtNome = new JTextField();
		GridBagConstraints gbc_txtNome = new GridBagConstraints();
		gbc_txtNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNome.gridwidth = 5;
		gbc_txtNome.insets = new Insets(0, 0, 5, 5);
		gbc_txtNome.gridx = 1;
		gbc_txtNome.gridy = 1;
		panelTxts.add(txtNome, gbc_txtNome);
		txtNome.setColumns(10);
		
		JLabel lblPais = new JLabel("Pais:");
		GridBagConstraints gbc_lblPais = new GridBagConstraints();
		gbc_lblPais.insets = new Insets(0, 0, 0, 5);
		gbc_lblPais.gridx = 0;
		gbc_lblPais.gridy = 2;
		panelTxts.add(lblPais, gbc_lblPais);
		
		txtPais = new JTextField();
		GridBagConstraints gbc_txtPais = new GridBagConstraints();
		gbc_txtPais.insets = new Insets(0, 0, 0, 5);
		gbc_txtPais.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPais.gridx = 1;
		gbc_txtPais.gridy = 2;
		panelTxts.add(txtPais, gbc_txtPais);
		txtPais.setColumns(10);
		
		JLabel lblEsdado = new JLabel("Esdado:");
		GridBagConstraints gbc_lblEsdado = new GridBagConstraints();
		gbc_lblEsdado.anchor = GridBagConstraints.WEST;
		gbc_lblEsdado.insets = new Insets(0, 0, 0, 5);
		gbc_lblEsdado.gridx = 2;
		gbc_lblEsdado.gridy = 2;
		panelTxts.add(lblEsdado, gbc_lblEsdado);
		
		txtEstado = new JTextField();
		GridBagConstraints gbc_txtEstado = new GridBagConstraints();
		gbc_txtEstado.insets = new Insets(0, 0, 0, 5);
		gbc_txtEstado.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEstado.gridx = 3;
		gbc_txtEstado.gridy = 2;
		panelTxts.add(txtEstado, gbc_txtEstado);
		txtEstado.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		GridBagConstraints gbc_lblCidade = new GridBagConstraints();
		gbc_lblCidade.insets = new Insets(0, 0, 0, 5);
		gbc_lblCidade.anchor = GridBagConstraints.EAST;
		gbc_lblCidade.gridx = 4;
		gbc_lblCidade.gridy = 2;
		panelTxts.add(lblCidade, gbc_lblCidade);
		
		txtCidade = new JTextField();
		GridBagConstraints gbc_txtCidade = new GridBagConstraints();
		gbc_txtCidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCidade.gridx = 5;
		gbc_txtCidade.gridy = 2;
		panelTxts.add(txtCidade, gbc_txtCidade);
		txtCidade.setColumns(10);
		
		JPanel panelBtn = new JPanel();
		GridBagConstraints gbc_panelBtn = new GridBagConstraints();
		gbc_panelBtn.insets = new Insets(0, 0, 5, 0);
		gbc_panelBtn.fill = GridBagConstraints.BOTH;
		gbc_panelBtn.gridx = 0;
		gbc_panelBtn.gridy = 1;
		contentPane.add(panelBtn, gbc_panelBtn);
		GridBagLayout gbl_panelBtn = new GridBagLayout();
		gbl_panelBtn.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panelBtn.rowHeights = new int[]{0, 0};
		gbl_panelBtn.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelBtn.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelBtn.setLayout(gbl_panelBtn);
		
		btnNovo = new JButton("Novo");
		GridBagConstraints gbc_btnNovo = new GridBagConstraints();
		gbc_btnNovo.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNovo.insets = new Insets(0, 0, 0, 5);
		gbc_btnNovo.gridx = 0;
		gbc_btnNovo.gridy = 0;
		panelBtn.add(btnNovo, gbc_btnNovo);
		
		btnSalvar = new JButton("Salvar");
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSalvar.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalvar.gridx = 1;
		gbc_btnSalvar.gridy = 0;
		panelBtn.add(btnSalvar, gbc_btnSalvar);
		
		btnExcluir = new JButton("Excluir");
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnExcluir.gridx = 2;
		gbc_btnExcluir.gridy = 0;
		panelBtn.add(btnExcluir, gbc_btnExcluir);
		
		JPanel panelTabela = new JPanel();
		GridBagConstraints gbc_panelTabela = new GridBagConstraints();
		gbc_panelTabela.fill = GridBagConstraints.BOTH;
		gbc_panelTabela.gridx = 0;
		gbc_panelTabela.gridy = 2;
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
