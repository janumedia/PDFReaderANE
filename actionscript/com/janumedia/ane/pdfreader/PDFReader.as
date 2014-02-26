package com.janumedia.ane.pdfreader
{
	import flash.external.ExtensionContext;
	import flash.filesystem.File;
	
	public class PDFReader
	{
		public static const VERSION:String = "1.0";
		public static const SUCCESS:String = "SUCCESS";
		public static const ERROR:String = "ERROR";
		public static const ERROR_NO_DEFAULT_APP:String = "ERROR_NO_DEFAULT_APP";
		public static const FILE_NOT_FOUND:String = "FILE_NOT_FOUND";
		
		private static var _context:ExtensionContext;
		
		public function PDFReader ()
		{
			if (!_context)
			{
				_context = ExtensionContext.createExtensionContext("com.janumedia.ane.pdfreader", null);
			}
		}
		
		public function hasPDFApplication (file:File) : Boolean
		{
			if (file.exists)
			{
				if (file.nativePath != "")
				{
					return _context.call("hasPDFApplication", file.nativePath);
				} else 
				{
					throw(new Error("Incorrect File Path!"));
				}
			} else
			{
				throw(new Error(file.nativePath + " not found!"));
			}
			
			return false;
		}
		
		public function openPDF (file:File) : String
		{
			if (file.exists) return String (_context.call("openPDF", file.nativePath));
			
			return FILE_NOT_FOUND;
		}
	}
}