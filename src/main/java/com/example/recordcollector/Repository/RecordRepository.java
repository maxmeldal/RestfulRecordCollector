package com.example.recordcollector.Repository;

import java.util.List;
import com.example.recordcollector.Model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class RecordRepository implements ICrudRepository<Record>{

    @Autowired
    JdbcTemplate template;

    @Override
    public Record create(Record record) {
        String sql = "INSERT INTO records (title, artist, year) VALUES (?, ?, ?)";
        template.update(sql, record.getTitle(), record.getArtist(), record.getYear());
        return record;
    }

    @Override
    public Record read(int id) {
        String sql = "SELECT * FROM records WHERE id=?";
        RowMapper<Record> rowMapper = new BeanPropertyRowMapper<>(Record.class);
        return  template.queryForObject(sql, rowMapper, id);
    }

    @Override
    public List<Record> readAll() {
        String sql = "SELECT * FROM records";
        RowMapper<Record> rowMapper = new BeanPropertyRowMapper<>(Record.class);
        return template.query(sql, rowMapper);
    }

    @Override
    public void update(Record record) {
        String sql = "UPDATE records SET title=?, artist=?, year=? WHERE id=?";
        template.update(sql, record.getTitle(), record.getArtist(), record.getYear(), record.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM records WHERE id=?";
        template.update(sql, id);
    }
}
