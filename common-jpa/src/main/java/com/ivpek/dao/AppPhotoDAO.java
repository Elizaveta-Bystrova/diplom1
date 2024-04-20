package com.ivpek.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ivpek.entity.AppPhoto;

public interface AppPhotoDAO extends JpaRepository<AppPhoto, Long> {
}