class Applicant extends Person{
    private String experience;
    public Applicant(){
        System.out.println("Applicant");
    }
    public String getExperience(){
        return experience;
    }
    public void setExperience(String experience){
        this.experience = experience;
    }
}