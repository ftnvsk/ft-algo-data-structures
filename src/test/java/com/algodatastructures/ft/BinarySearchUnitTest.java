package com.algodatastructures.ft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchUnitTest {

    int[] nums = {1, 2, 3, 5, 7, 11, 13, 17};

    @Test
    public void testSearchNumberNotFound() {
        int target = 4;
        Assertions.assertEquals(-1, BinarySearch.search(nums, target),
                "Numarul cautat ar trebui sa nu fie gasit");
    }

    @Test
    public void testSearchNumberAtStart() {
        int target = 1;
        Assertions.assertEquals(0, BinarySearch.search(nums, target),
                "Numarul cautat ar trebui sa fie la inceputul sirului");
    }

    @Test
    public void testSearchNumberInMiddle() {
        int target = 7;
        Assertions.assertEquals(4, BinarySearch.search(nums, target),
                "Numarul cautat ar trebui sa fie in mijlocul sirului");
    }

    @Test
    public void testSearchNumberAtEnd() {
        int target = 17;
        Assertions.assertEquals(7, BinarySearch.search(nums, target),
                "Numarul cautat ar trebui sa fie la sfarsitul sirului");
    }

}
