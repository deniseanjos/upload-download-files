package com.project.uploaddownloadfiles.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.project.uploaddownloadfiles.model.Doc;
import com.project.uploaddownloadfiles.repository.DocRepository;
import com.project.uploaddownloadfiles.service.DocService;

@Service
public class DocServiceImpl implements DocService {
	
	@Autowired
	private DocRepository docRepository;
	
	@Override
	public Doc saveFile(MultipartFile file) {
		String docName = file.getOriginalFilename();
		try {
			Doc doc = new Doc(docName, file.getContentType(), file.getBytes());
			return docRepository.save(doc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Optional<Doc> getFile(Integer fileId) {
		return docRepository.findById(fileId);
	}
	
	@Override
	public List<Doc> getFiles(){
		return docRepository.findAll();
	}

}
