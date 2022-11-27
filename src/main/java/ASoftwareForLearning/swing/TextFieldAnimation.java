
package ASoftwareForLearning.swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class TextFieldAnimation extends JTextField {

    private Color animationColor = new Color(2, 175, 255);
    private Color backgroColor = Color.WHITE;
    private final ImageIcon iconSearch;
    private final ImageIcon iconClose;
    private final ImageIcon iconLoading;
    private String hintText = "Search . . . ";
    private Timer timer;
    private boolean show;
    private float speed = 1f;
    private float location = -1;
    
    
    
    public TextFieldAnimation() {
        setBackground(new Color(255, 255, 255, 0));
        setOpaque(false);
        setBorder(new EmptyBorder(10, 10, 10, 50));
        setFont(new Font("Segoe UI", 0, 14));
        setSelectionColor(new Color(80, 199, 255));
        
        //icon
        
        iconSearch = new ImageIcon("C:\\Projects\\UniversityProject\\ASoftwareForLearning\\app\\src\\main\\java\\ASoftwareForLearning\\swing\\search.png");
        iconClose = new ImageIcon("C:\\Projects\\UniversityProject\\ASoftwareForLearning\\app\\src\\main\\java\\ASoftwareForLearning\\swing\\close.png");
        iconLoading = new ImageIcon("C:\\Projects\\UniversityProject\\ASoftwareForLearning\\app\\src\\main\\java\\ASoftwareForLearning\\swing\\loading.gif");
        
        //check mouse
        addMouseMotionListener( new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
            
                if(checkMouseOver(e.getPoint())){
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                }else{
                       setCursor(new Cursor(Cursor.TEXT_CURSOR));
                }
            
            
            }
        });
        
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                
                if(SwingUtilities.isLeftMouseButton(e)){
                    if(checkMouseOver(e.getPoint())){
                        if(!timer.isRunning()){
                            
                            if(show){
                                setEditable(true);
                                show = false;
                                location = -1;
                            }else{
                                setEditable(false);
                                show = true;
                                location = getWidth();
                                timer.start();
                            }
                            
                            
                        }
                        
                        
                        
                        
                    }
                }
            
            }
        }
);
        
        timer = new Timer(-10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
                if(show){
                        if(location > 0){
                            location -= speed;
                            repaint();
                        }else{
                            timer.stop();
                            
                        }
                }else{
                    if(location < getWidth()){
                        location += speed;
                        repaint();
                    }else{
                        timer.stop();            
                    }        
                }
            }
        });
        
        
    
    }

    @Override
    protected void paintComponent(Graphics g) {
        
        int width = getWidth();
        int height = getHeight();
        
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //for smooth line
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR); // for smooth image
        g2.setColor(backgroColor);
        g2.fillRoundRect(0, 0, width, height, height, height);
        //create button
        
        int marginButton = 5;
        int buttonSize = height - marginButton  * 2;
        GradientPaint gradientPaint = new GradientPaint(0, 0, new Color(255, 255, 255), width, 0, animationColor);
        g2.setPaint(gradientPaint);
        g2.fillOval(width - height + 3, marginButton, buttonSize, buttonSize);
        
        //create animation when clicked
        
        if(location != -1){
            g2.fillRoundRect((int)location, 0, (int) (width - location), height, height, height);
            
            //create loading icon
            int iconSize = iconLoading.getIconHeight();
            //create alpha
            
            
            
            g2.drawImage(((ImageIcon) iconLoading).getImage(), (int)(location + 5), (int)(height - iconSize) / 2,  this);
            
            
        }
         
        
        
        
        super.paintComponent(g); 
        
        
        //create button icon
        int marginImage = 5;
        int imageSize = buttonSize - marginImage * 2;
        
        Image image = ((ImageIcon) iconSearch).getImage();
        g2.drawImage(image, width - height + marginImage + 3, marginButton + marginImage, imageSize, imageSize, null);
        g2.dispose();
        
        



    }
    
    
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (getText().length() == 0) {
            int h = getHeight();
            ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            Insets ins = getInsets();
            FontMetrics fm = g.getFontMetrics();
            int c0 = getBackground().getRGB();
            int c1 = getForeground().getRGB();
            int m = 0xfefefefe;
            int c2 = ((c0 & m) >>> 1) + ((c1 & m) >>> 1);
            g.setColor(new Color(c2, true));
            g.drawString(hintText, ins.left, h / 2 + fm.getAscent() / 2 - 2);
        }
    }

    
    private float getAlpha(){
        
        float width = getWidth()/2 26:55
        
    }
    private boolean checkMouseOver(Point mouse){
        int width = getWidth();
        int height = getHeight();
        int marginButton = 5;
        int buttonSize = height - marginButton * 2;
        
        Point point = new Point(width - height + 3, marginButton);
        Ellipse2D.Double circle = new Ellipse2D.Double(point.x, point.y,  buttonSize, buttonSize);
        
        
        return circle.contains(mouse);
    }
    
    
    
    
}
