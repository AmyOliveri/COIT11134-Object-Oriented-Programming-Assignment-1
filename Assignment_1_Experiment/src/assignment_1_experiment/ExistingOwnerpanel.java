package assignment_1_experiment;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ExistingOwnerpanel extends JPanel implements ActionListener {

    JPanel panelOwnerInput = new JPanel();

    JLabel firstNameLabel = new JLabel("First Name: ");
    JLabel secondNameLabel = new JLabel("Last Name: ");
    JLabel addressLabel = new JLabel("Address: ");
    JLabel phoneNumberLabel = new JLabel("Phone Number: ");
    JLabel ownerIDLabel = new JLabel("Licence Number: ");
    JLabel ABNLabel = new JLabel("ABN: ");

    JTextField firstNameInput = new JTextField(40);
    JTextField secondNameInput = new JTextField(40);
    JTextField addressInput = new JTextField(40);
    JTextField phoneNumberInput = new JTextField(40);
    JTextField ownerIDInput = new JTextField(40);
    JTextField ABNInput = new JTextField(40);

    JTextArea ownerView = new JTextArea();

    JButton SearchByIDButton = new JButton("Search by Licence Number");
    JButton SearchByPhoneNumberButton = new JButton("Search by Phone Number");
    JButton viewAllButton = new JButton("View All");

    public ExistingOwnerpanel() {
        this.setLayout(new BorderLayout());

        panelOwnerInput.setLayout(new GridLayout(3, 4));

        panelOwnerInput.add(ownerIDLabel);
        panelOwnerInput.add(ownerIDInput);
        panelOwnerInput.add(new JLabel("        "));
        panelOwnerInput.add(SearchByIDButton);

        panelOwnerInput.add(phoneNumberLabel);
        panelOwnerInput.add(phoneNumberInput);

        panelOwnerInput.add(new JLabel("        "));
        panelOwnerInput.add(SearchByPhoneNumberButton);

        panelOwnerInput.add(new JLabel("        "));
        panelOwnerInput.add(new JLabel("        "));
        panelOwnerInput.add(new JLabel("        "));
        panelOwnerInput.add(viewAllButton);

        ownerView.setText("Owner Information");

        this.add(panelOwnerInput, BorderLayout.NORTH);
        this.add(ownerView, BorderLayout.CENTER);//?
        viewAllButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        String temp = "";
        if (source == viewAllButton) {
            for (int i = 0; i < Assignment_1_Experiment.ownerArray.size(); i++) {
                Owner aOwner = (Owner) Assignment_1_Experiment.ownerArray.get(i);
                temp += aOwner.toString();
            }
            ownerView.setText(temp);
        }
        if (source == SearchByIDButton) {
            for (int i = 0; i < Assignment_1_Experiment.ownerArray.size(); i++) {
                Owner aOwner = (Owner) Assignment_1_Experiment.ownerArray.get(i);
                //Should cycle through the array and display the matching array item
                /*if(ownerIDInput.getText() = ownerIDInput.Assignment_1_Experiment.ownerArray){
            ownerView.add(ownerIDInput);
            ownerView.add(firstNameInput);
            ownerView.add(secondNameInput);
            ownerView.add(phoneNumberInput);
            ownerView.add(addressInput);
            ownerView.add(ABNInput);
            
            }*/
            }
        }
        if (source == SearchByPhoneNumberButton) {
            for (int i = 0; i < Assignment_1_Experiment.ownerArray.size(); i++) {
                Owner aOwner = (Owner) Assignment_1_Experiment.ownerArray.get(i);
                //Should cycle through the array and display the matching array item
            }
        }
    }

}
