//по диаграмме поля должны быть private, сделал protected
import java.util.ArrayList;
import java.util.List;

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

class Project{
    private String name;
    private String []technologies;

    public Project(){
        System.out.println("Project");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String[] getTechnologies(){
        return technologies;
    }
    public void setTechnologies(String[] technologies){
	this.technologies = technologies;
    }
}
class Resume{
    private Applicant applicant;
    private List<Project> projects;
    public Resume(){
        System.out.println("Resume");
        applicant = new Applicant();
        projects = new ArrayList<>();
        projects.add(new Project());
    }
    public List<Project> getProjects(){
        return projects;
    }
}
class Exercise{
    public static void main(String []args){
        Resume resume=new Resume();
	}
}