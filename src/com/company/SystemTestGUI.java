package com.company;

import javax.swing.*;

public class SystemTestGUI
{

    public static void main(String[] args) {

        System system = new System("HP", "4YR38AA", 4);


        JTextArea outputArea = new JTextArea();


        String[] possibilities =
                {
                        "Print System Details",
                        "Display System Properties",
                        "Diagnose System",
                        "Set Details",
                        "Set Cost"
                };

        //loop will repeat until user selects 'cancel'
        while (true)
        {

        //if the function has an output this will be set to true and the output will be displayed
        boolean displayBox = false;

        String input = (String) JOptionPane.showInputDialog
        (
          null, "Please make a selection to develop the computer system", "developmentOptions", JOptionPane.QUESTION_MESSAGE, null,
           possibilities, possibilities[0]
        );


        // Any outputs are displayed in both a JOptionPane dialogue box and on the console

        if (input.equals("Print System Details"))
        {
            String displayDetails = system.displayDetails();
            java.lang.System.out.println(displayDetails);
            outputArea.setText( displayDetails );
            displayBox = true;

        }

        else if (input.equals("Display System Properties"))
        {
            String systemProperties = system.displaySystemProperties();
            java.lang.System.out.println(system.displaySystemProperties());
            outputArea.setText( systemProperties );
            displayBox = true;

        }

        else if (input.equals("Diagnose System"))
        {
            String diagnosis = system.diagnoseSystem();
            java.lang.System.out.println(system.diagnoseSystem());
            outputArea.setText( diagnosis );
            displayBox = true;

        }


        else if (input.equals("Set Details"))
        {
            int memorySize = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the new memory size",
                    "Memory Size", JOptionPane.INFORMATION_MESSAGE));
            system.setMemory(memorySize);

            double hardDiskSize = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the new hard disk size",
                    "hard disk size", JOptionPane.INFORMATION_MESSAGE));
            system.setHardDisk(hardDiskSize);
        }

        else if (input.equals("Set Cost"))
        {
            int cost = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the new cost",
                    "Memory Size", JOptionPane.INFORMATION_MESSAGE));
            system.setPurchaseCost(cost);

        }


        if(displayBox)
        {
            JOptionPane.showMessageDialog( null, outputArea,
                    "System Output",JOptionPane.INFORMATION_MESSAGE );
        }


    }
  }
}

