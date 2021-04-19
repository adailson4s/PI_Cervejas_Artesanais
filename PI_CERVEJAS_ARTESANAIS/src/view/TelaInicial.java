package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import components.Button;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

//		JLabel lblBierbuch = new JLabel("");
//		lblBierbuch.setBackground(Color.BLACK);
//		lblBierbuch.setForeground(Color.YELLOW);
//		lblBierbuch.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 99));
//		lblBierbuch.setHorizontalAlignment(SwingConstants.CENTER);
//		lblBierbuch.setBounds(287, 50, 450, 151);
//		contentPane.add(lblBierbuch);

		JButton btnEntrar = new Button("ENTRAR", 414, 220, 195, 52).getBtn();
		contentPane.add(btnEntrar);
		
		JButton btnCadastrar = new Button("CADASTRAR", 414, 320, 195, 52).getBtn();
		contentPane.add(btnCadastrar);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("D:\\Adailson\\Documentos\\GitHub\\PI_Cervejas_Artesanais\\PI_CERVEJAS_ARTESANAIS\\src\\img\\background.png"));
		background.setBounds(0, 0, 1008, 537);
		contentPane.add(background);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(689, 203, 46, 14);
		contentPane.add(lblNewLabel);
	}
}
