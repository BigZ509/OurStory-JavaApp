import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class OurStory extends JFrame {

    public OurStory() {  //creates a constructor

        //Window setup

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setSize(1200, 700);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(176, 224, 230));
        


        // load  orginal Image files

        ImageIcon originalImageIcon1 = new ImageIcon("C:\\Users\\Glass\\Documents\\ourStory\\src\\images\\oustoryimage1.png");
        ImageIcon originalImageIcon2 =  new ImageIcon("C:\\Users\\Glass\\Documents\\ourStory\\src\\images\\our story image2.png");
        ImageIcon originalImageIcon3 = new ImageIcon("C:\\Users\\Glass\\Documents\\ourStory\\src\\images\\ourstoryimage3.png");
        Image originalImage1 = originalImageIcon1.getImage();
        Image originalImage2 = originalImageIcon2.getImage();
        Image originalImage3 = originalImageIcon3.getImage();

        //scale image to match the window size
        Image scaledImage =  originalImage1.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
        Image scaledImage2 = originalImage2.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
        Image scaledImage3 =  originalImage3.getScaledInstance(200, 300, Image.SCALE_SMOOTH);
        

        //create new scaled image that fits
        ImageIcon scaledImageIcon1 = new ImageIcon(scaledImage);
        ImageIcon scaledImageIcon2 = new ImageIcon(scaledImage2);
        ImageIcon scaledImageIcon3 = new ImageIcon(scaledImage3);


        //load image
        JLabel imageLabel1 = new JLabel(scaledImageIcon1);
        // add(imageLabel1, BorderLayout.WEST); //put it on the left
        JLabel imageLabel2 = new JLabel(scaledImageIcon2);
        // add(imageLabel2, BorderLayout.EAST); //put it on the right
        JLabel imageLabel3 = new JLabel(scaledImageIcon3);
        // add(imageLabel3, BorderLayout.SOUTH); //put it on the butto,

        // Add padding around images
        JPanel leftPanel = new JPanel();
        leftPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        leftPanel.add(imageLabel1);
        leftPanel.setOpaque(false);

        JPanel rightPanel = new JPanel();  
        rightPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        rightPanel.add(imageLabel2);
        rightPanel.setOpaque(false);  

        JPanel bottomPanel = new JPanel();  
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        bottomPanel.add(imageLabel3);
        bottomPanel.setOpaque(false);

        //add image to frame and location
        

        add(leftPanel, BorderLayout.WEST); //put it on the left
        add(rightPanel, BorderLayout.EAST); //put it on the right
        add(bottomPanel, BorderLayout.SOUTH); //put it on the bottom
    
        //Username and password
        
        JLabel userNameLabel = new JLabel ("Username: "); 
        userNameLabel.setBounds(150, 100, 80, 25); 
        JTextField userNameText = new JTextField(20);
        userNameText.setBounds(240,100,150, 25);
        JLabel passWordLabel = new JLabel("password: ");
        passWordLabel.setBounds(150,140, 80, 25);
        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(240, 140, 150, 25);
        JLabel sucessLabel = new JLabel("");
        sucessLabel.setBounds(100, 100, 350, 50);



    

        


        //  create buttons

        JButton login = new JButton("login");
        JButton signUp =  new JButton("sign up");
        

        //Button components

        JPanel loginPanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        loginPanel.setOpaque(false);
        buttonPanel.setOpaque(false);
        

        buttonPanel.add(login);
        buttonPanel.add(signUp);
        //input Components
        JPanel inputPanel = new JPanel();
         inputPanel.setOpaque(false);

        inputPanel.setLayout(null); 
        inputPanel.add(userNameLabel);
        inputPanel.add(userNameText);
        inputPanel.add(passWordLabel);
        inputPanel.add(passwordText);
        inputPanel.add(sucessLabel);
        sucessLabel.setFont(new Font("Arial", Font.BOLD, 24));

        //make it them functional

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
               // System.out.println("Button Clicked");
                String userName = userNameText.getText();
                String passWord = new String(passwordText.getPassword());
                System.out.println(userName + "," + passWord);

                if(userName.equals("HannaBanana") && passWord.equals("TwoYearsStrong"))
                {
                    sucessLabel.setText("Welcome to Our Story");
                     HomePage homePage = new HomePage();
                     homePage.setVisible(true);
                    // homePage.toFront();
                    OurStory.this.setVisible(false);
                     
                    
                } else{
                    userNameText.setText("");
                    passwordText.setText("");

                }
               
            }
            
            
        });
    
        
        

        

        //set it all visible
        add(loginPanel, BorderLayout.CENTER);
        loginPanel.add(buttonPanel, BorderLayout.NORTH);   // Buttons at top
        loginPanel.add(inputPanel, BorderLayout.CENTER);



        setVisible(true);

    }
    public static void main(String[] args){
       
        new OurStory();

       

        
    }
}
