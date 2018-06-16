import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main (String[] args) {
		String interest = JOptionPane.showInputDialog("what do you like?");
		JOptionPane.showMessageDialog(null, interest + "that's alright but hats that you can drink out of are cooler");
	}
}
