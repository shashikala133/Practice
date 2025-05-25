package com.shashikala.practice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;

@Controller
@ControllerAdvice
public class UploadController {

    @PostMapping("/upload")
    public ResponseEntity<String> upload(@RequestParam("file")MultipartFile file){
        String name= file.getOriginalFilename();
        double size=file.getSize()/1024.0*1024.0;
        String formatSize=String.format("%.2f",size);
        return ResponseEntity.ok("Uploaded "+file+" ("+size + " MB ) successfully ");

    }

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResponseEntity<String> MaxUploadSizeExceededException(MaxUploadSizeExceededException exceededException){
        return ResponseEntity.status(HttpStatus.PAYLOAD_TOO_LARGE).body("maximum file size allowed is exceeded");
    }
}
