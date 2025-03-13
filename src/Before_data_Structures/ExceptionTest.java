package Before_data_Structures;
import java.util.Scanner;

    public class ExceptionTest {
        public static void main(String[] args) {
            try {
                double userRadius = getPositiveRadius();
                System.out.println("The entered radius is: " + userRadius);
            } catch (Exception e) {
                System.err.println("An error occurred: " + e.getMessage());
            }
        }

        private static double getPositiveRadius() throws Exception {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                try {
                    System.out.print("Enter the radius: ");
                    double radius = Double.parseDouble(scanner.nextLine());

                    if (radius < 0) {
                        throw new Exception("Radius cannot be negative. Please enter a positive value.");
                    }

                    return radius;
                } catch (NumberFormatException e) {
                    System.err.println("Error: Please enter a valid number.");
                } catch (Exception e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }
        }
    }

