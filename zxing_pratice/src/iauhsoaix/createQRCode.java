package iauhsoaix;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class createQRCode {
	
	
	public static void main(String[] args) throws WriterException, IOException {
		int height=300,width=300;
		String contents="http://www.baidu.com",format="png";
		HashMap hints=new HashMap();
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
		BitMatrix bitmatrix=new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, width, height,hints);
		Path file=new File("E:/img2.png").toPath();
		MatrixToImageWriter.writeToPath(bitmatrix, format, file);
	}

}
