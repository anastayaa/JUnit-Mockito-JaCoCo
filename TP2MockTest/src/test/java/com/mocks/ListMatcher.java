package com.mocks;

import org.mockito.ArgumentMatcher;

import java.util.ArrayList;

public class ListMatcher implements ArgumentMatcher<ArrayList<String>> {

    @Override
    public boolean matches(ArrayList<String> strings) {
        if(strings.contains("42") || strings.size()==1){
            return true;
        }
        return false;
    }
}
