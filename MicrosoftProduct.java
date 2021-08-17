
/**
 *MicrosoftProduct is a superclass in the project.
 *
 * @author (Kiran Khadka)
 * @version (0.1)
 */
public class MicrosoftProduct
{
    // declaring variable productNo which is for the Product Number indices
    private int productNo; 

    //declaring variable productName which is for the name of the product that is to be sold 
    private String productName; 

    //declaring variable activationKey which is for the Activation Key authorised to sell the products
    private String activationKey;

    //declaring variable price which is for the Price of the respective products
    private float price;  

    //defining Constructor by passing the paramaeters productNo and productName
    public MicrosoftProduct (int productNo, String productName) 
    {
        this.productNo=productNo;  //assiging productNo using this keyword for constructor chaining
        this.productName=productName; //assiging productName using this keyword for constructor chaining
        this.activationKey=""; //assigning activationKey to be empty
        this.price=0; //assigning price to be zero
    }
    //accessor method for the productNo
    public int getProduct_No(){ 
        return productNo;
    }

    //accessor method for the productName
    public String getProduct_Name(){
        return productName;
    }

    //accessor method for the activationKey
    public String getActivation_Key(){
        return activationKey;
    }

    //setter method for activationKey
    public void setActivation_Key(String activationKey){
        this.activationKey=activationKey;
    }

    //getter method for the price
    public float getPrice(){
        return price;
    }
    // setter method for the price
    public void setPrice(float price){
        this.price=price;
    }

    
    //method to display the details of the product 
    public void product_Details(){
        //printing the product number
        System.out.println("Product Number is :"+productNo);

        //printing the product name
        System.out.println("Product Name is :"+productName);

        //if activationKey is not equals to empty then print the activationKey
        if (!activationKey.equals("")){
            System.out.println("Activation Key:"+activationKey);
        }

        //if the price of the product is not equals to zero then print the price of the product too
        if (price !=0){
            System.out.println("Price in dollar is:"+price);
        }
    }
}
//end
