import javax.swing.JOptionPane;

public class equation {
    public static void main(String[] args) {
        int e = Integer.parseInt(JOptionPane.showInputDialog("Enter equation type \n" +
                " (1:ax + b = 0; 2: a1x + b1 = c1, a2x + b2 = c2; 3:ax^2 + bx + c = 0):"));
        if (e == 1 ) {
            double a, b;
            a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
            b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));

            if (a == 0) {
                if (b == 0)
                    JOptionPane.showMessageDialog(null, "Vô số nghiệm");
                else
                    JOptionPane.showMessageDialog(null, "Vô nghiệm");
            } else {
                double x = -b / a;
                JOptionPane.showMessageDialog(null, "Nghiệm x = " + x);
            }
        }
        else if (e == 2) {
            double a1, b1, c1, a2, b2, c2;
            a1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a1:"));
            b1 = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));
            c1 = Double.parseDouble(JOptionPane.showInputDialog("Enter c1:"));

            a2 = Double.parseDouble(JOptionPane.showInputDialog("Enter a2:"));
            b2 = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));
            c2 = Double.parseDouble(JOptionPane.showInputDialog("Enter c2:"));

            double D = a1 * b2 - a2 * b1;
            double D1 = c1 * b2 - c2 * b1;
            double D2 = a1 * c2 - a2 * c1;

            if (D == 0) {
                if (D1 == 0 && D2 == 0)
                    JOptionPane.showMessageDialog(null, "Hệ có vô số nghiệm");
                else
                    JOptionPane.showMessageDialog(null, "Hệ vô nghiệm");
            } else {
                double x1 = D1 / D;
                double x2 = D2 / D;
                JOptionPane.showMessageDialog(null, "x1 = " + x1 + ", x2 = " + x2);
            }
        }

        else if (e == 3) {
            double a, b, c;
            a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
            b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));
            c = Double.parseDouble(JOptionPane.showInputDialog("Enter c:"));

            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        JOptionPane.showMessageDialog(null, "Vô số nghiệm");
                    } else {
                        JOptionPane.showMessageDialog(null, "Vô nghiệm");
                    }
                } 
                else {
                    double x = -c / b;
                    JOptionPane.showMessageDialog(null, "Nghiệm x = " + x);
                }
            } else {
                double delta = b * b - 4 * a * c;

                if (delta < 0) {
                    JOptionPane.showMessageDialog(null, "Vô nghiệm");
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    JOptionPane.showMessageDialog(null, "Nghiệm kép x = " + x);
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    JOptionPane.showMessageDialog(null, "x1 = " + x1 + ", x2 = " + x2);
                }
            }
        }

        System.exit(0);
    }
}
