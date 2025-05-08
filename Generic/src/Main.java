import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor

class Util<T>{
    private final T content;
}

enum UserRole{
    ROLE_ADMIN,
    ROLE_SUPER_ADMIN,
    ROLE_USER,
    UserRole(){}
}
public class Main {
    public static void main(String[] args) {
        Util<String> util = new Util<>("Hello");
        Util<UserRole> util2 = new Util<>(UserRole.ROLE_ADMIN);
        Util<Integer> util3 = new Util<>(11);
        System.out.println(util.getContent());
        System.out.println(util2.getContent());
        System.out.println(util3.getContent());
    }
}