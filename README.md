PDF Reader ANE for Android
======================================

PDFReaderANE - PDF Reader Native Extension for Android applications using PDF installed Application

Version
---------

This is version 1.0 of this extension.

Extension ID
---------
```
<extensionID>com.janumedia.ane.pdfreader</extensionID>
```

Usage
---------

```
var pdfFile = File.documentsDirectory.resolvePath("download/mypdf-file.pdf");
// note : make sure to put your pdf to accessable path, usually inside documentsDirectory
var pdfReader:PDFReader = new PDFReader();
// check if it has PDF applicaton installed
pdfReader.hasPDFApplication(pdfFile);
// will return true if it has PDF application installed
// will return false if no PDF application installed
// open with default PDF installed application
pdfReader.openPDF(pdfFile);
// will return 4 types of string 
// PDFReader.SUCCESS when succcesfully open PDF application selection intent
// PDFReader.ERROR_NO_DEFAULT_APP when no PDF application installed
// PDFReader.ERROR when open intent failed
// PDFReader.FILE_NOT_FOUND when in correct file path
```

Make sure to add this permission on your manifest file:

```
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
```

Author
---------

This ANE has been writen by [I Nengah Januartha](https://github.com/janumedia). It belongs to [JanuMedia Inc.](http://www.janumedia.com) and is distributed under the [Apache Licence, version 2.0](http://www.apache.org/licenses/LICENSE-2.0).