package com.company.characterio;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by pingheYUshengji on 2020/4/4.
 */
public class $10MyLineNumberReaderDemo implements AutoCloseable {

    private Reader reader;

    private int lineNum = 0;

    public int getLineNum() {
        return lineNum;
    }

    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }

    $10MyLineNumberReaderDemo(Reader r) {
        this.reader = r;
    }

    public String readLine() throws IOException {
        StringBuffer sb = new StringBuffer();

        int ch = 0;

        while ((ch = reader.read()) != -1) {
            if (lineNum == 0) {lineNum++;}
            char chart = (char) ch;

            switch (chart) {
                case '\r':
                    continue;
                case '\n':
                    lineNum ++;
                    return sb.toString();
                default:
                    sb.append(chart);
                    break;
            }
        }

        if (sb.length() != 0) {
            return sb.toString();
        }

        return null;
    }

    @Override
    public void close() throws Exception {

    }

    //自定义一个缓冲区类
    public static void main(String[] args) {

        try($10MyLineNumberReaderDemo lineNumberReader = new $10MyLineNumberReaderDemo(new FileReader("catalog"))) {

            lineNumberReader.setLineNum(100);
            String line = null;

            while ((line = lineNumberReader.readLine()) != null) {
                System.out.println(lineNumberReader.getLineNum() + ":" + line);
            }

        } catch (Exception e) {}
    }
}
