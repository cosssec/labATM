package builder;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

@Builder @ToString
public class User {
    private String name;
    private int age;

    @Singular private List<String> occupations;
}