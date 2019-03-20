package com.bfd.webappxcdc.vo;

import io.swagger.annotations.ApiModelProperty;

public class ArchivesPeopleVO {
    @ApiModelProperty(value = "名称", required = true)
    private String name;

    @ApiModelProperty(value = "身份证", required = true)
    private String sfzh;

    @ApiModelProperty(value = "住址", required = true)
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}