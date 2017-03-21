package Test1;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class CreatCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int width=400;
    int height=400;
    String format="jpg";
    String content="https://www.baidu.com/";
    

    HashMap hints=new HashMap();
    hints.put(EncodeHintType.CHARACTER_SET,"utf-8");//设置中文编码
    hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);//设置错误等级
    hints.put(EncodeHintType.MARGIN, 2);//二维码的外边框
   
    try {
		BitMatrix bitMatrix=new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height);
	  Path file=new File("D:/baidu.jpg").toPath();//定义二维码文件
		MatrixToImageWriter.writeToPath(bitMatrix, format, file);//生成二维码
    } catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}

}
