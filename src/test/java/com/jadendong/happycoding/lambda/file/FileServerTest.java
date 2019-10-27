package com.jadendong.happycoding.lambda.file;

import org.junit.Test;

import java.io.IOException;

/**
 * @author jaden dong
 */
public class FileServerTest {

    /**
     * 通过lambda表达式，打印文件内容
     *
     * @throws IOException
     */
    @Test
    public void fileHandle() throws IOException {
        FileService fileService = new FileService();
        fileService.fileHandler("D:\\github\\happycoding\\src\\test\\java\\com\\jadendong\\happycoding\\lambda\\file\\FileServerTest.java", fileContent -> {
            //
            System.out.println(fileContent);
        });
    }
}
