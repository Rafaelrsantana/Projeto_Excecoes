public class Create_Edit extends Account {

    private int age;
    private String gender;
    private String address;
    private String phone_number;
    private String new_attribute;
    private String attribute_name;

    public void create_account() {
        
    }
    public void setAge(int age) {
        this.age = age;
    } 

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setAttribute(String new_attribute) {
        this.new_attribute = new_attribute;
    }

    public void Create(String new_attribute, String attribute_name) {
        this.attribute_name = attribute_name;
        this.new_attribute = new_attribute;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getAddress()
    {
        return address;
    }

    public String getPhone()
    {
        return phone_number;
    }

    public String getAttribute()
    {
        return new_attribute;
    }

    public String getAttributeName()
    {
        return attribute_name;
    }

    @Override
    public void delete()
    {
        this.address = null;
        this.age = 0;
        this.phone_number = null;
        this.gender = null;
        this.new_attribute = null;
        this.attribute_name = null;

    }
}