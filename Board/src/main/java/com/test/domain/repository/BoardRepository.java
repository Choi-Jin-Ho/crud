package com.test.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.domain.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
