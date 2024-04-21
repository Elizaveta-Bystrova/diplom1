package com.ivpek.service;

import org.springframework.core.io.FileSystemResource;
import com.ivpek.entity.AppDocument;
import com.ivpek.entity.AppPhoto;
import com.ivpek.entity.BinaryContent;

public interface FileService {
    AppDocument getDocument(String id);
    AppPhoto getPhoto(String id);
    FileSystemResource getFileSystemResource(BinaryContent binaryContent);
}
