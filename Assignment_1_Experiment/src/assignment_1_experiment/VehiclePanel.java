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

public class VehiclePanel extends JPanel implements ActionListener {

    JPanel NewVehiclePanel = new JPanel();

    JLabel vehicleIDLabel = new JLabel("Plate Number: ");
    JLabel engineCapacityLabel = new JLabel("Engine Capacity: ");
    JLabel makeLabel = new JLabel("Make: ");
    JLabel modelLabel = new JLabel("Model: ");
    JLabel yearLabel = new JLabel("Year: ");
    JLabel ownerIDLabel = new JLabel("Owner Licence Number");

    JTextField vehicleIDInput = new JTextField(40);
    JTextField engineCapacityInput = new JTextField(40);
    JTextField makeInput = new JTextField(40);
    JTextField modelInput = new JTextField(40);
    JTextField yearInput = new JTextField(40);
    JTextField ownerIDInput = new JTextField(40);

    JTextArea vehicleView = new JTextArea();

    JButton saveButton = new JButton("Save");
    JButton clearButton = new JButton("Clear");

    public VehiclePanel() {
        this.setLayout(new BorderLayout());

        NewVehiclePanel.setLayout(new GridLayout(6, 6));

        NewVehiclePanel.add(vehicleIDLabel);
        NewVehiclePanel.add(engineCapacityLabel);
        NewVehiclePanel.add(makeLabel);

        NewVehiclePanel.add(vehicleIDInput);
        NewVehiclePanel.add(engineCapacityInput);
        NewVehiclePanel.add(makeInput);

        NewVehiclePanel.add(modelLabel);
        NewVehiclePanel.add(yearLabel);
        NewVehiclePanel.add(ownerIDLabel);

        NewVehiclePanel.add(modelInput);
        NewVehiclePanel.add(yearInput);
        NewVehiclePanel.add(ownerIDInput);

        NewVehiclePanel.add(saveButton);
        NewVehiclePanel.add(clearButton);
        NewVehiclePanel.add(new JLabel("        "));

        NewVehiclePanel.add(new JLabel("        "));
        NewVehiclePanel.add(new JLabel("        "));
        NewVehiclePanel.add(new JLabel("        "));

        vehicleView.setText("Vehicle Information");

        this.add(NewVehiclePanel, BorderLayout.NORTH);
        this.add(vehicleView, BorderLayout.CENTER);//?

        saveButton.addActionListener(this);
        clearButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Save")) {
            Object source = e.getSource();
            if (source == saveButton) {
                Vehicle myVehicle;
                myVehicle = new Vehicle(this.vehicleIDInput.getText(), this.engineCapacityInput.getText(),
                        this.makeInput.getText(), this.modelInput.getText(), this.yearInput.getText());
                Assignment_1_Experiment.vehicleArray.add(myVehicle);
            }
        }
        if (e.getActionCommand().equals("Clear")) {
            Object source = e.getSource();
            if (source == clearButton) {
                vehicleIDInput.setText("");
                engineCapacityInput.setText("");
                makeInput.setText("");
                modelInput.setText("");
                yearInput.setText("");
                ownerIDInput.setText("");
            }
        }
    }

}
