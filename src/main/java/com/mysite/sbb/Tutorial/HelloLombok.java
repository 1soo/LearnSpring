package com.mysite.sbb.Tutorial;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
//@Setter
public class HelloLombok {

    private final String hello;
    private final Integer lombok;

    public static void main(String[] args){
        HelloLombok helloLombok = new HelloLombok("hello", 5);

        /*helloLombok.setHello("헬로");
        helloLombok.setLombok(5);*/

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}
