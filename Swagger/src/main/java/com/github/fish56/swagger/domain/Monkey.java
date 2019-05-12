package com.github.fish56.swagger.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Monkey {
    @ApiModelProperty(value = "🐒的id")
    private Integer id;

    private String name;

    @ApiModelProperty(value = "🐒的住址")
    private String location;
}
