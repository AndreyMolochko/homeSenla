import java.util.ArrayList;
import java.util.List;
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