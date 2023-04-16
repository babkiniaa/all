package org.example;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOFile implements File{
    @Override
    public void fileWrite(String fname, String info) throws IOException {
        try {
            FileChannel out = FileChannel.open(Paths.get(fname), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            int ch=0;
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while (ch<info.length()){
                buffer.put(String.valueOf(info.charAt(ch)).getBytes(StandardCharsets.UTF_8));
                buffer.flip();
                out.write(buffer);
                buffer.clear();
                ch++;
            }
            out.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    @Override
    public String fileRead(String fname) {
        try {
            String data = "";
            data = new String(Files.readAllBytes(Paths.get(fname)));
            return data;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

