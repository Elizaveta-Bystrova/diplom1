package com.ivpek.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ivpek.entity.BinaryContent;

public interface BinaryContentDAO extends JpaRepository<BinaryContent, Long> {
}