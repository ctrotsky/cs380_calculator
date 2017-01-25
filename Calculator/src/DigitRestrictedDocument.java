
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import javax.swing.text.SimpleAttributeSet;

public final class DigitRestrictedDocument extends PlainDocument {

    private boolean readyToClear = false;
    
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (readyToClear){
            readyToClear = false;
            this.remove(0, getLength());  
        }      
        if (str == null)
            return;

        if ((str.charAt(0) == '-'  && !getText(0, getLength()).contains("-"))  || (str.charAt(0) >= 48 && str.charAt(0) <= 57) || (str.charAt(0) == '.' && !getText(0, getLength()).contains("."))) {
            super.insertString(offs, str, a);
        }
    }
    
    public void overrideText(String str) throws BadLocationException{
        super.insertString(0, str, new SimpleAttributeSet());
    }
    
    public void setReadyToClear() {
        readyToClear = true;
    }
    
    
}
