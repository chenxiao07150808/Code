

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
		String text = "TO:һ���羰             ��(^O^) �������뵽���ĵ���˵�����������õ���ʱ�䵽���ҵ�����ף����ȫ�������յ�����Ϧ����!΢Ц����!(^O^) �                           --FROM:����            ����һ������¾��� ";  //�ڰٶ����룺��û�б��Ҹ�˧���ˡ����ش𣬶Բ���Ŀǰû���ҵ����������뵽���ĵ���˵�����������õ���ʱ�䵽���ҵ�����ף����ȫ�������յ�����Ϧ����!΢Ц����!
        int width = 300;  
        int height = 300;  
        //��ά���ͼƬ��ʽ  
        String format = "jpg";  
        Hashtable hints = new Hashtable();  
        //������ʹ�ñ���  
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
        //���ɶ�ά��  
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   
	}

}
