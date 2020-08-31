package assignment_1_experiment;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OwnerPanel extends JPanel implements ActionListener {

    JPanel NewOwnerPanel = new JPanel();
    JPanel checkBoxPanel = new JPanel();

    JLabel firstNameLabel = new JLabel("First Name: ");
    JLabel secondNameLabel = new JLabel("Last Name: ");
    JLabel addressLabel = new JLabel("Address: ");
    JLabel phoneNumberLabel = new JLabel("Phone Number: ");
    JLabel ownerIDLabel = new JLabel("Licence Number: ");
    JLabel ABNLabel = new JLabel("ABN: ");
    JLabel DOBLabel = new JLabel("Date of Birth: ");

    JTextField firstNameInput = new JTextField(40);
    JTextField secondNameInput = new JTextField(40);
    JTextField addressInput = new JTextField(40);
    JTextField phoneNumberInput = new JTextField(40);
    JTextField ownerIDInput = new JTextField(40);
    JTextField ABNInput = new JTextField(40);
    JTextField DOBInput = new JTextField(40);

    JTextArea ownerView = new JTextArea();

    JButton saveButton = new JButton("Save");
    JButton clearButton = new JButton("Clear");

    JLabel privateOwnerLabel = new JLabel("Private Owner");
    private JCheckBox privateOwner;

    JLabel corporateOwnerLabel = new JLabel("Corporate Owner");
    private JCheckBox corporateOwner;

    public void checkBoxPanel() {
        JLabel checkBoxLabel = new JLabel("Please select the type of vehicle owner");
        add(checkBoxLabel, BorderLayout.CENTER);

        ActionListener checkBoxListener = event -> {
            if (privateOwner.isSelected()) {
                ABNInput.setEditable(false);
            }
            if (corporateOwner.isSelected()) {
                DOBInput.setEditable(false);
            }
        };

        JPanel checkBoxPanel = new JPanel();
        JCheckBox privateOwnerCheckBox = new JCheckBox("Private Owner");
        privateOwnerCheckBox.addActionListener(checkBoxListener);

        JCheckBox corporateOwnerCheckBox = new JCheckBox("Corporate Owner");
        corporateOwnerCheckBox.addActionListener(checkBoxListener);

        checkBoxPanel.add(privateOwnerCheckBox);
        checkBoxPanel.add(corporateOwnerCheckBox);

        add(checkBoxPanel, BorderLayout.NORTH);
    }

    public OwnerPanel() {
        this.setLayout(new BorderLayout());
        NewOwnerPanel.setLayout(new GridLayout(6, 6));

        NewOwnerPanel.add(firstNameLabel);
        NewOwnerPanel.add(secondNameLabel);
        NewOwnerPanel.add(addressLabel);

        NewOwnerPanel.add(firstNameInput);
        NewOwnerPanel.add(secondNameInput);
        NewOwnerPanel.add(addressInput);

        NewOwnerPanel.add(phoneNumberLabel);
        NewOwnerPanel.add(ownerIDLabel);
        NewOwnerPanel.add(ABNLabel);

        NewOwnerPanel.add(phoneNumberInput);
        NewOwnerPanel.add(ownerIDInput);
        NewOwnerPanel.add(ABNInput);

        NewOwnerPanel.add(saveButton);
        NewOwnerPanel.add(clearButton);
        NewOwnerPanel.add(new JLabel("        "));

        NewOwnerPanel.add(new JLabel("        "));
        NewOwnerPanel.add(new JLabel("        "));
        NewOwnerPanel.add(new JLabel("        "));

        ownerView.setText("Owner Information");

        this.add(checkBoxPanel);
        this.add(NewOwnerPanel, BorderLayout.NORTH);
        this.add(ownerView, BorderLayout.CENTER);

        saveButton.addActionListener(this);
        clearButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Save")) {
            Object source = e.getSource();
            if (source == saveButton) {
                Owner myOwner = new Owner(this.ownerIDInput.getText(), this.firstNameInput.getText(), this.secondNameInput.getText(), 
                        this.addressInput.getText(), this.phoneNumberInput.getText());
                Assignment_1_Experiment.ownerArray.add(myOwner);
            }
        }
        if (e.getActionCommand().equals("Clear")) {
            Object source = e.getSource();
            if (source == clearButton) {
                firstNameInput.setText("");
                secondNameInput.setText("");
                addressInput.setText("");
                phoneNumberInput.setText("");
                ownerIDInput.setText("");
                ABNInput.setText("");
            }
        }
    }
}
