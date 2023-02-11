package jframe;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestJFrame {

	public static void main(String[] args) {
		
		// création d’une fenêtre
		JFrame f = new JFrame("2 boutons");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// création d’un panel (FlowLayout) comme contenu
		JPanel p = new JPanel();
		
		// un écouteur pour tous
		MonEcouteurDAction ecouteur = new MonEcouteurDAction(f);
		
		// un bouton
		JButton b = new JButton("un bouton");
		b.setActionCommand("vous avez cliqué sur un bouton");
		b.addActionListener(ecouteur);
		
		// un menu déroulant
		JComboBox j = new JComboBox();
		j.addItem("Bonjour");
		j.addItem("Au revoir");
		j.setActionCommand("vous avez choisi une option du menu déroulant");
		j.addActionListener(ecouteur);
		
		// on ajoute le tout dans la fenêtre qui devient visible
		p.add(b);
		p.add(j);
		f.setContentPane(p);
		f.pack();
		f.setVisible(true);
	}

}
