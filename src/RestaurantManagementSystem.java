import java.awt.*;
import javax.swing.*;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("Restaurant Management System");

        // Set the frame's size
        frame.setSize(600, 400);

        // Terminate the program when the user closes the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set a layout manager for the frame
        frame.setLayout(new BorderLayout());

        // Create a label for the top of the frame
        JLabel titleLabel = new JLabel("Welcome to the Restaurant Management System");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add the label to the top of the frame
        frame.add(titleLabel, BorderLayout.NORTH);

        // Create a panel for the center of the frame
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3, 2));

        // Create labels and text fields for the center panel
        JLabel tableNumberLabel = new JLabel("Table Number:");
        JTextField tableNumberField = new JTextField();
        JLabel numberOfGuestsLabel = new JLabel("Number of Guests:");
        JTextField numberOfGuestsField = new JTextField();
        JLabel specialRequestsLabel = new JLabel("Special Requests:");
        JTextField specialRequestsField = new JTextField();

        // Add the labels and text fields to the center panel
        centerPanel.add(tableNumberLabel);
        centerPanel.add(tableNumberField);
        centerPanel.add(numberOfGuestsLabel);
        centerPanel.add(numberOfGuestsField);
        centerPanel.add(specialRequestsLabel);
        centerPanel.add(specialRequestsField);

        // Add the center panel to the center of the frame
        frame.add(centerPanel, BorderLayout.CENTER);

        // Create a panel for the bottom of the frame
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());

        // Create buttons for the bottom panel
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");

        // Add the buttons to the bottom panel
        bottomPanel.add(submitButton);
        bottomPanel.add(cancelButton);

        // Add the bottom panel to the bottom of the frame
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Display the frame
        frame.setVisible(true);
    }
}
