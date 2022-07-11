package com.example.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class GreetingHandler implements RequestHandler<String,String> {

    @Override
    public String handleRequest(String s, Context context) {
        context.getLogger().log("Input: " + s);
        return s +": Greeting from lambda function";
    }
}
