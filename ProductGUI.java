
/**
 * ProductGUI class implements code to develop a graphical user interface for license authorization by Microsoft company.
 *
 * @author (Kiran Khadka)
 * @version (0.1)
 */
import javax.swing.*; //importing the package that provides the components for java swing API 
import java.awt.*;   
import java.awt.event.*;
import java.util.*; //importing util package especially for arraylist

public class ProductGUI implements ActionListener, KeyListener
{ 
    //Variable declaration of the java swing components
    private JFrame frm;

    private JPanel panAddProduct, panLicActivate, panLicTerminate,panSetPrice, panelLast;

    private JLabel  lbl_productNo1, lbl_productNo2, lbl_productNo3,lbl_productNo4, lbl_productName,lbl_priceperUser1,lbl_priceperUser2,
    lbl_clientCompanyName, lbl_numOfUser,lbl_totalPrice,lbl_activationKey, lbl_activationDate, lbl_expiryDate,lbl_select;

    private JTextField txt_productNo1,txt_productNo2, txt_productNo3,txt_productNo4,txt_productName,txt_clientCompanyName,
    txt_numOfUser,txt_priceperUser1,txt_priceperUser2,txt_totalPrice, txt_activationKey,txt_activationDate,txt_expiryDate;

    private JButton btn_addProduct, btn_Activate, btn_Terminate,btn_SetPriceperuser, btn_Display, btn_Clear;
    private JMenuBar frmenubar;
    private JMenu filemenu, aboutmenu, helpmenu;
    private JMenuItem menu_itemNew, menu_itemSave, menu_itemExit;

    //creating arraylist of type MicrosoftProduct class and naming it prd_Arraylist
    ArrayList<MicrosoftProduct> prd_Arraylist = new ArrayList<>();

