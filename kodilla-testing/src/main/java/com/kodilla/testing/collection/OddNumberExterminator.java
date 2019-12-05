package com.kodilla.testing.collection;

import java.util.List;

public class OddNumberExterminator {
    List<Integer> numbers;

    public List<Integer> exterminate(List<Integer> numbers) {
        if(numbers.isEmpty()){
            return numbers;
        }
        for(int i = 0; i < numbers.size(); i ++){
            if(numbers.get(i) % 2 != 0){
                numbers.remove(i);
            }
        }
        return numbers;
    }
}
