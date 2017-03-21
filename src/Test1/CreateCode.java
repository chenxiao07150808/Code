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
     String content="�Ҹ����������У�ȡ���������˻ƽ𡢿����鱦��ƽ����䡢�ɹ���Ʊ���������𡣱�������ͳͳ�͸���ҡ�����Ϊ�����ᡰǮ�� ף�������ڿ��֣�===     from ����";//�ڰٶ����룺��û�б��Ҹ�˧���ˡ����ش𣬶Բ���Ŀǰû���ҵ�����Ц�ɣ�
     String formar="jpg";
     
     HashMap hashMap=new HashMap();
     hashMap.put(EncodeHintType.CHARACTER_SET, "utf-8");//���ı���
     hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);//����ȼ�
     hashMap.put(EncodeHintType.MARGIN, 2);//��ά��ı߾�
     
		try {
			//�����ά��Ĵ�С��д�����Ϣ
			BitMatrix bitMatrix=new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height,hashMap);
		     Path file=new File("d:/xiao2.jpg").toPath();//�����ļ������ɵĵ�ַ
		     MatrixToImageWriter.writeToPath(bitMatrix, formar, file);//����д���ά����
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

     
	}

}
