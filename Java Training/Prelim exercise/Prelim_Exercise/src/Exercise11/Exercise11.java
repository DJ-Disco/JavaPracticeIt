package Exercise11;

import javax.swing.JOptionPane;

public class Exercise11 {

    public static void main(String[] args) {
        Checkup checkup1 = new Checkup();
        Checkup checkup2 = new Checkup();
        Checkup checkup3 = new Checkup();
        Checkup checkup4 = new Checkup();

        JOptionPane.showMessageDialog(null, "Enter data for Patient 1");
        checkup1 = getData(checkup1);
        JOptionPane.showMessageDialog(null, "Enter data for Patient 2");
        checkup2 = getData(checkup2);
        JOptionPane.showMessageDialog(null, "Enter data for Patient 3");
        checkup3 = getData(checkup3);
        JOptionPane.showMessageDialog(null, "Enter data for Patient 4");
        checkup4 = getData(checkup4);

        System.out.println("Patient 1:");
        showValues(checkup1);
        
        System.out.println("Patient 2:");
        showValues(checkup2);

        System.out.println("Patient 3:");
        showValues(checkup3);

        System.out.println("Patient 4:");
        showValues(checkup4);

    }
    public static Checkup getData(Checkup checkup){

        checkup.setPatientNumber(Integer.parseInt(JOptionPane.showInputDialog("Set Patient Number:")));

        checkup.setSystolicFigure(Integer.parseInt(JOptionPane.showInputDialog("Set Systolic Figure:")));

        checkup.setDiastolicFigure(Integer.parseInt(JOptionPane.showInputDialog("Set Diastolic Figure:")));

        checkup.setLDL(Double.parseDouble(JOptionPane.showInputDialog("Set LDL:")));

        checkup.setHDL(Integer.parseInt(JOptionPane.showInputDialog("Set HDL:")));

        return checkup;
    }
    public static void showValues(Checkup checkup){

        System.out.println("Patient Number is "+checkup.getPatientNumber());
        
        System.out.println("Blood Pressure values are "+checkup.getSystolicFigure()+"/"+checkup.getDiastolicFigure());
        
        checkup.explainRatio();

        System.out.println("Cholosterol Values are "+checkup.getLDL()+" and "+checkup.getHDL());
        
        System.out.println("Cholesterol Ratio is "+checkup.computeRatio());
        
        System.out.println();
    }
}
