package edu.myschool.chapter9;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIODemo2 {
    public static void main(String[] args) {
        try {
            // 获取文件输入流
            FileInputStream fileInputStream = new FileInputStream("info.txt");

            // 获取文件通道
            FileChannel fileChannel = fileInputStream.getChannel();

            // 创建缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            // 从通道读取数据到缓冲区
            int bytesRead = fileChannel.read(buffer);

            while (bytesRead != -1) {
                // 切换缓冲区为读模式
                buffer.flip();

                // 处理缓冲区中的数据
                while (buffer.hasRemaining()) {
                    System.out.print((char) buffer.get());
                }

                // 清空缓冲区，为下一次读取做准备
                buffer.clear();

                // 继续从通道读取数据到缓冲区
                bytesRead = fileChannel.read(buffer);
            }

            // 关闭通道和流
            fileChannel.close();
            fileInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
