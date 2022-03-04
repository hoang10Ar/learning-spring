package com.mycompany.hoang.buoi1.example2;

import com.mycompany.hoang.buoi1.Oracle;
import org.springframework.stereotype.Component;

@Component("oracle")
public class BookwormOracle implements Oracle {
    @Override
    public String defineMeaningOfLife() {
        return "Buoi 1 - Example 2";
    }
}
