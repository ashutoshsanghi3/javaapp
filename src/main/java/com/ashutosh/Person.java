package com.ashutosh;

import lombok.*;


@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@Builder
@Getter
@EqualsAndHashCode(of = {"name","age"})
//@ToString
public class Person {
    private String name;
    private int age;
}