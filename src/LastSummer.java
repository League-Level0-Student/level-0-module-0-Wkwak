import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String [] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "I know that you drank a glass of water last summer " + name + " heh.");
	}
}
