package com.cwhcode.classmateex10;

import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<Item, Long> {
}
