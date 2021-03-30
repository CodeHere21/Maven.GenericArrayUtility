package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T>{
    T[] inputArray;
    public ArrayUtility() {}

    public ArrayUtility(T[] inputArray){
        this.inputArray=inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        int count=0;

        for (int i=0; i< inputArray.length; i++){
            if (inputArray[i].equals(valueToEvaluate)){
                count++;
            }
        }
        for (int i=0; i< arrayToMerge.length;i++){
            if (arrayToMerge[i].equals(valueToEvaluate)){
                count++;
            }
        }
        return count;
    }


    public T getMostCommonFromMerge(T[] arrayToMerge) {
        T mostCommon = null;

        for(int i=0; i< inputArray.length; i++){
            for(int j=0; j< arrayToMerge.length;j++){
                if(inputArray[i] == arrayToMerge[j]) {
                        mostCommon = inputArray[i];
                }
            }
        }
        return mostCommon;
    }


    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer count = 0;
        for(int i=0; i< inputArray.length;i++){
        if(inputArray[i].equals(valueToEvaluate)){
            count++;
        }
        }
        return count;
    }

    public T[] removeValue(T valueToRemove) {
        T[] result;
        Integer count = 0;
        Integer removeCount = getNumberOfOccurrences(valueToRemove);
        Integer newSize=inputArray.length-removeCount;

        result= Arrays.copyOf(inputArray, newSize);
        for(int i=0; i<inputArray.length;i++){
            if(inputArray[i] != valueToRemove){
                result[count]=inputArray[i];
                count++;
            }
        }

        return result;
    }


}
