package com.company;

import com.company.model.Car;
import org.springframework.stereotype.Component;

@Component
public class Executor {
    private final Car car;

    public Executor(Car car) {
        this.car = car;
    }

    public void execute() {
        System.out.println(car);
    }
}
