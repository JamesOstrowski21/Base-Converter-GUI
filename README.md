# Base-Converter-GUI

## Problem Statement
Create a conversion program to convert a number between any two bases [2,8,10,16,32]. As the user types in the box, 
the converted number should be shown in real-time. Include a mechanism that switched between selected bases without 
having to manually select them.

## Developer Documentation
This program consists of 4 files BaseChangeGUI.fxml, BaseChangeGUIController.java, BaseChangeGUIDriver.java, and 
BaseConversionGUI.java. BaseChangeGUI.fxml stores the fxml code generated from Scene Builder. BaseChangeGUIController.java 
stores the FX ID variables along with two methods swapBase() and changeBase() used in the GUI. swapBase() changes the newBase 
value automatically and recalculates the converted number with the new base. The changeBase() method automatically calculates 
the converted number when the user types in the textField. BaseChangeGUIDriver.java contains the main method and the start method 
that takes in the fxml file and launches it. The last class BaseConversionGUI.java is the class that contains the math and convert() 
method that converts the number between bases. It is called within the changeBase() method in BaseChangeGUIController.java.

## User Documentation
Run the class BaseChangeGUIDriver.java; once it launches select your original base and the base you would like the number to be converted 
to from the Comboboxes labeled as such. After that type in the Original Number text box and the converted number will be outputted in real-time 
in the New Number box. If you wish to change the new base without having to select a new one, press the swap button next to the combobox.
