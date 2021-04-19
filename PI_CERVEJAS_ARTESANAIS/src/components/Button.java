package components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class Button extends JButton {
	
	private JButton btn;
	public Button (String txt, int x, int y, int largura, int altura) {
		btn = new JButton(txt);
		btn.setFont(new Font("Impact", Font.PLAIN, 35));
		btn.setForeground(Color.WHITE);
		btn.setBackground(Color.DARK_GRAY);
		btn.setBounds(x, y, largura, altura);
	}
	public JButton getBtn() {
		return btn;
	}
	public void setBtn(JButton btn) {
		this.btn = btn;
	}
	
	
}
