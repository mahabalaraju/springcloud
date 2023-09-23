package com.uploaddownload.service;

import java.io.IOException;
import java.nio.file.spi.FileTypeDetector;
import java.util.Optional;

import javax.swing.filechooser.FileNameExtensionFilter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.uploaddownload.Exception.FileNotFoundException;
import com.uploaddownload.Model.Product;
import com.uploaddownload.Repository.repository;

@Service
public class UploadService {
	@Autowired
	private repository repo;

	public String uploadfile(MultipartFile file) throws IOException {
		Product product = repo.save(
				Product.builder().name(file.getName()).filetype(file.getContentType()).data(file.getBytes()).build());
		if (product != null) {
			return "file uploaded successfully:" + file.getName();
		}
		else {
			throw new FileNotFoundException("no file uploaded!!!");
		}
	}

	public byte[] downloadfile(String filename) {
		Optional<Product> data = repo.findByName(filename);
		byte[] file = data.get().getData();
		return file;
	}
}