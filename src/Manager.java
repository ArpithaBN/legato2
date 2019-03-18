import java.util.List;
 
public class Manager extends Employees
{
    private String projects="IIHT";
    
    	
    
    private String getProjects() {
		return projects;
	}



	private void setProjects(String projects) {
		this.projects = projects;
	}
	

	public String toString() {
        return "Manager [projects=" + projects + ", details=" + super.toString() + "]";
    }
}