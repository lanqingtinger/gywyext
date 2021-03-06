package com.mvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.entityReport.Files;
import com.mvc.repository.FileRepository;
import com.mvc.service.FileService;

/**
 * 文件管理业务实现
 * 
 */
@Service("fileServiceImpl")
public class FileServiceImpl implements FileService {

	@Autowired
	FileRepository fileRepository;

	// 添加文件
	@Override
	public Boolean addFile(Files file) {
		Files result = fileRepository.saveAndFlush(file);
		if (result.getFile_id() != null)
			return true;
		else
			return false;
	}

}
