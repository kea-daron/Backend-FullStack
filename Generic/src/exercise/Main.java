package exercise;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
class Bucket<T>{
    private final T data;
}
class Water{}
class Soil{}
public class Main {
    public static void main(String[] args) {
        Bucket<Water> waterBucket = new Bucket<>(new Water());
        Bucket<Soil> SoilBucket = new Bucket<>(new Soil());
    }
}