    public ProductGUI()
    {
        frm= new JFrame("ProductGUI"); //creating the frame  
        frm.setSize(900,700); //setting size
        frm.getContentPane().setBackground(Color.orange); //setting the color of the content pane
        frm.setLocationRelativeTo(null); //display the Frame at center position of a screen
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close and stops running the frame in background

        Container container=frm.getContentPane();

        
        panAddProduct = new JPanel(); //JPanel for Add Product section
        panAddProduct.setBounds(30,30,400,220);
        container.add(panAddProduct);
        panAddProduct.setBackground(Color.green);
        panAddProduct.setLayout(null);

        lbl_productNo1 = new JLabel("Product No:"); //1st JLabel for the Product Number
        lbl_productNo1.setBounds(10,10,120,30); //setting the X-axis,Y-axis, width and height
        lbl_productNo1.setFont(new Font("Helvetica",Font.BOLD,17));
        panAddProduct.add(lbl_productNo1); 

        
        txt_productNo1=new JTextField(); 
        txt_productNo1.setBounds(150,10,190,30);
        panAddProduct.add(txt_productNo1);

        lbl_productName = new JLabel("Product Name:"); // JLabel for Product Name
        lbl_productName.setFont(new Font("Helvetica",Font.BOLD,17));
        lbl_productName.setBounds(10,50,120,30);
        panAddProduct.add(lbl_productName);

        txt_productName = new JTextField(); 
        txt_productName.setBounds(150,50,190,30);
        panAddProduct.add(txt_productName);
        

        lbl_priceperUser1 = new JLabel("Price per User:"); // First JLabel for Price per User
        lbl_priceperUser1.setFont(new Font("Helvetica",Font.BOLD,17));
        lbl_priceperUser1.setBounds(10,90,120,30);
        panAddProduct.add(lbl_priceperUser1);

        
        txt_priceperUser1= new JTextField(); 
        txt_priceperUser1.setBounds(150,90,190,30);
        panAddProduct.add(txt_priceperUser1);

        
        /*'Add Product'button adds the Product No, Product Name and Price per User where
        newly created object is later added to the arraylist of type EnterpriseEdition class*/
        btn_addProduct = new JButton("Add Product"); 
        btn_addProduct.setFont(new Font("AvantGarde",Font.BOLD,17));
        btn_addProduct.setBounds(200,140,140,30);
        panAddProduct.add(btn_addProduct);

        panLicActivate = new JPanel(); //JPanel for license activation section
        panLicActivate.setBounds(30,275,440,350);
        container.add(panLicActivate);
        panLicActivate.setBackground(Color.green);
        panLicActivate.setLayout(null);
        
        

        lbl_productNo2 = new JLabel("Product No:"); //2nd JLabel for Product No.
        lbl_productNo2.setFont(new Font("Helvetica",Font.BOLD,17));
        lbl_productNo2.setBounds(10,10,190,30);
        panLicActivate.add(lbl_productNo2);

        
        
        txt_productNo2 = new JTextField(); 
        txt_productNo2.setBounds(220,10,190,30);
        panLicActivate.add(txt_productNo2);
        
        

        lbl_clientCompanyName=new JLabel("Client Company Name:"); //JLabel for Client Company Name
        lbl_clientCompanyName.setBounds(10,50,200,30);
        lbl_clientCompanyName.setFont(new Font("Helvetica",Font.BOLD,17));
        panLicActivate.add(lbl_clientCompanyName);

        txt_clientCompanyName = new JTextField(); 
        txt_clientCompanyName.setBounds(220,50,190,30);
        panLicActivate.add(txt_clientCompanyName);

        lbl_numOfUser = new JLabel("No. of User:"); //JLabel for No. of User
        lbl_numOfUser.setBounds(10,90,200,30);
        lbl_numOfUser.setFont(new Font("Helvetica",Font.BOLD,17));
        panLicActivate.add(lbl_numOfUser);
        
        

        txt_numOfUser = new JTextField(); 
        txt_numOfUser.setBounds(220,90,190,30);
        panLicActivate.add(txt_numOfUser);
        
        

        lbl_totalPrice = new JLabel("Total Price:"); //JLabel for the Total Price
        lbl_totalPrice.setBounds(10,130,200,30);
        lbl_totalPrice.setFont(new Font("Helvetica",Font.BOLD,17));
        panLicActivate.add(lbl_totalPrice);
        
        

        txt_totalPrice = new JTextField(); 
        txt_totalPrice.setBounds(220,130,190,30);
        panLicActivate.add(txt_totalPrice);
        txt_totalPrice.setEditable(false); //total price cannot be edited
        
        

        lbl_activationDate = new JLabel("License Activation Date:"); //JLabel for License Activation Date
        lbl_activationDate.setBounds(10,170,200,30);
        lbl_activationDate.setFont(new Font("Helvetica",Font.BOLD,17));
        panLicActivate.add(lbl_activationDate);
        
        

        txt_activationDate = new JTextField();
        txt_activationDate.setBounds(220,170,190,30);
        panLicActivate.add(txt_activationDate);
        
        

        lbl_expiryDate = new JLabel("License Expire Date:"); //JLabel for License Expire Date
        lbl_expiryDate.setBounds(10,210,200,30);
        lbl_expiryDate.setFont(new Font("Helvetica",Font.BOLD,17));
        panLicActivate.add(lbl_expiryDate);
        
        

        txt_expiryDate = new JTextField();
        txt_expiryDate.setBounds(220,210,190,30);
        panLicActivate.add(txt_expiryDate);
        
        

        lbl_activationKey = new JLabel("Activation Key:"); //JLabel for Activation Key
        lbl_activationKey.setBounds(10,250,200,30);
        lbl_activationKey.setFont(new Font("Helvetica",Font.BOLD,17));
        panLicActivate.add(lbl_activationKey);
        
        

        txt_activationKey = new JTextField(); //JTextField for the Activation Key
        txt_activationKey.setBounds(220,250,190,30);
        panLicActivate.add(txt_activationKey);
        
        

        btn_Activate = new JButton("Activate License"); //JButton for license activation 
        btn_Activate.setBounds(258,300,160,30);
        btn_Activate.setFont(new Font("AvantGarde",Font.BOLD,16));
        panLicActivate.add(btn_Activate);
        
        

        panLicTerminate = new JPanel();   //JPanel for license termination section
        panLicTerminate.setBounds(495,30,345,130);
        container.add(panLicTerminate);
        panLicTerminate.setBackground(Color.green);
        panLicTerminate.setLayout(null);
        
        

        lbl_productNo3 = new JLabel("Product No:"); //3rd JLabel for the Product No.
        lbl_productNo3.setBounds(10,10,120,30 ); 
        lbl_productNo3.setFont(new Font("Helvetica",Font.BOLD, 17));
        panLicTerminate.add(lbl_productNo3);
        
        

        txt_productNo3=new JTextField(); 
        txt_productNo3.setBounds(140,10,180,30);
        panLicTerminate.add(txt_productNo3);
        
        

        btn_Terminate = new JButton("Terminate License"); //JButton for terminate license
        btn_Terminate.setBounds(135,60,185,30);
        btn_Terminate.setFont(new Font("AvantGarde",Font.BOLD,16));
        panLicTerminate.add(btn_Terminate);

        
        
        panSetPrice = new JPanel(); //JPanel for the set price per user 
        panSetPrice.setBounds(495,200,345,170);
        container.add(panSetPrice);
        panSetPrice.setBackground(Color.green);
        panSetPrice.setLayout(null);
        
        

        lbl_productNo4 = new JLabel("Product No:"); //4th JLabel for Product No.
        lbl_productNo4.setBounds(10,10,120,30); 
        lbl_productNo4.setFont(new Font("Helvetica",Font.BOLD, 17));
        panSetPrice.add(lbl_productNo4); 

        
        
        txt_productNo4=new JTextField(); 
        txt_productNo4.setBounds(140,10,180,30);
        panSetPrice.add(txt_productNo4);

        
        
        lbl_priceperUser2 = new JLabel("Price per User:"); //2nd JLabel for Price per User
        lbl_priceperUser2.setBounds(10,50,120,30);
        lbl_priceperUser2.setFont(new Font("Helvetica",Font.BOLD,17));
        panSetPrice.add(lbl_priceperUser2);

        
        
        txt_priceperUser2 = new JTextField(); 
        txt_priceperUser2.setBounds(140,50,180,30);
        panSetPrice.add(txt_priceperUser2);

        
        
        btn_SetPriceperuser = new JButton("Set Price");
        btn_SetPriceperuser.setBounds(210,100,115,30);
        btn_SetPriceperuser.setFont(new Font("AvantGarde",Font.BOLD,17));
        panSetPrice.add(btn_SetPriceperuser);
        
        

        panelLast = new JPanel(); //JPanel for Display and Clear button
        panelLast.setBounds(670, 430, 175, 90);
        container.add(panelLast);
        panelLast.setBackground(Color.green);
        panelLast.setLayout(null);

        
        
        btn_Display = new JButton("Display");
        btn_Display.setBounds(10,10,140,30);
        btn_Display.setFont(new Font("AvantGarde",Font.BOLD,17));
        panelLast.add(btn_Display);

        
        
        btn_Clear = new JButton("Clear");
        btn_Clear.setBounds(10,50,140,30); 
        btn_Clear.setFont(new Font("AvantGarde",Font.BOLD,17));
        panelLast.add(btn_Clear);

        
        
        //MenuBar displayed under the title
        frmenubar=new JMenuBar(); 
        frm.setJMenuBar(frmenubar);

        
        
        //Menu displayed in the MenuBar
        filemenu=new JMenu("File");
        aboutmenu=new JMenu("About");
        helpmenu=new JMenu("Help");
        frmenubar.add(filemenu);
        frmenubar.add(aboutmenu);
        frmenubar.add(helpmenu);
        
        

        //MenuItems displayed inside Menu
        menu_itemNew = new JMenuItem("New");
        menu_itemSave = new JMenuItem("Save");
        menu_itemExit = new JMenuItem("Exit");
        filemenu.add(menu_itemNew);
        filemenu.add(menu_itemSave);
        filemenu.add(menu_itemExit);
        
        

        //ActionListener and KeyListener using THIS keyword to handle desired operations
        btn_addProduct.addActionListener(this);
        txt_numOfUser.addKeyListener(this); 
        btn_Activate.addActionListener(this);
        btn_Terminate.addActionListener(this);
        btn_SetPriceperuser.addActionListener(this);
        btn_Display.addActionListener(this);
        btn_Clear.addActionListener(this);
        menu_itemExit.addActionListener(this); 
        menu_itemNew.addActionListener(this);
        menu_itemSave.addActionListener(this);
        
        

        frm.setLayout(null); //layout manager is not assigned 
        frm.setVisible(true); //visibility of the frame  
        JOptionPane.showMessageDialog(frm,"Welcome to the Microsoft services!","Interface says",JOptionPane.INFORMATION_MESSAGE);
    }

    
    
