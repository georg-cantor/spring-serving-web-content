package com.example.servingwebcontent;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * We break it down step by step
 * 1. The `@GetMapping` annotation ensures that HTTP GET requests to `/greeting`
 *      are mapped to the `greeting()` method.
 * 2. `@RequestParam` binds the value of the query string parameter `name` into
 *      `name` parameter of the `greeting()` method. This query string parameter
 *      is not `required`. If it is absent in the request, the `defaultValue` of
 *      `Spring` is used. The value of the `name` parameter is added to a `Model`
 *      object, ultimately making it accessible to the view template.
 * 3. 实例：当访问http://localhost:8078/greeting?name=Nick，query string parameter是Nick，
 *      那么就显示"Hello, Nick"；当访问http://localhost:8078/greeting，query parameter缺省，
 *      则使用default为"Spring“， 显示"Hello, Spring".
 */
@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "addr_query_name", required = false, defaultValue = "Spring")
                            String name, Model model) {
        model.addAttribute("h5_name", name);
        return "greeting";
    }
}
