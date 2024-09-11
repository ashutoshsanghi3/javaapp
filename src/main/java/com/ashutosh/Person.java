package com.ashutosh;

import lombok.*;


//@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
//@Getter
//@EqualsAndHashCode(of = {"name","age"})
@Data //The above methods can also be done by the data class
@Builder
//@ToString
public class Person {
    private String name;
    private int age;
}