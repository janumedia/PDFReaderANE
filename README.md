h1. PDF Reader ANE for Android

PDFReaderANE - PDF Reader Native Extension for Android applications using PDF installed Application

h3. Version

This is version 1.0 of this extension.

h3. Binary files

The bin folder contains the compiled extension and the default swc, which can be used for local testing if required by your development environment (Flash Builder shouldn't need it, but other IDEs may).

h3. Building

Requirements - Adobe Air SDK 3.5 or later, Eclipse for Java editor

h3. Extension ID

<extensionID>com.janumedia.ane.pdfreader</extensionID>

h3. Usage

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

h3. Developers

JanuMedia
http://www.janumedia.com/

h2. License

PDF Reader Native Extension for Android

Author: I Nengah Januartha Owner: JanuMedia.
http://www.janumedia.com

Copyright (c) 2014, JanuMedia. All rights reserved.