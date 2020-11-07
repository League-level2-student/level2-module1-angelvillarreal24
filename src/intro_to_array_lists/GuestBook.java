package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	// standard global vars
	JButton addName = new JButton();
	JButton viewName = new JButton();

	ArrayList<String> nameList = new ArrayList<String>();

	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.createUI();
	}// close main

	private void createUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.add(panel);
		panel.add(addName);
		panel.add(viewName);

		addName.setText("Add Name");
		viewName.setText("View Names");
		addName.addActionListener(this);
		viewName.addActionListener(this);

		frame.setVisible(true);
		frame.pack();
	}// close createUI
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addName) {
			String nameToAdd = JOptionPane.showInputDialog("What name should be added?");
			nameList.add(nameToAdd);
			JOptionPane.showMessageDialog(null, "The name " + nameToAdd + " was added!");
		} else if (e.getSource() == viewName) {
			String allGuests = "";
			int counter = 0;
			for (String s : nameList) {
				counter++;
				allGuests += "Guest #" + counter + ": " + s + "\n";
			}
			JOptionPane.showMessageDialog(null, allGuests);
		}
	}// close actionPerformed
}// close Guestbook (the class)