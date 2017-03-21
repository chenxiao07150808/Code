package Test1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.ErrorCorrection;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class CreateCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int height=300;
     int width=300;
     String content="我刚上了趟银行，取了无数好运黄金、快乐珠宝、平安翡翠、成功股票、健康基金。别作声，统统送给大家。，因为我想提“钱” 祝大家中秋节快乐！===     from 晨晓";//在百度输入：有没有比我更帅的人。它回答，对不起，目前没有找到，搞笑吧！
     String formar="jpg";
     
     HashMap hashMap=new HashMap();
     hashMap.put(EncodeHintType.CHARACTER_SET, "utf-8");//中文编码
     hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);//错误等级
     hashMap.put(EncodeHintType.MARGIN, 2);//二维码的边距
     
		try {
			//定义二维码的大小和写入的信息
			BitMatrix bitMatrix=new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height,hashMap);
		     Path file=new File("d:/xiao2.jpg").toPath();//定义文件的生成的地址
		     MatrixToImageWriter.writeToPath(bitMatrix, formar, file);//内容写入二维码中
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

     
	}

}