    //ActionListener and KeyListener 
    @Override
    public void keyTyped(KeyEvent ke)
    {
    }

    
   
    @Override
    public void keyPressed(KeyEvent ke)
    {
    }

    
    
    @Override
    /* When key is released in text field of both 'No. of User' and 'Price per User' then the value is set automatically to the 
    text field of 'Total Price'*/
    public void keyReleased(KeyEvent ke)
    {
        try{
            String productnumber=txt_productNo2.getText();
            float prdno = Float.parseFloat(txt_productNo2.getText());
            String numUser = txt_numOfUser.getText();
            float numOfUser = Float.parseFloat(numUser);
            setTotalPrice(prdno, numOfUser);
        }

        catch (Exception ex)
        {
            txt_totalPrice.setText((0+"")); //total price set to zero
            JOptionPane.showMessageDialog(frm,"The value you entered is not valid! \n Please enter again!","Validity Error",JOptionPane.ERROR_MESSAGE);
        }      
    }

    
    
    public void setTotalPrice( float prdno, float numOfUser)  //method for setting total price 
    {
        boolean prodGain=false; //declaring and initializing the variable 
        for(MicrosoftProduct iteminList: prd_Arraylist){  //for loop

            if(iteminList.getProduct_No()==prdno){  //checking the object type
                EnterpriseEdition objlist = (EnterpriseEdition) iteminList; //object casting(type downcasting) MicrosoftProduct class object into EnterpriseEdition class
                float total_Price = numOfUser*objlist.getPricePerUser(); //totalprice is calculated when key is released
                txt_totalPrice.setText(total_Price+""); //String concatenation in the totalprice
                prodGain=true; //the variable 'prodGain' is set to be true now
                break;
            } //end if 
        } 

        if(prodGain==false){
            txt_totalPrice.setText(0+"");
            
        }
    }

    
    
