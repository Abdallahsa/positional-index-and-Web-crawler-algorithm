import java.util.Vector;

/**
 * Posting: entity class to deal as linked list
 * 
 * next: pointer to the next
 * docId: id for the document
 * dtf: document term frequency
*/
public class Posting {
    Posting next = null;
    int docId;
    String docName="unknown";
    int dtf = 1;
    Vector<Integer>byteOffset=new Vector<>();
}