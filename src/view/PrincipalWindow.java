package view;

import controller.ActorController;
import controller.CinemaController;
import controller.DirectorController;
import controller.PrincipalController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalWindow extends JFrame {

    private JButton btnMovie;
    private JButton btnDirector;
    private JButton btnActor;
    private JPanel windowPanel;

    public PrincipalWindow() {

        setContentPane(windowPanel);
        setTitle("Menu Principal");
        setSize(900, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setButtons();

        ButtonListener action = new ButtonListener();
        addListener(action);
        setVisible(true);
    }

    public void addListener(ActionListener action) {
        btnActor.addActionListener(action);
        btnDirector.addActionListener(action);
        btnMovie.addActionListener(action);
    }

    public void setButtons() {
        btnActor.setActionCommand("1");
        btnDirector.setActionCommand("2");
        btnMovie.setActionCommand("3");
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(windowPanel, errorMessage, " WARNING ERROR", JOptionPane.ERROR_MESSAGE);
    }

    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(windowPanel, message);
    }


    private class ButtonListener implements ActionListener {

        private ButtonListener() {
        }

        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch (valor) {
                case 1:
                    //ACTOR
                    ActorWindow actorWindow = new ActorWindow();
                    dispose();

                    break;
                case 2:
                    //DIRECTOR
                    DirectorController directorController = new DirectorController();
                    dispose();
                    break;

                case 3:
                    //PELÍCULA
                    CinemaController cinemaController = new CinemaController();
                    dispose();
                    break;
            }
        }
    }


}
