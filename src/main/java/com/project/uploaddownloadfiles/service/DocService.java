package com.project.uploaddownloadfiles.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.project.uploaddownloadfiles.model.Doc;

public interface DocService {

	Doc saveFile(MultipartFile file);

	Optional<Doc> getFile(Integer fileId);

	List<Doc> getFiles();

}
