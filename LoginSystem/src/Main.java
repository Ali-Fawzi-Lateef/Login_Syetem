public class Main {
    public static void main(String[] args) {
        IDandPasswords idandpaswords = new IDandPasswords();
             
        LoginPage loginPage = new LoginPage(idandpaswords.getLoginInfo());
    }
}
