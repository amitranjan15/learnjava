
public class User {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + "]";
    }
    @Override
    protected User clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
    	var user=new User();
    	user.setId(this.getId());
    	user.setName(this.getName());
        return user;
    }
}