package multiGeneric;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class Util<T, U, V>{
    private final T content;
    private final U data;
    private final V value;
}
enum UserRole{
    ROLE_ADMIN,
    ROLE_SUPER_ADMIN,
    ROLE_USER
}
public class Main {
    public static void main(String[] args) {
        Util<UserRole, Integer, String> util1 = new Util<>(UserRole.ROLE_SUPER_ADMIN,
                1, "Hello");
        System.out.println(util1.getContent());
        System.out.println(util1.getData());
        System.out.println(util1.getValue());
    }
}

