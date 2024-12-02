interface Document {
    void open();
}

class PdfDocument implements Document {
    @Override
    public void open(){
        System.out.println("open pdf");
    }
}

class DocxDocument implements Document {
    @Override
    public void open(){
        System.out.println("open docx");
    }
}

abstract class AbstractDocumentFactory {
    public abstract Document CreateUniqDocument();
    public Document CreateDocument(){
        Document doc = CreateUniqDocument();
        System.out.println("processing template for creating all objects");
        return doc;
    }
}

class PdfDocumentFactory extends AbstractDocumentFactory {
    @Override
    public Document CreateUniqDocument() {
        Document doc = new PdfDocument();
        System.out.println("process pdf create");
        return doc;
    }
}

class DocxDocumentFactory extends AbstractDocumentFactory {
    @Override
    public Document CreateUniqDocument() {
        Document doc = new DocxDocument();
        System.out.println("process docx create");
        return doc;
    }
}

public class Factory {
    private static Document createDocument(String type) {
        AbstractDocumentFactory factory;
        switch (type.toLowerCase()) {
            case "pdf":
                factory = new PdfDocumentFactory();
                return factory.CreateDocument();
            case "docx":
                factory = new DocxDocumentFactory();
                return factory.CreateDocument();
            default:
                throw new IllegalArgumentException("Неизвестный тип документа: " + type);
        }
    }

    public static void main(String[] args){
//        Document doc1 = createDocument("pdf");
//        doc1.open();
//        Document doc2 = createDocument("docx");
//        doc2.open();
        Document doc3 = createDocument("docx");
    }
}
