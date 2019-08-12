package com.leiax00.spring.springfamily.secondspring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@Slf4j
public class ShowData {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/show")
    public Map showData() throws SQLException {
        showConnection();
        return showData1();
    }

    private void showConnection() throws SQLException {
        log.info(dataSource.toString());
        Connection conn = dataSource.getConnection();
        log.info("conn string: " + conn.toString());
        conn.close();
    }

    private Map showData1() {
        Map map = new HashMap<String, Object>();
        AtomicInteger key = new AtomicInteger(0);
        jdbcTemplate.queryForList("SELECT * FROM FOO")
                .forEach(row -> {
                    log.info(row.toString());
                    map.put(key.getAndIncrement(), row);
                });
        return map;
    }
}