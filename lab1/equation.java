import javax.swing.JOptionPane;

public class equation {
    public static void main(String[] args) {
        double a, b;
        a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));

        if (a == 0) {
            if (b == 0)
                JOptionPane.showMessageDialog(null, "Vô số nghiệm");
            else
                JOptionPane.showMessageDialog(null, "Vô nghiệm");
        }
        else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, "Nghiệm x = " + x);
        }

        double a11, a12, b1, a21, a22, b2;
        a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11:"));
        a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12:"));
        b1  = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));

        a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21:"));
        a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22:"));
        b2  = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));

        double D  = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0)
                JOptionPane.showMessageDialog(null, "Hệ có vô số nghiệm");
            else
                JOptionPane.showMessageDialog(null, "Hệ vô nghiệm");
        }
        else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            JOptionPane.showMessageDialog(null, "x1 = " + x1 + ", x2 = " + x2);
        }

        double a2, b22, c;
        a2 = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
        b22 = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Enter c:"));

        if (a2 == 0) {
            if (b22 == 0) {
                if (c == 0) {
                    JOptionPane.showMessageDialog(null, "Vô số nghiệm");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Vô nghiệm");
                }
            }
            else {
                double x = -c / b22;
                JOptionPane.showMessageDialog(null, "Nghiệm x = " + x);
            }
        }
        else {
            double delta = b22 * b22 - 4 * a2 * c;

            if (delta < 0) {
                JOptionPane.showMessageDialog(null, "Vô nghiệm");
            }
            else if (delta == 0) {
                double x = -b22 / (2 * a2);
                JOptionPane.showMessageDialog(null, "Nghiệm kép x = " + x);
            }
            else {
                double x1 = (-b22 + Math.sqrt(delta)) / (2 * a2);
                double x2 = (-b22 - Math.sqrt(delta)) / (2 * a2);
                JOptionPane.showMessageDialog(null, "x1 = " + x1 + ", x2 = " + x2);
            }
        }

        System.exit(0);
    }
}