abstract class Person{
    protected String name;
    protected String email;
    protected int year;
    protected Boolean sex;
    public Person(){
        System.out.println("Person");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public Boolean getSex(){
        return sex;
    }
    public void setSex(Boolean sex){
        this.sex = sex;
    }
}