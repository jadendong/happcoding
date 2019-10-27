package com.jadendong.happycoding.lambda.file;

import java.io.*;
import java.util.function.Consumer;

/**
 * 文件服务类
 *
 * @author jaden dong
 */
public class FileService {

    /**
     * 通过 url 获取本地文件内容，调用函数式接口处理
     *
     * @param url
     * @param fileConsumer
     */
    public void fileHandler(String url, FileConsumer fileConsumer) throws IOException {

        // 创建文件读取流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(url)));

        String line;
        StringBuilder stringBuilder = new StringBuilder();

        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line + "\n");
        }

        fileConsumer.fileHandler(stringBuilder.toString());
    }
}