    //ActionListener interface in which series of action event are implemented
    @Override
    public void actionPerformed(ActionEvent ace)
    {
        if (ace.getSource() == btn_addProduct)
        {
            product_Add(); //method calling for the ActionListener interface of the btn_addProduct
        }

        if (ace.getSource() == btn_Activate) //for button Activate License
        {
            activateLicense(); //method calling activateLicense inside which rest of the code is
        } 

        if(ace.getSource()==btn_Terminate){ //for button Terminate License
            terminateLicense(); //terminateLicense method consists code
        }

        if(ace.getSource()==btn_SetPriceperuser){ 
            methodPriceUser(); //'methodPriceUser' method implements code
        }

        if(ace.getSource()==btn_Display){ // for the button 'Display'
            display(); 
        } 

        if(ace.getSource()==btn_Clear) //for button Clear
        {
            methodClear(); //empties the textfield
        }

        if(ace.getSource()==menu_itemNew)
        {
            methodClear(); //empties textfield when New menu item is clicked
        }

        if(ace.getSource()==menu_itemExit){  //for Exit menu item
            exit(); //method Exit handles the operation
        }
    }

    
    
    /*calling a method 'product_Add' which acts in a actionPerformed method for ActionListener interface in the 
    button 'btn_addProduct' */
    public void product_Add()
    {
        /*handling number format exception, check duplicate entries and conversion of the data type */
        try
        {
            String prodNo1 = txt_productNo1.getText();
            String prodName1 = txt_productName.getText();
            String priceperUser1 = txt_priceperUser1.getText();

            if (prodNo1.equals("") || prodName1.equals("") || priceperUser1.equals("")){ //checking for the empty textfield
                JOptionPane.showMessageDialog(frm, "These fields are not supposed to be empty!", "Empty Field Warning",JOptionPane.WARNING_MESSAGE); 
            }

            else{
                int prdNum = Integer.parseInt(prodNo1);  //conversion using wrapper class 
                float prdPrice = Float.parseFloat(priceperUser1); //conversion sing wrapper class 
                boolean duplicateValprod = false; //for checking duplicate entries

                /* new object named 'msObj' for MicrosoftProduct and check with the existing one*/
                for(MicrosoftProduct msObj: prd_Arraylist)
                { 
                    //check values are in msObj
                    if (msObj.getProduct_No()== prdNum || msObj.getProduct_Name()==prodName1 || msObj.getPrice()==prdPrice)
                    {
                        duplicateValprod = true;
                        break;
                    }
                } //end for loop 

                
                if(duplicateValprod ==false){ //check 
                    EnterpriseEdition obj = new EnterpriseEdition(prdNum, prodName1, prdPrice);
                    //adding object 'obj' of EnterpriseEdition in array list
                    
                    prd_Arraylist.add(obj);
                    //message dialog box after adding the product
                    JOptionPane.showMessageDialog(frm,"Product "+prodNo1+  " is added successfully..", "Product Added Information",JOptionPane.INFORMATION_MESSAGE);
                
                }else{
                    JOptionPane.showMessageDialog(frm,"The value you entered is already in the list cart.","Product Added Information",JOptionPane.INFORMATION_MESSAGE);
                } //end else
            } 
        } 

        catch(Exception addex)
        {
            JOptionPane.showMessageDialog(frm,"Sorry, The value you entered is not valid.","Validity Error",JOptionPane.ERROR_MESSAGE); 
        } //end catch block
    }

    
    
