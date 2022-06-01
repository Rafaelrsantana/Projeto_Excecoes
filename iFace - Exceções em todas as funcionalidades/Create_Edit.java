public class Create_Edit extends Account {

    private int age;
    private String gender;
    private String address;
    private String phone_number;
    private String[] new_attribute  = new String [3];
    private String[] attribute_name = new String [3];


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

    public void Create(String new_attribute, String attribute_name, int i) {
        this.attribute_name[i] = attribute_name;
        this.new_attribute[i] = new_attribute;
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

    public void getAttribute(){
        for (int i = 0; i < new_attribute.length; i++) {
            if(new_attribute[i] != null) {
                System.out.println(attribute_name[i] + ": " + new_attribute[i]);
            }
        }
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