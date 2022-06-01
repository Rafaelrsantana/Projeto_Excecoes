public class Manager 
{
    private String[] accounts = new String [3];
    private String[] passwords = new String [3];

    public void setAccounts(String accounts, int i) {
        this.accounts[i] = accounts;
    }

    public void setPasswords(String passwords, int i) {
        this.passwords[i] = passwords;
    }

    public String getAccounts(int i)
    {
        return accounts[i];
        
    }

    public String getPasswords(int i)
    {
        return passwords[i];
    }

}
