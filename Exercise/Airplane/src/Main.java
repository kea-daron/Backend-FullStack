import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;
@Data
@Builder
class Airplane {
    private Integer id;
    private String uuid;
    private String name;
    private Integer wheel;
    private Integer wing;
    private LocalDate createDate;
    private String brand;
    private Integer numberOfPeople;

}
public class Main {
    public static void main(String[] args) {
//        Airplane airplane = new Airplane.AirplaneBuilder()
//                .id(1)
//                .uuid(UUID.randomUUID().toString())
//                .name("Flying")
//                .wheel(4)
//                .wing(2)
//                .createDate(LocalDate.now())
//                .brand("Ron")
//                .numberOfPeople(1000)
//                .build();
//        System.out.println(airplane.getId());


        Airplane.builder()
                .id(1)
                .uuid(UUID.randomUUID().toString())
                .name("Airplane")
                .wheel(2)
                .wing(3)
                .createDate(LocalDate.now())
                .brand("Airplane")
                .numberOfPeople(5);
        System.out.println(Airplane.builder());


    }
}