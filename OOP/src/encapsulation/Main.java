package encapsulation;

class User{
    private Integer id;
    private String name;
    private String email;
//    //setter
//    public void setId(Integer id){
//        this.id = id;
//    }
//    //getter
//    public Integer getId(){
//        return id;
//    }
//    //setter
//    public void setName(String name){
//        this.name = name;
//    }
//    //getter
//    public String getName(){
//        return name;
//    }
//    //setter
//    public void setEmail(String email){
//        this.email = email;
//    }
//    //getter
//    public String getEmail(){
//        return email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        User u = new User();
        u.setId(1);
        u.setName("John");
        u.setEmail("john@gmail.com");
        System.out.println(u.getId());
        System.out.println(u.getName());
        System.out.println(u.getEmail());
        System.out.println(u);
    }
}
