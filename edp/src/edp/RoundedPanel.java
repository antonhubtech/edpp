/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exammanagementsystemf;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author ANTON
 */
public class RoundedPanel extends JPanel{
    private int cornerRadius = 20; // 👈 adjust this

    public RoundedPanel(int radius) {
        this.cornerRadius = radius;
        setOpaque(false); // important for transparency
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // semi-transparent color (blur effect)
        g2.setColor(new Color(255, 255, 255, 120));

        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);
    }
}
