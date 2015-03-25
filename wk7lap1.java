
import javax.swing.JOptionPane;

public class test {
	public static void main(String[] args) {
		int computerturn;
		String choice;
		String playturn;
		int turn = 1;
		while (turn != 0) {
			computerturn = 1 + (int) (Math.random() * 3);
			choice = JOptionPane
					.showInputDialog("Enter your choice (Rock,Paper,Scissor:)");
			switch (choice.toLowerCase()) {
			case "rock": {
				switch (computerturn) {
				case 1:
					JOptionPane.showMessageDialog(null, "Rock tie to Rock");
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Rock Lose to Paper");
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Rock win to Scissor");
				}
			}
				break;
			case "paper": {
				switch (computerturn) {
				case 1:
					JOptionPane.showMessageDialog(null, "Paper win to Rock");
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Paper tie to Paper");
					break;
				case 3:
					JOptionPane
							.showMessageDialog(null, "Paper lose to Scissor");
				}
			}
				break;
			case "scissor": {
				switch (computerturn) {
				case 1:
					JOptionPane.showMessageDialog(null, "Scissor lose to Rock");
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Scissor win to Paper");
					break;
				case 3:
					JOptionPane.showMessageDialog(null,
							"Scissor tie to Scissor");
				}
			}
				break;
			default:
				return;
			}
			playturn = JOptionPane
					.showInputDialog("Do you want to play again(Y/N):");
			switch (playturn.toUpperCase()) {
			case "Y":
				turn = 1;
				break;
			default:
				turn = 0;
				break;
			}

		}
	}
}
