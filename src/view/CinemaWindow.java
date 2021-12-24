package view;

import controller.PrincipalController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CinemaWindow extends JFrame{
    private JPanel windowPanel;
    private JTextField txtId;
    private JTable dataTable;
    private JTextField txtName;
    private JComboBox comboDirector;
    private JComboBox comboActor;
    private JButton btnAdd;
    private JButton btnSearch;
    private JButton btnList;
    private JButton btnUpdate;
    private JButton btnExit;

    public CinemaWindow(){

        setContentPane(windowPanel);
        setTitle("Administrador de Peliculas");
        setSize(900,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setButtons();
        createTable();
        ButtonListener listener = new ButtonListener();
        addListener(listener);
    }

    public String getTxtId() {
        return txtId.getText();
    }

    public String getTxtName() {
        return txtName.getText();
    }

    public String getComboDirector() {
        return (String) comboDirector.getSelectedItem();
    }

    public String getComboActor() {
        return (String) comboActor.getSelectedItem();
    }

    public void addListener(ButtonListener action){
        btnAdd.addActionListener(action);
        btnExit.addActionListener(action);
        btnList.addActionListener(action);
        btnSearch.addActionListener(action);
        btnUpdate.addActionListener(action);
    }

    public void setButtons() {
        btnAdd.setActionCommand("1");
        btnExit.setActionCommand("2");
        btnList.setActionCommand("3");
        btnSearch.setActionCommand("4");
        btnUpdate.setActionCommand("5");
    }

    public void createTable(){
        Object data[][] = {
                {14,"Good Fellas", 2.5, "Martin Scorcese", "Jeff Goldblum"},
                {},
                {}
        };
        dataTable.setModel(new DefaultTableModel(
                data,
                new String[]{"Id","Nombre","Duracion", "Director", "Actor Principal"}
        ));
    }

    public void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(windowPanel, errorMessage, " WARNING ERROR", JOptionPane.ERROR_MESSAGE);
    }

    public void displayMessage(String message){
        JOptionPane.showMessageDialog(windowPanel, message);
    }

    private class ButtonListener implements ActionListener {

        private ButtonListener() {
        }

        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch (valor) {
                case 1:
                    //ADD

                    break;
                case 2:
                    //EXIT
                    PrincipalController principalController = new PrincipalController();
                    dispose();
                    break;

                case 3:
                    //LIST

                    break;

                case 4:
                    //SEARCH

                    break;

                case 5:
                    //UPDATE

                    break;
            }
        }
    }


}
