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