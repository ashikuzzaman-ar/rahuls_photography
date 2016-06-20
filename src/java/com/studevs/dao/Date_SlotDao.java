/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studevs.dao;

import java.util.List;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

/**
 *
 * @author Sajid
 */
public class Date_SlotDao extends Parent_Dao {

    public List<String> getDateByPackageId(int packageId) {
        String sql = "select date from date_slot where availability=true "
                + "AND package_id=:packageId";
        MapSqlParameterSource param = new MapSqlParameterSource("packageId", packageId);

        return template.queryForList(sql, param, String.class);
    }

}
