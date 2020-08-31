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

public class ExistingVehiclepanel extends JPanel implements ActionListener {

    JPanel panelVehicleInput = new JPanel();

    JLabel vehicleIDLabel = new JLabel("Plate Number: ");
    JLabel engineCapacityLabel = new JLabel("Engine Capacity: ");
    JLabel makeLabel = new JLabel("Make: ");
    JLabel modelLabel = new JLabel("Model: ");
    JLabel yearLabel = new JLabel("Year: ");
    JLabel vehicleOwnerIDLabel = new JLabel("Owner Licence Plate: ");

    JTextField vehicleIDInput = new JTextField(40);
    JTextField engineCapacityInput = new JTextField(40);
    JTextField makeInput = new JTextField(40);
    JTextField modelInput = new JTextField(40);
    JTextField yearInput = new JTextField(40);
    JTextField vehicleOwnerIDInput = new JTextField(40);

    JTextArea vehicleView = new JTextArea();

    JButton SearchByPlateButton = new JButton("Search by plate number");
    JButton SearchByOwnerButton = new JButton("Search by Owner");
    JButton viewAllButton = new JButton("View All");

    public ExistingVehiclepanel() {
        this.setLayout(new BorderLayout());

        panelVehicleInput.setLayout(new GridLayout(3, 4));

        panelVehicleInput.add(vehicleIDLabel);
        panelVehicleInput.add(vehicleIDInput);
        panelVehicleInput.add(new JLabel("        "));
        panelVehicleInput.add(SearchByPlateButton);

        panelVehicleInput.add(vehicleOwnerIDLabel);
        panelVehicleInput.add(vehicleOwnerIDInput);
        panelVehicleInput.add(new JLabel("        "));
        panelVehicleInput.add(SearchByOwnerButton);

        panelVehicleInput.add(new JLabel("        "));
        panelVehicleInput.add(new JLabel("        "));
        panelVehicleInput.add(new JLabel("        "));
        panelVehicleInput.add(viewAllButton);

        vehicleView.setText("Vehicle Information");

        this.add(panelVehicleInput, BorderLayout.NORTH);
        this.add(vehicleView, BorderLayout.CENTER);
        viewAllButton.addActionListener(this);

    }

    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Search by plate number")) {
            Object source = e.getSource();
            String temp = "";
            if (source == SearchByPlateButton) {
                //compare what's in the search to whats in the array and return if found
            }
            if (source == SearchByOwnerButton) {
                //compare what's in the search to what's in the array and return if found
            }
            if (source == viewAllButton) {
                for (int i = 0; i < Assignment_1_Experiment.vehicleArray.size(); i++) {
                    Vehicle aVehicle = (Vehicle) Assignment_1_Experiment.vehicleArray.get(i);
                    temp += aVehicle.toString();
                }
                vehicleView.setText(temp);
            }
        }

    }
}

