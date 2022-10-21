package pages;

public class DemoPage extends BasePage{

    private String userTextField = "//input[@id='login_field']";
    private String passwordTextField = "//input[@id='password']";
    private String sigInButton =  "//body/div[3]/main[1]/div[1]/div[4]/form[1]/div[1]/input[11]";
    private String menuButton = "//header/div[7]/details[1]/summary[1]/img[1]";
    private String signOutButton = "//button[contains(text(),'Sign out')]";


    public DemoPage() {
        super(driver);
    }

    public void navigateToDemo() {

        navigateTo("https://www.demoblaze.com/index.html");
    }

    public void enterUser(String user) {

        write(userTextField, user);
    }

    public void enterPassword(String pass){

        write(passwordTextField,pass);
    }

    public void clickSigInButton(){

        clickElement(sigInButton);
    }

    public void closeSession(){
        clickElement(menuButton);
        clickElement(signOutButton);
    }
}
