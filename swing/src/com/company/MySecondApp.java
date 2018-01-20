package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class MySecondApp extends JFrame implements ActionListener {

    private JTextArea textArea;
    private JButton generateRandomTextBtn;
    private JButton toUpperCaseBtn;
    private JButton saveBtn;
    JMenuItem openFileItem = new JMenuItem("Open...");
    JMenuItem exitItem = new JMenuItem("Exit");

    private String[] nouns = {"dog", "car", "food", "onion", "person"};
    private String[] verbs = {"eat", "drink", "go", "run", "drive"};
    private String[] concatenators = {"and", "then", "but", "as always", "as long as"};

    public MySecondApp() {
        super("My second app");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        initComponents();
        //pack();
    }

    private void initComponents() {
        JPanel textPanel = new JPanel();
        textArea = new JTextArea(15, 25);
        textArea.setText("Ala ma konta \n ala ma kota2");
        textPanel.add(textArea);

        JPanel btnPanel = new JPanel();
        generateRandomTextBtn = new JButton("Generate random text");
        generateRandomTextBtn.addActionListener(this);
        toUpperCaseBtn = new JButton("To uppercase");
        toUpperCaseBtn.addActionListener(e -> textArea.setText(textArea.getText().toUpperCase()));
        saveBtn = new JButton("Save");
        saveBtn.addActionListener((ActionEvent e) -> {
            try {
                Files.createFile(Paths.get("./tmp.txt"));
                FileOutputStream os = new FileOutputStream("./tmp.txt");
                os.write(textArea.getText().getBytes());
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
            }
        });
        btnPanel.add(saveBtn);

        btnPanel.add(generateRandomTextBtn);
        btnPanel.add(toUpperCaseBtn);


        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        openFileItem.addActionListener(this);
        exitItem.addActionListener(this);
        fileMenu.add(openFileItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        add(btnPanel, BorderLayout.SOUTH);
        add(textPanel, BorderLayout.CENTER);

        pack();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == generateRandomTextBtn) {
            generateRandomText();
        } else if (actionEvent.getSource() == openFileItem) {
            openFile();
        } else if(actionEvent.getSource() == exitItem) {
            System.exit(0);
        }
    }

    private void generateRandomText() {
        int length = ((int)Math.floor((Math.random() * 10) % 3)+1);
        String out = "";
        int nounId;
        int verbId;
        int concatId;

        for(int i = 0; i < length; i++) {
            nounId = ThreadLocalRandom.current().nextInt(0,  5);
            verbId = ThreadLocalRandom.current().nextInt(0,  5);
            concatId = ThreadLocalRandom.current().nextInt(0,  5);
            out += nouns[nounId] + " " +verbs[verbId] + " " +nouns[verbId]+ " "+concatenators[concatId] + " ";
        }

        textArea.setText(out);
    }

    private void openFile()
    {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(false);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setCurrentDirectory(new File("."));
        int returnVal = fileChooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Open file: "+selectedFile.getName());
            try {
                textArea.setText(Files.readAllLines(selectedFile.toPath()).toString());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }

    }
}
