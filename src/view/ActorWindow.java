package view;

import controller.ActorController;
import controller.PrincipalController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActorWindow extends JFrame {

    //-------------------------------
    private JTextField txtID;
    private JTextField txtName;
    private JTextField txtAwards;
    private JTable dataTable;
    private JScrollPane scrollPane;
    private JButton btnAdd;
    private JButton btnSearch;
    private JButton btnList;
    private JButton btnUpdate;
    private JButton btnExit;
    private JPanel windowPanel;

    //-------------------------------

    public ActorWindow() {

        setContentPane(windowPanel);
        setTitle("Administrador Actores");
        setSize(900, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setButtons();
        createTable();

        setVisible(true);
    }

    public String getTxtID() {
        return txtID.getText();
    }

    public String getTxtName() {
        return txtName.getText();
    }

    public String getTxtAwards() {
        return txtAwards.getText();
    }

    public void setButtons() {
        AddButtonListener addAction = new AddButtonListener();
        this.btnAdd.addActionListener(addAction);

        SearchButtonListener searchAction = new SearchButtonListener();
        this.btnSearch.addActionListener(searchAction);

        ListButtonListener listAction = new ListButtonListener();
        this.btnList.addActionListener(listAction);

        UpdateButtonListener updateAction = new UpdateButtonListener();
        this.btnUpdate.addActionListener(updateAction);

        ExitButtonListener exitAction = new ExitButtonListener();
        this.btnExit.addActionListener(exitAction);
    }

    public void createTable() {
        Object data[][] = {
                {1, "Matt Damon", 10},
                {},
                {}
        };
        dataTable.setModel(new DefaultTableModel(
                data,
                new String[]{"Id", "Nombre", "Premios"}
        ));
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(windowPanel, errorMessage, " WARNING ERROR", JOptionPane.ERROR_MESSAGE);
    }

    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(windowPanel, message);
    }

    //--------------------------------------------------------------------------
    private class AddButtonListener implements ActionListener {

        AddButtonListener() {
        }

        public void actionPerformed(ActionEvent e) {
            System.out.println("Ola Cami TE AMOOOOOOOOOOOOOOOOOOOOO");
        }
    }

    private class SearchButtonListener implements ActionListener {

        SearchButtonListener() {
        }

        public void actionPerformed(ActionEvent e) {
            System.out.println("Toy buscando :D");
        }
    }

    private class ListButtonListener implements ActionListener {

        ListButtonListener() {
        }

        public void actionPerformed(ActionEvent e) {
            System.out.println("Toy listando :D");
        }
    }

    private class UpdateButtonListener implements ActionListener {

        UpdateButtonListener() {
        }

        public void actionPerformed(ActionEvent e) {
            System.out.println("Toy actualizando :D");
        }
    }

    private class ExitButtonListener implements ActionListener {

        ExitButtonListener() {
        }

        public void actionPerformed(ActionEvent e) {
            PrincipalWindow principalWindow = new PrincipalWindow();
            dispose();
        }
    }
}


