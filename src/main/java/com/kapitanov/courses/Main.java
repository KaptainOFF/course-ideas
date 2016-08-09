package com.kapitanov.courses;

import static spark.Spark.get;

/**
 * Created by yani.kapitanov on 09/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
        get("/calculator", (req, res) -> "This is a calculator");
    }

}
