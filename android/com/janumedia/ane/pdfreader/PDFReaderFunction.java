package com.janumedia.ane.pdfreader;

import java.io.File;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;

public class PDFReaderFunction implements FREFunction {

	private static final String PDF_MIME_TYPE = "application/pdf";
	private static final String SUCCESS = "SUCCESS";
	private static final String ERROR_NO_DEFAULT_APP = "ERROR_NO_DEFAULT_APP";
	
	@Override
	public FREObject call(FREContext context, FREObject[] args) {
		
		try {
			
			String filePath = args[0].getAsString();
			File pdfFile = new File(filePath);
			
			Uri fileUri = Uri.fromFile(pdfFile);
			Intent intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(fileUri, PDF_MIME_TYPE);
			
			try
			{
				context.getActivity().startActivity(intent);
				
				return FREObject.newObject(SUCCESS);
				
			} catch(ActivityNotFoundException e)
			{
				return FREObject.newObject(ERROR_NO_DEFAULT_APP);
			}
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (FRETypeMismatchException e) {
			e.printStackTrace();
		} catch (FREInvalidObjectException e) {
			e.printStackTrace();
		} catch (FREWrongThreadException e) {
			e.printStackTrace();
		}
				
		return null;
	}

}
