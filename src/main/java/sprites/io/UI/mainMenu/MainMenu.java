package sprites.io.UI.mainMenu;

import sprites.io.UI.MainUI;
import sprites.io.UI.canvaspanel.Canvas;
import sprites.io.file.FileManager;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainMenu extends JPanel implements ActionListener
{
    private JFrame mainFrame = new JFrame();

    private JPanel mainPanel = new JPanel();
    private JPanel topPanel = new JPanel();

    private JLabel mainMenulbl = new JLabel("SPRITES.IO");
    private JLabel mainMenuPiclbl = new JLabel();
    private JLabel mainMenuPic2lbl = new JLabel();
    private JButton resumeBtn = new JButton("RESUME");
    private JButton openBtn = new JButton("OPEN");
    private JButton newBtn = new JButton("NEW");

    private GridLayout mainMenLayout = new GridLayout(1,3);
    private GridLayout mainMenuLayoutTop = new GridLayout(2,0);

    private FileManager fileManager = new FileManager();
    private Canvas canvasRef;

    public MainMenu() {
        this.createDisplay();
    }

    public void createDisplay()
    {
        mainFrame.setSize(384,128);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(mainMenuLayoutTop);
        mainFrame.setResizable(false);

        topPanel.setLayout(mainMenLayout);
        topPanel.add(mainMenuPiclbl);
        topPanel.add(mainMenulbl);
        topPanel.add(mainMenuPic2lbl);

        mainFrame.add(topPanel);

        mainPanel.setLayout(mainMenLayout);
        mainPanel.setBackground(Color.black);

        resumeBtn.setSize(128,128);
        openBtn.setSize(128,128);
        newBtn.setSize(128,128);

        newBtn.addActionListener(this);
        openBtn.addActionListener(this);
        resumeBtn.addActionListener(this);

        mainPanel.add(resumeBtn);
        mainPanel.add(openBtn);
        mainPanel.add(newBtn);

        mainFrame.add(mainPanel);

        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openBtn) {

            System.out.println("opening file");

        }

        if (e.getSource() == newBtn)
        {
            mainFrame.setVisible(false);

            new MainUI();
        }

        if (e.getSource() == resumeBtn){

        }
    }
}
