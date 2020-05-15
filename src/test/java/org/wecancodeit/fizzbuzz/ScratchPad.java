package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScratchPad {

    @Test
    public void oneIsEqualToOne(){
        //arrange

        //action

        //assertion
        assertEquals(1,1);
    }

    @Test
    public void additionAdds1and1TogetherToMake2(){
        //action
        int result = addition(1,2);

        //assertion
        assertEquals(2,result);
    }

    private int addition(int baseNumber, int numberToAdd) {
        return baseNumber + numberToAdd;
    }
}
