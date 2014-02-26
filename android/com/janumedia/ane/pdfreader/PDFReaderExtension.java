package com.janumedia.ane.pdfreader;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class PDFReaderExtension implements FREExtension {

	@Override
	public FREContext createContext(String arg0) {
		return new PDFReaderContext();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

}
