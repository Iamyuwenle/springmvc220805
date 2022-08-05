package com.le.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    private Integer id;
    private String name;
    private Integer age;
    private String sex;

    private Dog dg;
}
