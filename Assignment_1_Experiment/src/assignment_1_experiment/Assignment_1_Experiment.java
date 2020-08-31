
package assignment_1_experiment;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Assignment_1_Experiment extends JFrame{

    public static ArrayList<Owner> ownerArray;
    public static ArrayList<Vehicle> vehicleArray;

    public Assignment_1_Experiment()
    {   
        super("Queensland Road and Transport Authority Application");
        
        ownerArray = new ArrayList();
        vehicleArray = new ArrayList();
        
        JPanel mainPanel=new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Add New Owner Record", new OwnerPanel());
        tabbedPane.addTab("Add New Vehicle Record", new VehiclePanel());
        tabbedPane.addTab("View Existing Owner Record",  new ExistingOwnerpanel());
        tabbedPane.addTab("View Existing Vehicle Record",  new ExistingVehiclepanel());
        
        JLabel titleLabel=new JLabel("Queensland Road and Transport Authority");
        mainPanel.add(titleLabel,BorderLayout.NORTH);
        mainPanel.add(tabbedPane,BorderLayout.CENTER);
        add(mainPanel);
        }
    
     public static void main(String[] args) {
        Assignment_1_Experiment transportAuthorityApplication=new Assignment_1_Experiment();
        transportAuthorityApplication.setVisible(true);
        transportAuthorityApplication.setSize(1000, 700);
        transportAuthorityApplication.setDefaultCloseOperation(Assignment_1_Experiment.EXIT_ON_CLOSE);
         }

    
}
