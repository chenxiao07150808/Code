

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Hashtable;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class CreatCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "TO:一处风景             ★(^O^) 听到～想到～心到，说到～做到～得到，时间到～我的美好祝福已全部让你收到。七夕快乐!微笑甜甜!(^O^) ★！                           --FROM:辰曉            二〇一六年八月九日 ";  //在百度输入：有没有比我更帅的人。它回答，对不起，目前没有找到！听到～想到～心到，说到～做到～得到，时间到～我的美好祝福已全部让你收到。七夕快乐!微笑甜甜!
        int width = 300;  
        int height = 300;  
        //二维码的图片格式  
        String format = "jpg";  
        Hashtable hints = new Hashtable();  
        //内容所使用编码  
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");  
        BitMatrix bitMatrix;
		try {
			bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height, hints);
			File outputFile = new File("d:/new5.jpg");  
			MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);  
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        //生成二维码  
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   
	}

}
