/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visualizer;

/**
 *
 * @author bertrambock
 */
public class graphValidator {
// Checks if a vertex ID is empty
    public static boolean isValidVertex(String vertexID) {

        if (vertexID == null || vertexID.trim().isEmpty()) {
            return false;
        }

        return true;
    }

    // Checks that the two vertices are not the same
    public static boolean isSelfLoop(String vertex1, String vertex2) {

        if (vertex1.equals(vertex2)) {
            return true;
        }

        return false;
    }

    // Checks if the weight is valid
    public static boolean isValidWeight(String weight) {

        try {
            int number = Integer.parseInt(weight);

            if (number <= 0) {
                return false;
            }

            return true;

        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Displays an error message
    public static void showError(String message) {

        javax.swing.JOptionPane.showMessageDialog(
                null,
                message,
                "Invalid Input",
                javax.swing.JOptionPane.ERROR_MESSAGE
        );
    }    
}
