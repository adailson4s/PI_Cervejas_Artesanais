package components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class Background extends JLabel {
	
	private JLabel bg;
	public Button (String txt, int x, int y, int largura, int altura) {
		bg = new JButton(txt);
		bg.setFont(new Font("Impact", Font.PLAIN, 35));
		bg.setForeground(Color.WHITE);
		bg.setBackground(Color.DARK_GRAY);
		bg.setBounds(x, y, largura, altura);
	}
	public JButton getBtn() {
		return btn;
	}
	public void setBtn(JButton btn) {
		this.btn = btn;
	}
	
	
}
