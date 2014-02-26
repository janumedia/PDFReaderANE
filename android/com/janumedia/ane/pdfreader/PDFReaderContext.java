package com.janumedia.ane.pdfreader;

import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;

public class PDFReaderContext extends FREContext {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, FREFunction> getFunctions() {
		
		Map<String, FREFunction> map = new HashMap<String, FREFunction>();
		map.put("openPDF", new PDFReaderFunction());
		map.put("hasPDFApplication", new PDFReaderDetectionAppFunction());
		
		return map;
	}

}
