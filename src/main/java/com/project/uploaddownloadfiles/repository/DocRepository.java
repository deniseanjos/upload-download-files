package com.project.uploaddownloadfiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.uploaddownloadfiles.model.Doc;

public interface DocRepository extends JpaRepository<Doc, Integer>{

}
