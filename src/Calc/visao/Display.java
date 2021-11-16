package Calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Calc.modelo.Memoria;
import Calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{
	
	private final JLabel label ;
	
	
	public Display() {
		Memoria.GetInstancia().adicionarObservador(this);
		
		setBackground(new Color(46,46,46));
		label = new JLabel(Memoria.GetInstancia().getTextoAtual());
		label.setForeground(Color.LIGHT_GRAY);
		label.setFont(new Font("courier",Font.PLAIN,30));
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10,25));
		add(label);
		
		
	}
	
	@Override
	public void valorAlterado(String novoValor) {
		// TODO Auto-generated method stub
		label.setText(novoValor);
	}
}
