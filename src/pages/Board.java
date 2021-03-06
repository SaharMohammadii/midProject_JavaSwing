package pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import main.Config;

public class Board extends JFrame {
    private JPanel jPanel;
    public Board() throws HeadlessException {
        jPanel = new JPanel();//config panel
        JButton subBtn = new JButton("Submit");
        JButton resBtn = new JButton("Reset");
        jPanel.add(subBtn);
        jPanel.add(resBtn);
        jPanel.setSize(150,Config.HEIGHT*40);
        jPanel.setLocation(Config.WIDTH*40 + 2,1);
        // whole page
        setSize(Config.WIDTH*40 + 17 + 150 , Config.HEIGHT * 40 + 42);
        setLocation(500, 100);
        setTitle("Game");
        setResizable(false);
        Image img = new ImageIcon("E:\\University\\Semester 2\\Advance Programming\\Projects\\midProject_JavaSwing\\src\\elements\\assets\\logo.jpg").getImage();
        setIconImage(img);
        BoardComponent bcmp = new BoardComponent();
        add(jPanel);
        add(bcmp);
        getContentPane().setBackground(Color.orange);
    }
    static class BtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}

class BoardComponent extends JComponent{
    @Override
    protected void paintComponent(Graphics g) {
        Rectangle2D rectangle2D;
        Graphics2D graphics2D = (Graphics2D)g;
        Image BackImg1 = new ImageIcon("E:\\University\\Semester 2\\Advance Programming\\Projects\\midProject_JavaSwing\\src\\elements\\assets\\download.png").getImage();
        Image BackImg2 = new ImageIcon("E:\\University\\Semester 2\\Advance Programming\\Projects\\midProject_JavaSwing\\src\\elements\\assets\\download1.png").getImage();
        for(int i=1,ic=0;i<Config.HEIGHT*40;i+=40,ic++)
            for(int j = 1,jc=0; j<Config.WIDTH *40; j+=40,jc++)
                if((ic+jc)%2==0){
                    rectangle2D = new Rectangle2D.Double(j,i,40,40);
                    graphics2D.setPaint(new Color(44, 175, 176));
                    graphics2D.fill(rectangle2D);
                    graphics2D.draw(rectangle2D);
                } else{
                    rectangle2D = new Rectangle2D.Double(j,i,40,40);
                    graphics2D.setPaint(new Color(176, 115, 159));
                    graphics2D.fill(rectangle2D);
                    graphics2D.draw(rectangle2D);
                }
    }
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(Config.WIDTH*40 + 1, Config.HEIGHT*40 + 1);
    }
}
//class ConfigPanel extends JPanel{
//    JPanel jPanel = new JPanel();
//    public ConfigPanel(JPanel jPanel) {
//       JButton subBtn = new JButton("Submit");
//       JButton resBtn = new JButton("Reset");
//       jPanel.add(subBtn);
//    }
//    public ConfigPanel() {
//
//    }
//}