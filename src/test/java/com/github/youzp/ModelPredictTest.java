package com.github.youzp;

import java.util.HashMap;
import java.util.Map;

import static com.github.youzp.ModelPredict.predict;

/**
 * Created by youzp on 2017/7/19.
 */
public class ModelPredictTest {

    public static void main(String[] args) {
        Map<String, Object> inputData = new HashMap<String, Object>();
        inputData.put("aa", 10.0);
        inputData.put("bb", 10.0);
        inputData.put("cc", 10.0);
        inputData.put("dd", 10.0);
        inputData.put("ee", 10.0);

        Map<String, Double> resultMap = predict(inputData);
        double result = resultMap.get("label");

        System.out.println("result:" + result);
    }
}
