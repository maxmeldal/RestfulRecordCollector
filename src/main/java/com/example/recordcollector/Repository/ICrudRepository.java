package com.example.recordcollector.Repository;

import java.util.List;

public interface ICrudRepository<T> {
    T create (T t);
    T read (int id);
    List<T> readAll ();
    void update (T t);
    void delete (int id);
}