    /*method activatLicense has all the registration method code for the btn_Activate*/
    public void activateLicense(){
        try{
            String prodNo2 = txt_productNo2.getText();
            String clientCompanyName = txt_clientCompanyName.getText();
            String noOfUser = txt_numOfUser.getText();
            String licenseactivationDate = txt_activationDate.getText();
            String activationKey = txt_activationKey.getText();
            String licenseexpireDate = txt_expiryDate.getText();

            //check the given text fields are empty or not
            if(prodNo2.equals("") ||clientCompanyName.equals("") || noOfUser.equals("")|| licenseactivationDate.equals("")|| 
            activationKey.equals("")|| licenseexpireDate.equals("")){
                //displaying message that the text field are empty
                JOptionPane.showMessageDialog(frm,"Sorry, You can't leave the text field empty!","Empty Field Warning",JOptionPane.WARNING_MESSAGE);
            }
            else{

                int prdNum2 = Integer.parseInt(prodNo2); //conversion using wrapper class 
                int numberOfUser = Integer.parseInt(noOfUser);
                boolean productDetermine = false; //variable set to false 

                for(MicrosoftProduct detPro:prd_Arraylist) //checking whether is in array list or not 
                {
                    if(detPro.getProduct_No()==prdNum2) //checking with the existing one
                    {
                        //object casting down casting the MicrosoftProduct object into EnterpriseEdition object
                        EnterpriseEdition actContainer = (EnterpriseEdition) detPro;
                        if(actContainer.getIsActivated()==false){

                            //call method'sellLicense' for license activation from EnterpriseEdition class
                            actContainer.sellLicense(clientCompanyName, numberOfUser, licenseactivationDate,licenseexpireDate,activationKey);
                            JOptionPane.showMessageDialog(frm,"Woo-hoo!, the license for Product " +prodNo2+ " is activated succesfully.", "License Status",JOptionPane.INFORMATION_MESSAGE);
                            productDetermine=true; //variable set to true now
                            break;
                        }

                        
                        if(actContainer.getIsActivated()==true){
                            actContainer.sellLicense(clientCompanyName, numberOfUser, licenseactivationDate, licenseexpireDate,activationKey);
                            JOptionPane.showMessageDialog(frm,"The license for Product " +prodNo2+   " is already activated.","License Status",JOptionPane.INFORMATION_MESSAGE);
                            productDetermine=true;
                            break;
                        }
                    }
                }//end for 

                
                //if booolean variable is false then display message for not accessing product
                if(productDetermine==false){
                    JOptionPane.showMessageDialog(frm, "Sorry, the product you are trying is not accessible!",
                        "Product Access Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } //end try block
        
        catch(Exception ex){ //catch validity exception
            JOptionPane.showMessageDialog(frm,"Only valid value, please!","Validity Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    
    
    
    /*method which acts inside the registration method of the btn_Terminate*/
    public void terminateLicense(){
        try{
            String productNum = txt_productNo3.getText(); 
            if(productNum.equals("")){
                JOptionPane.showMessageDialog(frm," Please enter the Product No. \n you want to terminate", "Empty Field Warning",JOptionPane.WARNING_MESSAGE);

            }
            else{
                float prodNo3 = Float.parseFloat(productNum);
                boolean prodAvailable = false;
                for(MicrosoftProduct listTer:prd_Arraylist){
                    if(listTer.getProduct_No()==prodNo3){
                        EnterpriseEdition eet = (EnterpriseEdition) listTer; //downcasting object of parent class to child class

                        if(eet.getIsActivated()==true){ //if license is activated
                            eet.terminateLicense();
                            JOptionPane.showMessageDialog(frm,"The license for Product No. "+productNum+" is terminated","License Status",JOptionPane.INFORMATION_MESSAGE);
                            prodAvailable=true;
                            break;
                        }

                        if(eet.getIsExpired()==true){  //if already terminated 
                            JOptionPane.showMessageDialog(frm,"The license is teminated already","License Status",JOptionPane.INFORMATION_MESSAGE);
                            prodAvailable=true;
                            break;
                        }
                    }
                }

                if(prodAvailable==false){  //if product is not found
                    JOptionPane.showMessageDialog(frm,"The product you're trying is not found!","Product Access Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        } //end try block

        catch(Exception terminatex){
            JOptionPane.showMessageDialog(frm,"Only, valid value is accepted.","Validity Error",JOptionPane.ERROR_MESSAGE);
        } //end catch block
    }

    
    
    /* method 'methodPriceUser' implements the code which is executed in the ActionListener interface of the btn_SetPriceperUser*/
    public void methodPriceUser(){
        try
        {
            String productNo4 = txt_productNo4.getText();
            String pricepuser = txt_priceperUser2.getText();
            
            //if product number and price per user are empty then display the message
            if(productNo4.equals("")||pricepuser.equals(""))
            {
                
                JOptionPane.showMessageDialog(frm, "You haven't entered the value yet","Empty Field Warning", JOptionPane.WARNING_MESSAGE);
            
            
            }else{
                int prodNum4 = Integer.parseInt(productNo4);  //conversion using wrapper classes
                float priceperUser = Float.parseFloat(pricepuser);
                boolean productIn = false; //declaring and initializing productIn variable

                //Checking does the value exists in ArrayList or not
                for(MicrosoftProduct mp: prd_Arraylist)
                { 
                    if(mp.getProduct_No()==prodNum4){

                        //downcasting the object of super class MicrosoftProduct to EnterpriseEdition class
                        EnterpriseEdition eelPrice = (EnterpriseEdition) mp;
                        productIn=true;

                        if(eelPrice.getIsActivated()==true){ //if activated then price can't be set
                            JOptionPane.showMessageDialog(frm,"Sorry, the price for the activated product can't be set now.","License Status",JOptionPane.INFORMATION_MESSAGE);
                            productIn= true;
                            break;

                        }else{
                            eelPrice.setPricePerUser(priceperUser);
                            JOptionPane.showMessageDialog (frm,"The new price has been set.","Price Set Message",JOptionPane.INFORMATION_MESSAGE);

                        }
                    } 
                }
                if(productIn==false){
                    JOptionPane.showMessageDialog(frm,"The product number you entered can't be accessed", "Product Access Error",JOptionPane.ERROR_MESSAGE);
                } 
            }
        }

        catch(Exception prex)
        { 
            JOptionPane.showMessageDialog(frm,"Valid value only, please!","Validity Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    
    /* method to display the contents when the 'Display' button is pressed which is called inside the ActionListener interface of 
    the btn_Display*/
    public void display(){  
        for(MicrosoftProduct dispContainer:prd_Arraylist){
            //downcasting the MicrosoftProduct object to EnterpriseEdition object
            EnterpriseEdition dispList= (EnterpriseEdition) dispContainer;
            
            //displaying all the contents
            dispList.product_Details();
            System.out.println("__________________________"); //Distinguishing details in the terminal
        } //end for loop
    }

    
    
    //'methodClear' executes the code for the actionPerformed of button btn_Clear and sets all the text field to be empty
    public void methodClear(){
        txt_productNo1.setText("");
        txt_productNo2.setText("");
        txt_productNo3.setText("");
        txt_productNo4.setText("");
        txt_productName.setText("");
        txt_clientCompanyName.setText("");
        txt_numOfUser.setText("");
        txt_activationKey.setText("");
        txt_activationDate.setText("");
        txt_expiryDate.setText("");
        txt_totalPrice.setText("");
        txt_priceperUser1.setText("");
        txt_priceperUser2.setText("");
    }

    
    public void exit(){
        System.exit(0); //exit the system on click to the Exit menu item
    }

    
    public static void main(String[]args){
        new ProductGUI();
    }

} //end 

