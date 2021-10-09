package com.hpalt.test.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lotus
 * @since 2021-10-09
 */
public class TbTest implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TbTest{" +
            "id=" + id +
            ", name=" + name +
        "}";
    }
}
