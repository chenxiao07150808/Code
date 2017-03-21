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

public class CreateCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //¹¹Ôì¶þÎ¬ÂëÐ´ÂëÆ÷
HashMap hashMap = new HashMap();
hashMap.put(EncodeHintType.CHARACTER_SET, "utf-8");
hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);

String content="";
String format="jpg";
int width=300;
int height=300;

try {
	
	BitMatrix bitMatrix=new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height,hashMap);
    Path file=new File("d:/jp.jpg").toPath();
    MatrixToImageWriter.writeToPath(bitMatrix, format, file );
} catch (Exception e) {
	// TODO: handle exception
}

	}

}
