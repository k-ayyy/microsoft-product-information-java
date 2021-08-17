
/**
 * EnterpriseEdition is the sub class of the MicrosoftProduct Class.
 *
 * @author (Kiran Khadka)
 * @version (0.1)
 */

public class EnterpriseEdition extends MicrosoftProduct
{
    //declaring variable for the name of the company of the clients 
    private String clientCompanyName;

    //declaring variable for the price per user in respective companies
    private float pricePerUser;

    //declaring variable for the number of user for using the specific product in respective company
    private int numberOfUser;

    //declaring variable for the activation date of the certain products 
    private String activationDate;

    //declaring variable for the expiry date of the license granted for the specific products
    private String licenseExpireDate;

    //declaring variable for the license activation status
    private boolean isActivated;

    //declaring varibale for the license expired status
    private boolean isExpired;

    //defining the constructor by passing the parameters productNo, productName and pricePerUser
    public EnterpriseEdition ( int productNo, String productName, float pricePerUser)
    {
        super(productNo, productName); //calling the superclass constructor by passing two parameters productNo and productName

        this.pricePerUser=pricePerUser; //assiging  pricePerUser 

        this.numberOfUser=0; //assigning numberOfUser to be zero

        this.activationDate=""; //assigning activationDate to be empty

        this.licenseExpireDate=""; //assigning licenseExpireDate to be empty 

        this.isActivated=false; //assigning activated status to be false 

        this.isExpired=false; //assigning expiry status to be false 

        this.clientCompanyName=""; //assigning company name to be empty
    }

    /*getter methods for all the attributes*/
    public String getclientCompanyName(){
        return clientCompanyName;
    }

    public float getPricePerUser(){
        return pricePerUser;
    }

    public int getNumberOfUser(){
        return numberOfUser;
    }

    public String getActivationDate(){
        return activationDate;
    }

    public String getLicenseExpireDate(){
        return licenseExpireDate;
    }

    public boolean getIsActivated(){
        return isActivated;
    }

    public boolean getIsExpired(){
        return isExpired;
    }
    //setter methods for pricePerUser provided condition license is activated or not
    public void setPricePerUser(float pricePerUser){

        /*if license activated status is true then displaying message not possible to change the values 
        indicating that the company name for which license is being granted*/
        if(isActivated == true){
            System.out.println("Sorry, Price per user cannot be changed by this time." +"\n"+ "This license is granted for" +this.clientCompanyName);

        }else{

            //else assign new value to the variable pricePerUser if license is not granted 
            this.pricePerUser=pricePerUser;
            System.out.println("The new value has been set for Price per user");
        }
    }

    /*method sellLicense calling for the license activation by passing the parameters in
    representing the name of the client company, number of user, activation date and 
    expiry date of the license
     */ 
    public void sellLicense( String clientCompanyName, int numberOfUser, String activationDate, String licenseExpireDate,
    String activationKey)
    {

        //check license activated status 
        if(isActivated == true){

            System.out.println("license has been already activated."); //display message

            System.out.println("License granted for:  "+clientCompanyName); //display clientCompanyName

            System.out.println("License can be used by:"+numberOfUser); //display noOfUser

        }else{

            /*assigning variables so that new values can be assigned in the respective attributes in a condition that 
            the license activation status is false */
            this.clientCompanyName=clientCompanyName;

            this.numberOfUser=numberOfUser;

            this.activationDate=activationDate;

            this.licenseExpireDate=licenseExpireDate;

            super.setActivation_Key(activationKey); //method to call the activationKey from the parent class MicrosoftProduct

            float totalPrice = numberOfUser*pricePerUser; //new total price calculation 

            super.setPrice(totalPrice); //method calling to set Price from the super class

            this.isActivated=true;

            this.isExpired=false;

            System.out.println ("License has been activated successfully." +"\n");
        }
    }
    //method to terminate the license 
    public void terminateLicense(){
        //if license Expired status is true then display the message
        if(isExpired == true){

            System.out.println("License has been already expired."+"\n");

        }else{

            /*assigning variables so that the user can terminate the license in a 
            condition that the expired status is false*/
            this.clientCompanyName="";

            this.activationDate="";

            this.licenseExpireDate="";

            this.numberOfUser=0;

            this.isActivated=false;

            this.isExpired=true;

            super.setPrice(0);

            super.setActivation_Key("");

            System.out.println("The License has been expired successfully." + "\n");
        }
    }
    //main method to display the details of the product
    public void product_Details(){

        //method calling from the super class to display the details of the products
        super.product_Details(); 

        //display the price per user
        System.out.println("Price per user in dollar is:"+pricePerUser +"\n");

        //check if license activated status is true or not
        if(isActivated == true){

            /*displaying the details of the products  with the appropriate
            message in a case that the license is activated
             */
            System.out.println("License granted for: " +clientCompanyName);

            System.out.println("Number of User is: " +numberOfUser);

            System.out.println("Activation Date is: " +activationDate);

            System.out.println("License Expiry Date is: " +licenseExpireDate);

            System.out.println("The total price in dollar is: " +numberOfUser*pricePerUser);

            System.out.println("The license is in use at this moment.");

        }
    }
}
//end 

