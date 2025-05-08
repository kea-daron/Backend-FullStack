package genericTypeWithInterface;

import lombok.AllArgsConstructor;
import lombok.Data;

// decouple and tight couple

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

interface Repository<T, U>{
    List<T> getAllUsers();
    T findByUuid(U id);
    Integer delete(U id);
    T save(T user);
}
@AllArgsConstructor
@Data
class User{
    private Integer id;
    private String uuid;
    private String name;
}
class UserRepository implements Repository<User, Integer>{
    private List<User> users = new ArrayList<>(List.of(new User(1, UUID.randomUUID().toString(),"koko"),
            new User(2, UUID.randomUUID().toString(), "kaka")));
    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User findByUuid(Integer id) {
        for(User user: users){
            if(user.getId()==id){
                return user;
            }
        }
        return null;

    }

    @Override
    public Integer delete(Integer id) {
        int u= -1;
        for(User user: users){
            if(user.getId()==id){
                u = users.indexOf(user);
                break;
            }
        }
        if(u!=-1){
            users.remove(u);
            return 1;
        }
        return 0;
    }

    @Override
    public User save(User user) {
        users.add(user);
        return user;
    }
}

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        userRepository.getAllUsers().forEach(System.out::println);
        userRepository.delete(1);
        System.out.println("=".repeat(100));
        userRepository.getAllUsers().forEach(System.out::println);
    }
}

