package com.github.fish56.mvc.controller;

import com.github.fish56.mvc.MvcApplicationTest;
import org.junit.Test;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

public class RootControllerTest extends MvcApplicationTest {

    @Test
    public void hello() throws Exception{

        ResultMatcher isOk = MockMvcResultMatchers
                .status().is(200);

        MockHttpServletRequestBuilder builder =
                MockMvcRequestBuilders.get("/");

        mockMvc.perform(builder)
                .andExpect(isOk)
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void exception() {
    }
}